/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapClass;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
public class NhanVien {

    private String name;
    private int age;
    private String address;
    private double money;
    private int totaltime;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double money, int totaltime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.money = money;
        this.totaltime = totaltime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(int totaltime) {
        this.totaltime = totaltime;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Họ và tên: ");
        name = sc.nextLine();

        System.out.printf("Địa Chỉ: ");
        address = sc.nextLine();
        
        System.out.printf("Tuổi: ");
        age = sc.nextInt();

        System.out.printf("Tiền Lương: ");
        money = sc.nextDouble();
        System.out.printf("Tổng số giờ làm: ");
        totaltime = sc.nextInt();
        System.out.println("============");

    }

    public void outputInfo() {
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa Chỉ: " + address);
        System.out.println("Tiền Lương: " + money);
        System.out.println("Tổng số giờ làm: " + totaltime);
    }
public double tinhThuong(){
    double thuong;
    if (totaltime >= 200) {
        thuong = money*0.2;
        System.out.println("thưởng: " +thuong);
    }else if(totaltime <200 && totaltime >= 100){
        thuong= money*0.1;
         System.out.println("thưởng: " +thuong);
    }else if(totaltime <100){
     thuong = 0;
      System.out.println("thưởng: " +thuong);
    }
    return totaltime;
}
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.inputInfo();
        nv.outputInfo();
        nv.tinhThuong();
    }
}
