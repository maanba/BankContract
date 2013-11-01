/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author THL
 */
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private int zip;
    private String city;
    private int phonenumber;
    private ArrayList<Role> roles;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String email, String street, int zip, String city, int phonenumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.phonenumber = phonenumber;
        this.roles = new ArrayList<>();
    }

    public void addRole(Role r) {
        System.out.println("roles " + roles.size());
        System.out.println("addin " + r.getTitle());
        this.roles.add(r);
        System.out.println("roles " + roles.size());
    }

    /**
     * Returns a specific role.
     *
     * @param title
     * @return the role, if the person does not have the role, the return value
     * is null
     */
    public Role getRole(String title) {
        for (int i = 0; i < roles.size(); i++) {
            if (title.equalsIgnoreCase(roles.get(i).getTitle())) {
                return roles.get(i);
            }
        }
        return null;
    }

    public Role getRoleByUserId(String username) {
        for (int i = 0; i < roles.size(); i++) {
            if (username.equals(roles.get(i).getUserId())) {
                return roles.get(i);
            }
        }
        return null;
    }

    public boolean doesContainUserId(String id) {
        for (int i = 0; i < roles.size(); i++) {
            if (id.equals(roles.get(i).getUserId())) {
                return true;
            }
        }
        return false;
    }

    public boolean doesContainUserRole(String role) {
        for (int i = 0; i < roles.size(); i++) {
            if (role.equalsIgnoreCase(roles.get(i).getTitle())) {
                return true;
            }
        }
        return false;
    }

    public String getPasswordFromRole(String id) {
        for (int i = 0; i < roles.size(); i++) {
            if (id.equals(roles.get(i).getUserId())) {
                return roles.get(i).getPassword();
            }
        }
        return null;
    }

    public ArrayList<Account> getAccounts() {
        for (int i = 0; i < roles.size(); i++) {
            if ("customer".equalsIgnoreCase(roles.get(i).getTitle())) {
                Customer c = (Customer) roles.get(i);
                return c.getAccounts();
            }
        }
        return null;
    }


// <editor-fold defaultstate="collapsed" desc="Getter & Setter">    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }
//</editor-fold>
}
