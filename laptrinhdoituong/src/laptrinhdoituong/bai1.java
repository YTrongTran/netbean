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
public class bai1 {

    //1. thuộc tính.
    //2. hàm dùng construtor.
    //3. setter vs getter.
    private int id;
    private String name;
    private double price;

    public bai1() {
    }

    public bai1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("input name:");
        setName(sc.next());
        System.out.println("input price");
        setPrice(sc.nextDouble());
    }

    public void output() {
        System.out.println("=>" + getId() + "-" + getName() + "-" + getPrice());
    }

    public static void main(String[] args) {
        bai1 p1 = new bai1();
        p1.input();
        p1.ouput();
        bai1 p2 = new bai1();
        p2.input();
        p2.ouput();

    }



    private void ouput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
