/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *Chuong trinh vi du ve bien static trong java
 * @author Tran Y
 */
public class Student {
    int rollno;
    String name;
   static String colleage = "Ta";
    Student (int r , String n){
    rollno = r;
    name  = n;
    }
    static void change(){
    colleage = "Qa";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + colleage);
    }
    public static void main(String[] args) {
        Student.change();
        Student st  = new Student(11, "trann");
        Student st1  = new Student(112, "abcd");
        st.display();
        st1.display();
    }
    
}
