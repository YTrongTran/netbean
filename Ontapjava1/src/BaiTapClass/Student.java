/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapClass;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class Student {
    
    private int maSV;
    private float diem;
    private int age;
    private String lop;
    
    public Student() {
    }

    public Student(int maSV, float diem, int age, String lop) {
        this.maSV = maSV;
        this.diem = diem;
        this.age = age;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
  
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Nhập Thông Tin Mã Sinh Viên: ");
            
            if ((maSV = sc.nextInt()) >=0 ||(maSV = sc.nextInt()) <= 8 ) {
                System.out.println("Bạn đã nhập đúng");
                break;
            } else {
                System.out.println("Bạn đã nhập sai");
            }
            
        } while (true);
        
        do {
            System.out.printf("Nhập Thông Tin Lớp: ");
            if (((lop = sc.nextLine()).equals("A") || (lop = sc.nextLine()).equals("C")) ) {
                System.out.println("Bạn đã nhập đúng");
                 break;
            } else {
                System.out.println("Bạn đã nhập sai");
           }
        } while (true);
        do {   
            System.out.printf("Nhập Thông Tin Tuổi: ");
            if ( (age = sc.nextInt()) >= 18) {
                System.out.println("Bạn đã Nhập Đúng");
                 break;
            }else{
                System.out.println("Bạn Đã Nhập Sai");
            }
        } while (true);
        
        do { 
            System.out.printf("Nhập Thông Tien Điểm Trung Bình: ");
            if ((diem = sc.nextFloat()) >=0.0 && (diem = sc.nextFloat()) <=10.0 ) {
                System.out.println("Bạn đã nhập đúng");
                break;
            }else{
                System.out.println("Bạn đã nhập sai");
            }
        } while (true);
       
    }

    public Float xemXet() {
        if (diem >= 8.0 ) {
            System.out.println("được học bổng");
        } else {
            System.out.println("không được học bổng");
        }
        return diem;
    }

    public void outputInfo() {
        System.out.println("Mã Sinh Viên là: " + maSV);
        System.out.println("Điểm Trung Bình là: " + diem);
        System.out.println("Tuổi Sinh Viên là: " + age);
        System.out.println("Lớp Của Sinh Viên là: " + lop);
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.outputInfo();
        student.xemXet();
    }
}
