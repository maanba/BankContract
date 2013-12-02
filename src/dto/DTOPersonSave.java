/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@XmlRootElement
public class DTOPersonSave {
    DTOPerson person;
    String username;
    String password;
    String user;

    public DTOPersonSave() {
    }

    
    
    public DTOPersonSave(DTOPerson person, String username, String password, String user) {
        this.person = person;
        this.username = username;
        this.password = password;
        this.user = user;
    }

    public DTOPerson getPerson() {
        return person;
    }

    public void setPerson(DTOPerson person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
}
