/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

/**
 *
 * @author Administrator
 */
public class bien {
    public void sayHello(){
        int n=5; // đây là biến local
        System.out.println("Gia tri cua n la:" + n);
    }
    public static void main(String[] args) {
        bien bienLocal = new bien();
        bienLocal.sayHello();
    }
}
