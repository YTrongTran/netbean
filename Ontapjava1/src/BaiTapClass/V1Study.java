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
public class V1Study {
    private String name;
    private double marks;
    private String noiQuy;
    private String mua;
    
    public V1Study(){
    }

    public V1Study(String name, double marks, String noiQuy, String mua) {
        this.name = name;
        this.marks = marks;
        this.noiQuy = noiQuy;
        this.mua = mua;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getNoiQuy() {
        return noiQuy;
    }

    public void setNoiQuy(String noiQuy) {
        this.noiQuy = noiQuy;
    }

    public String getMua() {
        return mua;
    }

    public void setMua(String mua) {
        this.mua = mua;
    }
    
    public Double hocBong(){
        if (marks >= 7.5) {
            System.out.println("Bạn đã được học bổng");
        }else{
           System.out.println("Bạn không được học bổng");
        }
        return marks;
    }
    public void nhap(){
        Scanner sc   = new Scanner(System.in);
        System.out.printf("Mời bạn nhập họ và tên: ");
        name = sc.nextLine();
 
        System.out.printf("Bạn có vi phạm nội quy không: ");
        noiQuy = sc.nextLine();
        
        System.out.printf("Kì thi bạn đang thi lần đầu tên gì: ");
        mua  = sc.nextLine();  
        
        System.out.printf("Mời bạn nhập điểm: ");
        marks = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Họ và tên: " + name );
        System.out.println("Điểm Tổng kết: " + marks );
        System.out.println("Nội Quy Vi phạm: " + noiQuy );
        System.out.println("Kỳ thi lần đầu : " + mua );
    }
    public static void main(String[] args) {
        V1Study v1 = new V1Study();
        v1.nhap();
        v1.xuat();
        v1.hocBong();
    }
    
    
}
