/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Mads
 */
public class DTOUser implements Serializable {

    private static final long serialVersionUID = 75264722954213L;
    private String userId;
    private String password;
    private String title;

    public DTOUser() {
    }

    public DTOUser(String userId, String password, String title) {
        this.userId = userId;
        this.password = password;
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
