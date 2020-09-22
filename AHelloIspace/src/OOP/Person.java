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
public class Person {
    private int id;
    private String name;
public  Person(){

}
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input id");
        setId(sc.nextInt());
        System.out.println("nhập name");
        setName(sc.next());
    
    }
    public  void output () {
        System.out.println("=>"+getName()+"-"+getId());
    }
    public static void main(String[] args) {
        Person sc= new Person();
        sc.Input();
        sc.output();
    }
}


