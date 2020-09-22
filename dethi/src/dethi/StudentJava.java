/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethi;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentJava extends student {
    private int pointJava;
    private int pointSQL;
    public StudentJava(){}

    public StudentJava(int pointJava, int pointSQL, String id, String name, int age, String address) {
        super(id, name, age, address);
        this.pointJava = pointJava;
        this.pointSQL = pointSQL;
    }

    public int getPointJava() {
        return pointJava;
    }

    public void setPointJava(int pointJava) {
        this.pointJava = pointJava;
    }

    public int getPointSQL() {
        return pointSQL;
    }

    public void setPointSQL(int pointSQL) {
        this.pointSQL = pointSQL;
    }
    

    public double doAverage(double m1 , double m2){
   return (m1+m2)/2;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập pointJava: ");
        setPointJava(sc.nextInt());
        System.out.println("nhập pointSQL: ");
        setPointSQL(sc.nextInt());
    }
    @Override
    public void printStudent() {
        super.printStudent(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>" + getPointJava() + "-" + getPointSQL() + " - " + doAverage(getPointJava(), getPointSQL()));
    }
    
    public static void main(String[] args) {
        StudentJava sj = new StudentJava();
        sj.input();
        sj.printStudent();
       
    }
    
}
