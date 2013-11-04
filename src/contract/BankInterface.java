/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contract;

import entities.Account;
import entities.Person;
import java.util.ArrayList;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author Thomas
 */
@Remote
public interface BankInterface {
    public String sayHello(String name);
    
    public Map<Integer, Person> getPersons();

    public Person getPerson(int id);

    public ArrayList<String> getRoles();

    public ArrayList<Account> getAccounts();

    public ArrayList<Person> getPersonsByRole(String role);

    public Account getAccountByAccountnumber(int accountnumber);

    public Person getPersonByUserId(String userId);

    public Person getPersonByAccountNumber(int accountNumber);

    public boolean checkLogin(String username, String password);

    public void saveTransaction(int fromAccountNumber, int toAccountNumber, long amount, String comment);

    public void savePhysicalTransaction(int AccountNumber, long amount, String comment);

    public int getNextPersonId();

    public ArrayList<String> getAccountTypes();
    
    public void saveAccount(int userId, String type, double intrest);
    
    public void savePerson(String role, String password, Person person);
}
