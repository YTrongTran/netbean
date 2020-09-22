/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Tran Y
 */
public class User {
    private String userName;
    private String passWord;
    private String fullName;
    private int age;
    private Date birthDay;
    private boolean genDer;

    public User() {
    }

    public User(String userName, String passWord, String fullName, int age, Date birthDay, boolean genDer) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.age = age;
        this.birthDay = birthDay;
        this.genDer = genDer;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
    public String getBirthDay(){
    return commons.DataHelps.toString(birthDay);
    }

//    public Date getBirthDay() {
//        return birthDay;
//    }

    public boolean isGenDer() {
        return genDer;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setGenDer(boolean genDer) {
        this.genDer = genDer;
    }
    

}
