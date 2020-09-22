/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.Models;


import java.util.Date;

/**
 *
 * @author Tran Y
 */
public class Users {
    private String username;
    private String password;
    private String fullname;
    private int age;
    private Date birthday;
    private boolean gender;

    public Users() {
    }

    public Users(String username, String password, String fullname, int age, Date birthday, boolean gender) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

   

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", password=" + password + ", fullname=" + fullname + ", age=" + age + ", birthday=" + birthday + ", gender=" + gender + '}';
    }

   
    
}
