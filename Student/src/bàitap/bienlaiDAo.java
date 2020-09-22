/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bàitap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bienlaiDAo {
    Bienlai arr[] = new Bienlai [100];
    public void inputs(int n){
        for (int i = 0; i < n; i++) {
            Bienlai bl = new Bienlai();
            bl.input();
            arr[i]=bl;
            
        }
    
    }
    public void outputs (int n ){
        for (int i = 0; i < n; i++) {
            arr[i].output();
        }
       
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hộ sử dụng điên: ");
        int soho= sc.nextInt();
        bienlaiDAo bl = new bienlaiDAo();
        bl.inputs(soho);
        bl.outputs(soho);
        
    }
    
}
