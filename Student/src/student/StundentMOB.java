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
public class StundentMOB extends Student {
    private  double android1;
     private  double android2;

    public StundentMOB(double android1, double android2, int id, String name, double html, double sql) {
        super(id, name, html, sql);
        this.android1 = android1;
        this.android2 = android2;
    }

    public double getAndroid1() {
        return android1;
    }

    public double getAndroid2() {
        return android2;
    }

    public StundentMOB() {
    }

    public void setAndroid1(double android1) {
        this.android1 = android1;
    }

    public void setAndroid2(double android2) {
        this.android2 = android2;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("android1");
        setAndroid1(sc.nextDouble());
        System.out.println("android2");
        setAndroid2(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getAndroid1()+"-"+getAndroid2()+"-"+avg()+"-"+xeploai(avg()));
    }

    @Override
    public double avg() {
        return  ( getHtml()+getSql()+getAndroid1()+getAndroid2())/4;
    }
     public static void main(String[] args) {
         StundentMOB mob= new StundentMOB();
         mob.input();
         mob.output();
        
    }
}
