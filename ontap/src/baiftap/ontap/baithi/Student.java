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
public class Student {
    private  String id,name,address;
    private int age;
    public Student(){
    super();
    }

    public Student(String id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id: ");
        setId(sc.next());
        System.out.println("nhập name: ");
        setName(sc.next());
        System.out.println("nhập tuổi: ");
        setAge(sc.nextInt());
        System.out.println("nhập địa chỉ: ");
        setAddress(sc.next());
    }
    public void printStudent(){
        System.out.println("kết quả: " + " id: " + getId() + " || " +  " name: " + getName() + " || " 
      + " tuổi: "  + getAge() + " || " + " địa chỉ: " + getAddress());
    
    }
    public static void main(String[] args) {
        Student sd = new Student();
        sd.inputStudent();
        sd.printStudent();
                
    }
  
}
