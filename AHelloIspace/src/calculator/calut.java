/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Administrator
 */
public class calut {
  
    public static void main(String[] args) {
          
          addAB();
          subAB();
          nhanAB();
         
          
    
    }
    public static void addAB() {
        
    
        int numberA,numberB;
        int result;
        numberA=4;
        numberB=6;
        result=numberA + numberB;
        System.out.println("kết quả:"+result);
    }
    public static void subAB() {
        int numberA,numberB;
        int result;
        numberA=4;
        numberB=6;
        result=numberA - numberB;
        System.out.println("kết quả:"+result);
    }
    public static void nhanAB() {
        int numberA=5,numberB=6;
       
        int result;
        result=numberA*numberB;
        System.out.println("kết quả:"+result);
    }
   
}
