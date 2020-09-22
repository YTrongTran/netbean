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
public class studentUD  extends Student{
    private double UD1;
    private double UD2;

    public studentUD(double UD1, double UD2, int id, String name, double html, double sql) {
        super(id, name, html, sql);
        this.UD1 = UD1;
        this.UD2 = UD2;
    }

    public double getUD1() {
        return UD1;
    }

    public double getUD2() {
        return UD2;
    }

    public studentUD() {
    }

    public void setUD1(double UD1) {
        this.UD1 = UD1;
    }

    public void setUD2(double UD2) {
        this.UD2 = UD2;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("ud1:");
        setUD1(sc.nextDouble());
        System.out.println("ud2:");
        setUD2(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getUD1()+"-"+getUD2()+"-"+avg()+"-"+xeploai(avg()));
    }

    @Override
    public double avg() {
       return (getHtml()+getSql()+getUD1()+getUD2())/4;
    }
    public static void main(String[] args) {
        studentUD ud = new studentUD();
        ud.input();
        ud.output();
        
    }
   
   
    
}
