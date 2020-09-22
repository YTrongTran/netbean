/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài8lopkethua;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class kethua01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("filel.dat");
        String text = "The quick brown fox ";
        byte [] textAsBytes = text.getBytes();
        fos.write(textAsBytes);
    }
}
