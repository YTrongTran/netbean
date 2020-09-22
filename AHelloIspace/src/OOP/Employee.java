/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee extends Person{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name) {
        super(id, name);
    }
    
    public Employee(){
    
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void Input() {
        super.Input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập id");
//        setId(sc.nextInt());
//        System.out.println("nhâp name");
//        setName(sc.nextLine());
        System.out.println("Salary");
        setSalary(sc.nextDouble());
        
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getName()+"-"+getId()+"-"+getSalary());
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
    public double doSalary(){
    return getSalary()-getTax(getSalary());
    }
    public static void main(String[] args) {
        Employee em= new Employee();
        em.Input();
        em.output();
    }
   

    public Employee(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }
    
}
