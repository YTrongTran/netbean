/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author Tran Y
 */
class tenSinhVien {

    String hoTen;

    public void listSinhVien() {
        System.out.println("Họ và tên: " + hoTen);
    }
}

class SV {

    ArrayList<tenSinhVien> list = new ArrayList<tenSinhVien>();
    Scanner sc = new Scanner(System.in);

    public void themSinhVien(tenSinhVien sv) {
        System.out.printf("Nhập Họ và Tên: ");
        sv.hoTen = sc.nextLine();
        list.add(sv);
    }

    public void listSinhVien() {
        if (list.size() == 0) {
            System.out.println("Không có danh sách Sinh Viên");
        } else {
            for (tenSinhVien sinhVien : list) {
                sinhVien.listSinhVien();
            }
        }
    }
    public void listRandom(){
        Collections.shuffle(list);
        this.listSinhVien();
    }
    public void sort(){
        Collections.reverse(list);
    }
    public void delete(){
        System.out.printf("nhập tên để kiểm tra: ");
        String ten = sc.nextLine();
         if (ten.equals(ten)) {
             System.out.printf("nhập tên để xóa: "); 
           ten = sc.nextLine();
        }
        boolean timthay = false;
        for (tenSinhVien sv : list) {
            if (sv.hoTen.equals(ten)) {
                System.out.println("đã xóa thành công");
                list.remove(sv);
                 timthay = true;
                break;
            }
            if ( timthay == false) {
                System.out.println("không tìm tên sinh viên: " +ten);
            }
           
        }
        
        }
}

public class SinhVien {

    static void Menu() {
        System.out.println("======================");
        System.out.println("=======Danh Sách======");
        System.out.println("1. Nhập họ và tên ");
        System.out.println("2. In ra danh sách");
        System.out.println("3. In ra danh sách ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần và xuất ra danh sách");
        System.out.println("5. Tìm ");
        System.out.println("6. Xóa ");
        System.out.println("7. Kết thúc");
        System.out.println("======================");
    }

    public static void main(String[] args) {
        int luachon;
        Menu();
        SV sv = new SV();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Mời bạn Nhập: ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    sv.themSinhVien(new tenSinhVien());
                    break;
                case 2:
                    sv.listSinhVien();
                    break;
                case 3:
                    sv.listRandom();
                    break;
                case 4:
                    sv.sort();
                    break;
                case 5:
                    break;
                case 6:
                    sv.delete();
                    break;
                case 7:
                    System.exit(0);
                    break;

            }
        }
    }
}
