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
public class Student1 {
     //id, name, markjava, markSQL
    private int id;
    private String name;
    private int markjava;
    private int markSQL;
    
    
    public Student1(int id, String name, int markjava, int markSQL) {
        this.id = id;
        this.name = name;
        this.markjava = markjava;
        this.markSQL = markSQL;
    }

    private Student1() {
     
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
    //input
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("name:");
        setName(sc.next());
        System.out.println("markjava");
        setMarkjava(sc.nextInt());
        System.out.println("markSQL");
        setMarkSQL(sc.nextInt());
    }
    //output
    public void output(){
        System.out.println("sum" + sum1(getMarkSQL(), getMarkjava()));
        System.out.println("=>"+ getId() + "-" + getName() + "-" + getMarkSQL() + "-" + getMarkjava());
    
    }
    
     //tong diem
    public double sum1(double m1, double m2) {
        return m1+m2;
       
      
    }
     //diem trung binh
    public  double avg (double m1, double m2){
        avg = (m1+m2)/2;
        return avg;
    }
     //xep loai

    public static void main(String[] args) {
        Student1 sd = new Student1();
        sd.input();
       sd.output();
    }


    
   
}
