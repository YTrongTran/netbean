/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhdoituong;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class student {
    //id, name, markjava, markSQL
    //input
    //output
    public void ouput(){
        sum();
        System.out.println("sum:"+sum1(getMarkSQL(),getMarkjava()));
    }
    //tong diem
    public double sum1(double m1, double m2){
   return m1+m2;
        
    
    }
    //diem trung binh
    public double avg(double m1, double m2){
   return (m1+m2)/2;
    }
    //xep loai
    private int id;
    private  String name;
    private int markjava;
    private int markSQL;
    private int tongdiem;
    private int diemtrungbinh;
    private int xeploai;

    public student(int id, String name, int markjava, int markSQL, int tongdiem, int diemtrungbinh, int xeploai) {
        this.id = id;
        this.name = name;
        this.markjava = markjava;
        this.markSQL = markSQL;
        this.tongdiem = tongdiem;
        this.diemtrungbinh = diemtrungbinh;
        this.xeploai = xeploai;
    }

    private student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarkjava() {
        return markjava;
    }

    public int getMarkSQL() {
        return markSQL;
    }

    public int getTongdiem() {
        return tongdiem;
    }

    public int getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public int getXeploai() {
        return xeploai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkjava(int markjava) {
        this.markjava = markjava;
    }

    public void setMarkSQL(int markSQL) {
        this.markSQL = markSQL;
    }

    public void setTongdiem(int tongdiem) {
        this.tongdiem = tongdiem;
    }

    public void setDiemtrungbinh(int diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public void setXeploai(int xeploai) {
        this.xeploai = xeploai;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("name:");
        setName(sc.next());
        System.out.println("markjava:");
        setMarkjava(sc.nextInt());
        System.out.println("markSQL:");
        setMarkSQL(sc.nextInt());
        setTongdiem(getMarkSQL()+getMarkjava());
        setDiemtrungbinh(getTongdiem()/2);
        setXeploai(xeploai);
        
     
    }
    public static void main(String[] args) {
        student p1 = new student();
        p1.input();
    }

    private void sum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
