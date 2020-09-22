/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrStudent;

import java.util.Date;

/**
 *
 * @author trany
 */
public class Student {
    private String mSV;
    private String tSV;
    private Date Ngaysinh;
    private boolean Gioitinh;
    private String phone;
    private String Email;

    public Student() {
    }

    public Student(String mSV, String tSV, Date Ngaysinh, boolean Gioitinh, String phone, String Email) {
        this.mSV = mSV;
        this.tSV = tSV;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.phone = phone;
        this.Email = Email;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String gettSV() {
        return tSV;
    }

    public void settSV(String tSV) {
        this.tSV = tSV;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public boolean isGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
