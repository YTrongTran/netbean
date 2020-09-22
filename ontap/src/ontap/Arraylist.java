/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        String a = new String("hello");
        ls.add(a);
        String b = new String("Goodbye");
        ls.add(b);
        System.out.println("List size is " + ls.size());
        if (ls.contains("Hello")) {
            System.out.println("Hello is in");
            System.out.println("Index of " + a + " is " + ls.indexOf(a));
            System.out.println("List is empty ?" +ls.isEmpty());
            ls.remove(a);
        }
        
    }
}
