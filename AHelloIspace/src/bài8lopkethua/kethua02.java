/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài8lopkethua;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class kethua02 {
    public static void main(String[] args) throws IOException{
     FileInputStream fis = new FileInputStream("filel.dat");
     int c;
        while ((c = fis.read()) !=-1 ) {            
            System.out.print((char) c);
        }
        fis.close();
    }
}
