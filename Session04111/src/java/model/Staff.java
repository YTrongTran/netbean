/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LAptop
 */
public class Staff {
    private String id;
    private Date birthday;
    private String email;
    private boolean gender;
    private String name;
    private String note;
    private String phone;
    private String photo;
    private Double salary;
    private Departs depart;

    public Staff() {
    }

    public Staff(String id, Date birthday, String email, boolean gender, String name, String note, String phone, String photo, Double salary, Departs depart) {
        this.id = id;
        this.birthday = birthday;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.note = note;
        this.phone = phone;
        this.photo = photo;
        this.salary = salary;
        this.depart = depart;
    }

    public Staff(String string, String string0, String string1, boolean b, Date now, String string2, String string3, double d, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Departs getDepart() {
        return depart;
    }

    public void setDepart(Departs depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "Staffs{" + "id=" + id + ", birthday=" + birthday + ", email=" + email + ", gender=" + gender + ", name=" + name + ", note=" + note + ", phone=" + phone + ", photo=" + photo + ", salary=" + salary + ", depart=" + depart + '}';
    }

  
}