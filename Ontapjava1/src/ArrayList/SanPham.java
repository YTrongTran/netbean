/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
class tenSanPham {

    String ten;
    String mota;
    Float giaban;

    public void xemSanPham() {
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Mô tả sản phẩm: " + mota);
        System.out.println("Giá bản sản phẩm: " + giaban);
    }
}

class shop {

    ArrayList<tenSanPham> DanhSachSanPham = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void themSanPham(tenSanPham sp) {
        
        System.out.printf("nhập Tên Sản Phẩm: ");
        sp.ten = sc.nextLine();
        System.out.printf("Mô tả Sản phẩm: ");
        sp.mota = sc.nextLine();
        System.out.printf("Giá bản sản phẩm: ");
        sp.giaban = sc.nextFloat();
        DanhSachSanPham.add(sp);
    }
    public void xemSanPham(){
        if (DanhSachSanPham.size() == 0) {
            System.out.printf("Danh Sach chua co \n");
        }else{
        for (tenSanPham l : DanhSachSanPham) {
           l.xemSanPham();
        }

        }
    }
    public void timSanPham(){
        if (DanhSachSanPham.size() == 0) {
            System.out.printf("Shop chua co san pham");
        }else{
            System.out.printf("moi ban nhap gia thap nhat");
            float gia1 = sc.nextFloat();
            System.out.printf("moi ban nhap gia cao nhat");
            float gia2 = sc.nextFloat();
            boolean timthay = false;
            for(tenSanPham l : DanhSachSanPham){
                if (l.giaban >= gia1 && l.giaban <= gia2 ) {
                    l.xemSanPham();
                    timthay = true;
                }
            }
            if(timthay == false){
            System.out.printf("khong tim thay san pham trong doan [%.0f, $.0f] \n", gia1,gia2);
        }
            
        }
    }
     public void xoaSanPham(){
         System.out.println("Moi ban nhap ten san pham de xoa: ");
         String ten = sc.nextLine();
         if(ten.equalsIgnoreCase(ten)){ // 
         ten = sc.nextLine();
         }
         boolean timthay = false;
         for(tenSanPham l : DanhSachSanPham){
             if(l.ten.equalsIgnoreCase(ten)){
             DanhSachSanPham.remove(l);
                 System.out.printf("Da xoa san pham %s \n" , ten);
                     
             timthay = true;
             break;
             }
         
          if(timthay == false ){
          System.out.printf("khong tim thay san pham %s\n",ten);
          }      
         
    }
}
}
public class SanPham {

    static void Menu() {
        System.out.println("========================");
        System.out.println("Hệ Thống Quản Lý Sản Phẩm");
        System.out.println("1. Thêm Sản Phẩm");
        System.out.println("2. Xem Sản Phẩm");
        System.out.println("3. Tìm Sản Phẩm");
        System.out.println("4. Xóa Sản Phẩm");
        System.out.println("5. Sắp Xếp Giá Sản Phẩm");
        System.out.println("6. Thoát");
        System.out.println("========================");

    }

    public static void main(String[] args) {
        int luachon;
        shop shop = new shop();
        Menu();
        while(true){
        Scanner sc = new Scanner(System.in);
            System.out.printf("Mời bạn nhập: ");
            luachon =sc.nextInt();
            switch(luachon){
                case 1:
                    shop.themSanPham(new tenSanPham());
                    break;
                case 2:
                    shop.xemSanPham();
                    break;
                case 3:
                    shop.timSanPham();
                    break;
                case 4:
                    shop.xoaSanPham();                    
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Chuong trinh da ket thuc");
                    System.exit(0);
                    
                       break;
            }
        }
        
    }

}
