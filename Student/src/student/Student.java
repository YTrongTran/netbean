/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class Student {

 private int id;
 
 private String name;
 private double html;

    public Student(int id, String name, double html, double sql) {
        this.id = id;
        this.name = name;
        this.html = html;
        this.sql = sql;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public void setSql(double sql) {
        this.sql = sql;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHtml() {
        return html;
    }

    public double getSql() {
        return sql;
    }
 private double sql;
 public Student(){
 
 }
 public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
                setId(sc.nextInt());
                System.out.println("name:");
     setName(sc.next());
     System.out.println("html:");
     setHtml(sc.nextDouble());
     System.out.println("sql");
     setSql(sc.nextDouble());
    }
public void output() {
        System.out.println("=>"+getId()+"-"+getName()+"-"
                +getHtml()+"-"+getSql());
    
    }
public String xeploai(double avg){
String xl="";
    if (avg >=8) {
        xl="Gioi";
    } else {
        if (avg >=6.5) {
            xl="kha";
        } else {
            if (avg >=5) {
                xl="trung binh";
            }
        }
    }
    return xl;
}
public abstract double avg();
    public static void main(String[] args) {
        Student st = new Student() {
            @Override
            public double avg() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
   
}

    

