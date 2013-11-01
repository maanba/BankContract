/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.AccountTypes;

import entities.Account;

/**
 *
 * @author Mads
 */
public class CheckingAccount extends Account {

    
    
    public CheckingAccount(int accountNumber) {
        super.accountType = "Checking Account";
        super.accountnumber = accountNumber;
    }    
}
