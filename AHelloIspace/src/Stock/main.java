/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("file1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stkcm p = new Stkcm(1, " hai chau ");
        oos.writeObject(p);
        oos.close();
        ///
        FileInputStream fis = new FileInputStream("file1.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Stkcm p1 = (Stkcm ) ois.readObject();
        System.out.println("=>"+p1.toString());
        p1.toString();
        ois.close();
        fis.close();
        
    }
        
    
}
