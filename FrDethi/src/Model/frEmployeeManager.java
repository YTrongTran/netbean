/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author trany
 */
public class frEmployeeManager {
    private String Id;
    private String Name;
    private boolean gender;
    private Date Birthday;
    private int Salary;
    private String Department;

    public frEmployeeManager() {
    }

    @Override
    public String toString() {
        return this.Name;
    }

    public frEmployeeManager(String Id, String Name, boolean gender, Date Birthday, int Salary, String Department) {
        this.Id = Id;
        this.Name = Name;
        this.gender = gender;
        this.Birthday = Birthday;
        this.Salary = Salary;
        this.Department = Department;
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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
