package entities.AccountTypes;

import entities.Account;
import entities.Transaction;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Mads
 */
public class TimeDepositAccount extends Account {

    private Date lockPeriodStart;
    private Date lockPeriodEnd;
    private boolean locked;
    private long penalty;

    public TimeDepositAccount(int accountNumber) {
        super.accountType = "Time Deposit Account";
        super.transactions = new HashMap<>();
        super.accountnumber = accountNumber;
        super.balance = (long) 0.0;
        super.created = new Date();
        locked = false;
    }

    /**
     * Checks if the account is locked.
     *
     * @return boolean
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Locks the account if it is not already locked, and the start and end are
     * sat correctly for the period. A period must be longer than 3 months.
     *
     * @return boolean true if corretly locked, otherwise exceptions
     * @throws IllegalStateException
     */
    public boolean lock() throws IllegalStateException {
        isNotLocked();
        if (lockPeriodStart != null && lockPeriodEnd != null) {
            this.locked = true;
            return true;
        } else {
            String msg = "Could not lock account " + accountnumber
                    + "!" + " Lockperiod not defined properly.";
            throw new IllegalStateException(msg);
        }
    }

    /**
     * Unlocks the account if it is locked. If the agreed timeperiod has passed,
     * the customer is awarded (NOT IMPLEMENTED) and if not, the customer is
     * fined by the given penalty.
     *
     * @throws IllegalStateException
     */
    public void revokeLock() throws IllegalStateException {
        if (locked) {
            locked = false;

            // Hvis tidsperiode IKKE er overstået, så vanker der!
            long passedTime = new Date().getTime() - lockPeriodStart.getTime();
            long timePeriod = lockPeriodEnd.getTime() - lockPeriodStart.getTime();

            // Penalty!
            if (passedTime < timePeriod) {
                System.out.println("Timeperiod not completed. Penalty is given!!!");

                // Bøde
                balance = balance - penalty;

                // Byg transaktion
                int transId = (accountnumber + 5);
                Transaction transaction =
                        new Transaction(accountnumber, this, balance,
                        "Account Unlocked - Penalty for early revoke.");

                super.transactions.put(accountnumber + (int) new Date().getTime(), transaction);

                // Nulstil kontoattributter
                this.lockPeriodStart = null;
                this.lockPeriodEnd = null;
                this.penalty = 0;

            } else {
                // Der skal gives renter osv. her...
                System.out.println("Timeperiod completed. Now the customer should be rewarded... !");
            }
        } else {
            throw new IllegalStateException("Unable to revoke lock. Account is not locked!");
        }
    }

    public Date getInitialLockperiodDate() {
        return lockPeriodStart;
    }

    public void setInitialLockperiodDate(Date initialLockperiodDate) throws IllegalArgumentException {
//        checkLockState();
        if (initialLockperiodDate == null) {
            throw new IllegalArgumentException("InitialLockperiodDate cannot be null.");
        }
        this.lockPeriodStart = initialLockperiodDate;
    }

    public Date getLockPeriodEnd() {
        return lockPeriodEnd;
    }

    public void setLockPeriodEnd(Date lockPeriodEnd) throws IllegalArgumentException {
//        checkLockState();
        long threeMonths = ((1000 * 60 * 60 * 24) * 90);
        if (lockPeriodEnd == null) {
            throw new IllegalArgumentException("LockPeriodEnd cannot be null.");
        }
        if (lockPeriodEnd.getTime() - lockPeriodStart.getTime() < threeMonths) {
            throw new IllegalArgumentException("End of the lockperiod, must be at least 3 months!");
        } else {
            this.lockPeriodEnd = lockPeriodEnd;
        }
    }

    public long getPenalty() {
        return penalty;
    }

    public void setPenalty(long penalty) throws IllegalArgumentException {
//        checkLockState();
        if (penalty < 0.0) {
            throw new IllegalArgumentException("Penalty cannot be negative!");
        } else {
            this.penalty = penalty;
        }
    }

    @Override
    public void addDepositTransaction(Transaction t) throws IllegalStateException {
        isNotLocked();
        super.addDepositTransaction(t);

    }

    @Override
    public void setInterest(double interest) throws IllegalStateException {
        isNotLocked();
        super.setInterest(interest);

    }

    /**
     * Checks if the account is currently locked. If yes, throw Exception.
     *
     * @return false if account is not locked
     */
    private boolean isNotLocked() throws IllegalStateException {
        if (locked) {
            throw new IllegalStateException("Account " + accountnumber + " is locked!");
        } else {
            return true;
        }
    }
}
