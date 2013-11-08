/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contract;

import dto.DTOAccount;
import dto.DTOPerson;
import dto.DTOPersonDetail;
import java.util.ArrayList;
import javax.ejb.Remote;

/**
 *
 * @author Thomas
 */
@Remote
public interface BankInterface {
    public String sayHello(String name);
    
    public DTOPerson getPerson(int id);
    
    public DTOPersonDetail getPersonDetail(int id);

    public ArrayList<String> getRoles();

    public ArrayList<DTOAccount> getAccounts();

    public ArrayList<DTOPerson> getPersonsByRole(String role);

    public DTOAccount getAccountByAccountnumber(int accountnumber);

    public DTOPersonDetail getPersonByUserId(String userId);

    public DTOPerson getPersonByAccountNumber(int accountNumber);

    public boolean checkLogin(String username, String password);

    public void saveTransaction(int fromAccountNumber, int toAccountNumber, long amount, String comment);

    public void savePhysicalTransaction(int AccountNumber, long amount, String comment);

    public int getNextPersonId();

    public ArrayList<String> getAccountTypes();
    
    public void saveAccount(int userId, String type, double intrest);
    
    public void savePerson(String role, String password, DTOPerson person);
}
