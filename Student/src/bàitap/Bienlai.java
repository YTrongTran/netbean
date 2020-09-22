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
public class Bienlai {

    private int chiSocu;
    private int chiSomoi;
    private double soTienphaitra;

    public void setChiSocu(int chiSocu) {
        this.chiSocu = chiSocu;
    }

    public void setChiSomoi(int chiSomoi) {
        this.chiSomoi = chiSomoi;
    }

    public void setSoTienphaitra(double soTienphaitra) {
        this.soTienphaitra = soTienphaitra;
    }

    public int getChiSocu() {
        return chiSocu;
    }

    public int getChiSomoi() {
        return chiSomoi;
    }

    public double getSoTienphaitra() {
        return soTienphaitra;
    }

    public Bienlai(){}
    public Bienlai(int chiSocu, int chiSomoi, double soTienphaitra) {
        this.chiSocu = chiSocu;
        this.chiSomoi = chiSomoi;
        this.soTienphaitra = soTienphaitra;
    }
    public void input(){
    Scanner sc = new Scanner(System.in);
  
        System.out.println("Chỉ số mới: ");
        setChiSomoi(sc.nextInt());
        System.out.println("chỉ số cũ: ");
        setChiSocu(sc.nextInt());

    soTienphaitra = (double ) (getChiSomoi()-getChiSocu())*750;
    }
  public void output(){
      System.out.println("=> " + getChiSomoi() + " - " + getChiSocu() + 
              " số tiền phải trả là " + getSoTienphaitra());
  
  }
    public static void main(String[] args) {
        Bienlai bl = new Bienlai();
        bl.input();
        bl.output();
    }
    
}
