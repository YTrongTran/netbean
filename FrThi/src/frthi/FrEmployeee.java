/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frthi;

import java.util.Date;

/**
 *
 * @author trany
 */
public class FrEmployeee {
    private String ID;
    private String Name;
    private boolean Gender;
    private Date Birthday;
    private int Salary;
    private String Department;

    public FrEmployeee() {
    }

    public FrEmployeee(String ID, String Name, boolean Gender, Date Birthday, int Salary, String Department) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Birthday = Birthday;
        this.Salary = Salary;
        this.Department = Department;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    
    
}
