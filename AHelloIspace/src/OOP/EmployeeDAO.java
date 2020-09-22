/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EmployeeDAO {
    List<Employee> ls = new ArrayList<>();
    public  void inputs(){
    String tt = "y";
        Scanner sc= new Scanner(System.in);
        do {            
            Employee ee = new Employee();
            ee.Input();
            ls.add(ee);
            System.out.println("tiep tuc:(y/n)");
            tt=sc.nextLine();
            
        } while (tt.equalsIgnoreCase("y"));
    
    }
    public void outputs(){
    for(Employee ee:ls){
    ee.output();
    }
    
    }
    public void outputs1(){
    
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            ee.output();
        }
    }
    public void dummydata(){
    ls.add(new  Employee(9000, 1, "A1"));
    ls.add(new  Employee(17000, 2, "A2"));
    ls.add(new  Employee(19000, 3, "A3"));
    ls.add(new  Employee(12000, 4, "A4"));
    ls.add(new  Employee(16000, 5 , "A5"));
    ls.add(new  Employee(18000, 6, "A6"));
    ls.add(new  Employee(20000, 7, "A7"));
    ls.add(new  Employee(22000, 8, "A8"));
    ls.add(new  Employee(24000, 9, "A9"));
    ls.add(new  Employee(26000, 10, "A10"));
    }
    public void maxSalary(){
    double max = ls.get(0).doSalary();
    int pos =-1;
        for (int i = 0; i <ls.size(); i++) {
            Employee ee = ls.get(i);
            if (ee.doSalary()> max) {
                max=ee.doSalary();
                pos =i;
                        
            }
        }
        if (pos>=0) {
            Employee ee = ls.get(pos);
            ee.output();
            
        }else{
            System.out.println("ko tim thay");
        }
    }
    public int findEmployee(int id){
    int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if (ee.getId()==id) {
                pos = i;
            }
        }
        return pos;
    }
      public int deleteEmployee (int id){
    int pos = findEmployee(id);
        if (pos>=0) {
            ls.remove(pos);
            
        }
        return pos;
    
    }
    public int findEmployee(String name){
    int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if (ee.getName().equalsIgnoreCase(name)) {
                pos = i;
            }
        }
        return pos;
    }
    public double salaryAVG(){
    double sum = 0 ;
    double avg = 0;
        for (Employee e: ls) {
            sum = sum+ e.doSalary();
            
        }
        return sum/ls.size();
    
    }
  
    public int updateEmployee(int id){
    int pos = findEmployee(id);
        if (pos >=0) {
            Employee e = new  Employee();
            e.Input();
            ls.set(pos, e);
        }
        return  pos;
    
    }
    public void arrangement(){
//        Collections.sort(ls, c);
for (int i = 0; i < ls.size()-1; i++) {
            for (int j = 0; j < ls.size(); j++) {
        Employee temp;
                if (ls.get(i).getId()>ls.get(j).getId()) {
                    temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
    }
        }
    
    }
    public static void main(String[] args) {
        EmployeeDAO ed = new EmployeeDAO();
        
        ed.menu();
    }
    public void  menu(){

        while (true) {            
            Scanner sc = new Scanner(System.in);
    int choice =0;
        System.out.println("1.input");
         System.out.println("2.output");
            System.out.println("3.add list");
            System.out.println("4. maxSalary");
            System.out.println("5. find id ");
            System.out.println("6. find name");
            System.out.println("7. tổng trung bình");
                
          System.out.println("ban chon");
          choice = sc.nextInt();
          switch(choice){
          case 1: inputs(); break;
          case 2: outputs(); break;
          case 3: dummydata();break;
          case 4: maxSalary(); break;
          case 5:
              System.out.println("nhập id cần tìm");
          int pos = findEmployee(sc.nextInt());
              if (pos<0) {
                  System.out.println("ko tim thay");
              } else {
                  Employee e= ls.get(pos);
                  e.output();
              }
          case 6 :
              System.out.println("nhập tên cần tim");
              int pos1 = findEmployee(sc.nextLine());
              if (pos1<0) {
                  System.out.println("ko tim thay");
              } else {
                  Employee e = ls.get(pos1);
                  e.output();
              }
          case 7: System.out.println("");
          default:System.exit(0);
          
          }
        }
    }
       
}
