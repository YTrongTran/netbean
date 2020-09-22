/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiftap.ontap.baithi;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentJava extends Student{
    private double pointJava, pointSQL;

    public StudentJava(){
    super();
    }
    public StudentJava(double pointJava, double pointSQL, String id, String name, String address, int age) {
        super(id, name, address, age);
        this.pointJava = pointJava;
        this.pointSQL = pointSQL;
    }

    public double getPointJava() {
        return pointJava;
    }

    public void setPointJava(double pointJava) {
        this.pointJava = pointJava;
    }

    public double getPointSQL() {
        return pointSQL;
    }

    public void setPointSQL(double pointSQL) {
        this.pointSQL = pointSQL;
    }

    @Override
    public void inputStudent() {
        super.inputStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm JAVA: ");
        setPointJava(sc.nextDouble());
        System.out.println("nhập điểm SQL: ");
        setPointSQL(sc.nextDouble());
        
        
    }
    public double doAverage(double m1, double m2){
    return (m1+m2)/2;
    }

    @Override
    public void printStudent() {
        super.printStudent(); 
        System.out.println("kết quả: " + "Điểm JAVA là " + getPointJava() + " || " 
                + " Điểm SQL là " + getPointSQL() 
        + " || " + " Điểm trung bình là " + doAverage( getPointJava(), getPointSQL()));
    }
    public static void main(String[] args) {
        StudentJava sj = new StudentJava();
        sj.inputStudent();
        sj.printStudent();
    }
    
}
