
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class hcn {
 //input
    //output
    //getchuvi
    //getdientich
    private int chieudai;
    private int chieurong;
    private int chuvi;
    private int dientich;
    public hcn() {
    }

    public hcn(int chieudai, int chieurong, int chuvi, int dientich) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.chuvi = chuvi;
        this.dientich = dientich;
    }

//    public hcn(int chieudai, int chieurong) {
//        this.chieudai = chieudai;
//        this.chieurong = chieurong;
//    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    public void setChuvi(int chuvi) {
        this.chuvi = chuvi;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public int getChieudai() {
        return chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public int getChuvi() {
        return chuvi;
    }

    public int getDientich() {
        return dientich;
    }

   
   public void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("chieudai:");
       setChieudai(sc.nextInt());
       System.out.println("chieurong");
       setChieurong(sc.nextInt());
       setChuvi(getChieudai()*2+getChieurong()*2);
       setDientich(getChieudai()*getChieurong());
     
   }
    public static void main(String[] args) {
        hcn p1 = new hcn();
        p1.input();
        System.out.println(p1.getChuvi());
        System.out.println(p1.getDientich());
    }

   

    
    
}
