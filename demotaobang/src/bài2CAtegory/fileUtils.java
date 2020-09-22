/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài2CAtegory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class fileUtils {
    //save file 
    public static void writeFile(String fileName, List ls){
      
        try {
              FileOutputStream fos = new FileOutputStream(fileName);
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(ls);
              oos.close();
        } catch (Exception ex) {
            System.out.println("Error: "+ex.toString());
        }
    
    }
    public static List readFile(String fileName){
    List ls = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ls=(List) ois.readObject();
            ois.close();
            
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
    return ls;
    }
}
