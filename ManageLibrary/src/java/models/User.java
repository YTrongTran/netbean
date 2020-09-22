/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Tran Y
 */
public class User {
    private String username;
    private String password;
    private String fullname;
    private int age;
    private boolean gender;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", fullname=" + fullname + ", age=" + age + ", gender=" + gender + '}';
    }

    
    public User(String username, String password, String fullname, int age, boolean gender) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
    
    
}
