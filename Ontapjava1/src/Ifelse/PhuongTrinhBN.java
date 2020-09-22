/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class PhuongTrinhBN {

    //ax+b=0 đây là Chương trình bậc nhất 1 ẩn
    // b1: ta xác định là nếu  a=0 => pt vô nghiệm và b =0 thì pt có vô số nghiệm 
    //b2: ta xác định là ngược lại nếu a khác 0 thì pt có 1 nghiệm duy nhất
    public void phuongTrinhBNI(){
        double a, b, x;
        //ta khai báo lớp Scanner để nhập từ người dùng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a : ");
        a = sc.nextDouble();
        System.out.print("Nhập vào số b : ");
        b = sc.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("phương trinh vô nghiệm");
        } else if (a != 0 && b == 0) {
            x = 0;
            System.out.print("phương trình có nghiệm: " + x);
        } else if (a != 0 && b != 0) {
            x = (int)-b / a;
            System.out.print("phương trình có 1 nghiệm: " + x);
        }
    }
    public void phuongTrinhBII(){
    //ax2+bx+c=0
    //b1: ta có a =0 thì pt có 1 nghiệm, a=b=0 thì pt vo nghiệm a=b=c=0 thì pt có  vô số nghiệm
    //nếu a != 0 thì ta có pt bậc 2 detal = ><0;
    double a,b,c,x1,x2,delta;
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số A: ");
        a = sc.nextDouble();
        System.out.print("Nhập vào số B: ");
        b = sc.nextDouble();
        System.out.print("Nhập vào số C: ");
        c = sc.nextDouble();
        delta = b*b-4*a*c;
        if (a == 0) {
              if (b == 0) {
                  if (c == 0) {
                      System.out.println("thì pt có  vô số nghiệm");
                  }else{
                  System.out.println("thì pt số nghiệm");
                  }
            }
        }else {
        
        }
    
    
    }
    
    public static void main(String[] args) {
        PhuongTrinhBN a = new PhuongTrinhBN();
      //  a.phuongTrinhBNI();
        a.phuongTrinhBII();
    }
}
