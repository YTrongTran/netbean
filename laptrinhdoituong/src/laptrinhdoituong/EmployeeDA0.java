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
public class EmployeeDA0 {
    //khai bao mang employee
    Employee arr[] = new Employee[100];
    int index=0;
    //inputs
    public void inputs(){
    String tt = "y";
        Scanner sc = new Scanner(System.in);
        do {            
            Employee ee = new Employee();
            ee.input();
            arr[index]=ee;
            index++;
            System.out.println("tiep tuc?(y/n)");
            tt= sc.next();
            
        } while (tt.equalsIgnoreCase("y"));
    }
    public void ouputs(){
        for (int i = 0; i <index; i++) {
            Employee ee = arr[i];
            ee.ouput();
        }
    
    }
    
     public void arrangement(){
        for (int i = 0; i < index-1; i++) {
            for (int j = i; j < index; j++) {
                if (arr[i].getSalary()> arr[j].getSalary()) {
                    Employee temp = arr[i];
                    arr[i]=arr[j];
                    arr [i]= temp;
                }
            }
            
        }
    
    
    }
    
     public void dummydata(){
    index=5;
    arr[0]= new Employee(0, "A0", 1000);
    arr[1]= new Employee(1, "A1", 2000);
    arr[2]= new Employee(2, "A2", 3000);
    arr[3]= new Employee(3, "A3", 4000);
    arr[4]= new Employee(4, "A4", 5000);
    
    
    
    }
     public  void finEmployeeMaxSalary(){
     double max = arr[0].getSalaryAfterTax();
     int pos =0;
         for (int i = 0; i < index; i++) {
             if (arr[i].getSalaryAfterTax()>max) {
                 max = arr[i].getSalaryAfterTax();
                 pos = i;
             }
         }
     }
     public int findEmployeeByName(String name){
     int pos = -1;
         for (int i = 0; i < index; i++) {
             Employee ee = arr[i];
             if (ee.getName().contains(name)) {
                 pos = i;
                 break;
             }
         }
     return  pos;
     }
    
    
    public static void main(String[] args) {
      EmployeeDA0 e1 = new EmployeeDA0();
      e1.inputs();
      e1.ouputs();
      String findName = "A5";
      int pos = e1.findEmployeeByName(findName);
        if (pos<0) {
            System.out.println("ko tim thay");
        } else {
            System.out.println("tim thay");
            e1.arr[pos].ouput();
            
        }
    }
}
