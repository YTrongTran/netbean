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
public class Employee {

    private int id;
    private String name;
    private double salary;
    //input
    //ouput

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");

        setId(sc.nextInt());
//        sc =new Scanner(System.in);
        System.out.println("name:");

        setName(sc.next());
//        sc =new Scanner(System.in);
        System.out.println("salary:");
        setSalary(sc.nextDouble());

    }

    public void ouput() {
        System.out.println("=>" + getId() + "-" + getName() + "-" + getSalary() + "-" + (salary - gettax(salary)));

    }

    public double getTax(double salary) {
        double tax =0;
        if (salary <= 9000) {
            tax = 0;
        } else if (salary <= 12000) {
                tax = getTax(9000) + (salary - 9000) * 0.1;
            } else if (salary <= 15000) {
                    tax = getTax(9000) + getTax(12000) + (salary - 12000) * 0.15;
                } else {
                    tax = getTax(9000) + getTax(12000) + getTax(15000) + (salary - 15000) * 0.2;
                }
            
        
        return tax;
    }

    public double getSalaryAfterTax() {
        return getSalary() - gettax(getSalary());
    }
 public static void main(String[] args) {
        Employee p1 = new Employee();
//        p1.input();
//        p1.ouput();
        System.out.println("tax:" + p1.Gettax(9000));
        System.out.println("tax:" + p1.Gettax(12000));
        System.out.println("tax:" + p1.Gettax(13000));
        System.out.println("tax:" + p1.Gettax(14000));

    }

    private double gettax(double salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Gettax(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
