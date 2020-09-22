/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MobileDAO {
    List<Mobile> ls = new  ArrayList<>();
    public void inputs(){
    String tt ="y";
        Scanner sc = new Scanner(System.in);
        do {            
            Mobile mm= new Mobile();
            mm.inputt();
            ls.add(mm);
            System.out.println("tiếp tục ấn (Y), hoàn thành ấn (N)");
            tt=sc.next();
        } while (tt.equalsIgnoreCase("y"));
    
    }
    public void outputs(){
        for (Mobile mm : ls) {
            mm.outut();
        }
    
    }
    public void dummyData(){
    ls.add(new Mobile(2, 5, "A", 1, "TA1"));
    ls.add(new Mobile(3, 5, "B", 2, "TA2"));
    ls.add(new Mobile(4, 5, "C", 3, "TA3"));
    ls.add(new Mobile(1, 5, "D", 4, "TA4"));
    

    }
    
    public int timtheoTen(String tensp){
    int pos =-1;
        for (int i = 0; i < ls.size(); i++) {
            Mobile mm = ls.get(i);
            if (mm.getTensp().equalsIgnoreCase(tensp)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public int timtheoID(int masp){
        int pos=-1;
        for (int i = 0; i < ls.size(); i++) {
            Mobile mm =ls.get(i);
            if (mm.getMasp() == masp) {
                pos = i;
            }
        }
        return pos;
        
    }
    public int deleteid(int masp){
      
    int pos = timtheoID(masp);
        if (pos>0) {
            ls.remove(pos);
            
        }
        return pos;
    }
    public void phonegiamdan(){
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j <ls.size(); j++) {
                Mobile ml;
                if (ls.get(i).getMasp()< ls.get(j).getMasp()) {
                    ml = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, ml);
                }
            }
        }
    }
    
    
    
    public void menu(){
        while (true) {            
            Scanner sc = new Scanner(System.in);
            int choice =0;
            System.out.println("1. input");
            System.out.println("2. output");
            System.out.println("3. dummyData");
            System.out.println("4. Tìm tên sản phẩm: ");
            System.out.println("5. tim tên mã phẩm: ");
            System.out.println("6. phone giảm dần");
            System.out.println("Bạn chọn ? ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    inputs();
                    break;
                case 2:
                    outputs();
                    break;
                case 3:
                    dummyData();
                    break;
                case 4:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    int pos = timtheoTen(sc.next());
                    if (pos<0) {
                        System.out.println("không tìm thấy.");
                    } else {
                        Mobile m = ls.get(pos);
                        m.outut();
                    }
                case 5:
                    System.out.println("nhập tên mã sản phẩm cần tìm: ");
                    int pos1=timtheoID(sc.nextInt());
                    if (pos1<0) {
                        System.out.println("không tìm thấy.");
                    } else {
                        Mobile m = ls.get(pos1);
                        m.outut();
                    }
                case 6:
                    phonegiamdan();
                    break;
                    
                    default:
                        System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        MobileDAO md=new MobileDAO();
        md.menu();
    }
    
}
