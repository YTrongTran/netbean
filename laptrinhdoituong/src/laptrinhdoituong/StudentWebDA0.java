/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhdoituong;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StudentWebDA0 {
    //sap xep sinh vien theo diem tb tang dan
    // in ra sinh vien co diem tb cao nhat
    //tim sinh vien voi ten nhap tu ban phim.
    Studentweb arr [] = new Studentweb[100];
    int index =0;
    public  void inputs(){
        Scanner sc = new Scanner(System.in);
        String tt="y";
        do {            
            Studentweb st = new Studentweb();
            st.input();
            arr[index]=st;
            index++;
            System.out.println("tiep tuc ? (y/n)");
            tt=sc.next();
            
        } while (tt.equalsIgnoreCase("y"));
    }
    public void outputs(){
        for (int i = 0; i < index; i++) {
            Studentweb st = arr[i];
            st.output();
        }
    }
   
   
    public static void main(String[] args) {
        StudentWebDA0 sw= new StudentWebDA0();
        sw.inputs();
        sw.outputs();
    }
    
}
