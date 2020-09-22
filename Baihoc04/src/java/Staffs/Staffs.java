/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staffs;

import DeParts.Departs;
import java.util.Date;

/**
 *
 * @author Tran Y
 */
public class Staffs {
    private String id;
    private String name;
    private String email;
    private boolean gender;
    private Date birthday;
    private String photo;
    private String phone;
    private Float salary;
    private DeParts.Departs departsid;

    public Staffs() {
    }

    public Staffs(String id, String name, String email, boolean gender, Date birthday, String photo, String phone, Float salary, Departs departsid) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.photo = photo;
        this.phone = phone;
        this.salary = salary;
        this.departsid = departsid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Departs getDepartsid() {
        return departsid;
    }

    public void setDepartsid(Departs departsid) {
        this.departsid = departsid;
    }

    @Override
    public String toString() {
        return "Staffs{" + "id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", birthday=" + birthday + ", photo=" + photo + ", phone=" + phone + ", salary=" + salary + ", departsid=" + departsid + '}';
    }
    
   
}
