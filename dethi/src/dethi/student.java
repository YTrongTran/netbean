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
public class student {
private String id;
private String name;
private int age;
private String address;
public student(){}

    public student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập id: ");
    setId(sc.next());
    System.out.println("nhập name: ");
    setName(sc.next());
    System.out.println("nhập age: ");
    setAge(sc.nextInt());
    System.out.println("địa chỉ: ");
    setAddress(sc.next());
}
  public void printStudent (){
      System.out.println("=>" + getId() + " - " + getName() + " - "
      + getName() + " - " + getAddress());
  
  }

}
