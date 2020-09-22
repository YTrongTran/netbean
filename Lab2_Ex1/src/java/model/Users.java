/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tran Y
 */
public class Users {
    private String username;
    private String password;
    private String name;
    private boolean gender;

    public Users() {
    }

    public Users(String username, String password, String name, boolean gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", password=" + password + ", name=" + name + ", gender=" + gender + '}';
    }
    
    
}
