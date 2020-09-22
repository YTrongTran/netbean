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
public class Product {
    private int masp;
    private String tensp;
    public Product(){
    super();
    }

    public Product(int masp, String tensp) {
        this.masp = masp;
        this.tensp = tensp;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    public void inputt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập masp: ");
        setMasp(sc.nextInt());
        System.out.println("nhập tên sp: ");
        setTensp(sc.next());
        
    }
    public void outut(){
        System.out.println("=>" + getMasp() + " và " + getTensp());
    
    }
    public static void main(String[] args) {
        Product pt = new Product();
        pt.inputt();
        pt.outut();
    }
}
