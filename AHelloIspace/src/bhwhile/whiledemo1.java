/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhwhile;

/**
 *
 * @author Administrator
 */
public class whiledemo1 {

    //in ra cac so chẵn <100
    public static void main(String[] args) {
        int i = 0;
        do {            
            if (i % 2 == 0) {
                System.out.println("=>" + i);
            }

            i++;
        } while (i<100);
        
    }
}
