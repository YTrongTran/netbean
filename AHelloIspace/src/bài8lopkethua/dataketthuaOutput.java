/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài8lopkethua;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class dataketthuaOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos  = new FileOutputStream("filel2.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        final int NUMBER =5;
        dos.writeInt(NUMBER);
        for (int i = 0; i <= NUMBER; i++) {
            dos.writeInt(i);
            
        }
        dos.writeUTF("HELLO !");
        dos.writeDouble(100.75);
        dos.flush();
        dos.close();
    
    
    
    }}