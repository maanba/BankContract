/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Customer extends Role {

    private ArrayList<Account> accounts;

    public Customer(String userName, String password, String title) {
        super(userName, password, title);
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber == accounts.get(i).getAccountnumber()) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public boolean checkAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber == accounts.get(i).getAccountnumber()) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    
}
