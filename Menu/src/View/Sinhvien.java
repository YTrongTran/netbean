/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author trany
 */
public class Sinhvien {
    private String maSV;
    private String tenSV;
    private String phone;
    private String email;
    private boolean gioitinh;
    private String diachi;
    private String images;

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String tenSV, String phone, String email, boolean gioitinh, String diachi, String images) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.phone = phone;
        this.email = email;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.images = images;
    }

    public Sinhvien(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    

    @Override
    public String toString() {
        return this.tenSV ;
        
    }
    

    
    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    
            
    
}
