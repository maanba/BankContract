/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Thomas
 */
public abstract class Role {

    protected String userId;
    protected String password;
    protected String title;

    public Role(String userName, String password, String title) {
        this.userId = userName;
        this.password = password;
        this.title = title;
    }

    // <editor-fold defaultstate="collapsed" desc="Getter & Setter">  
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userName) {
        this.userId = userName;
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
//</editor-fold>    
}
