/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienvaHangSo;

/**
 *
 * @author Administrator
 */
public class Bien {

   public void sayHello(){
   int n = 10;
       System.out.println("Giá trị của n là " +n);
   }
    public static void main(String[] args) {
        Bien bienLocal = new Bien();
        bienLocal.sayHello();
    }
   
}
