/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author Tran Y
 */
public class ForFor {
    public static void main(String[] args) {
        int row,col;
        // vòng lặp for ngoài thực thi 5 lần
        for ( row = 1; row <= 5; row++) {
            //mỗi lần lặp for ngoài thì vòng lặp for bên trong sẽ lặp row lần
            for ( col = 1; col <= row; col++) {
                System.out.print(" * ");
            }//kết thúc vòng lặp for trong
            System.out.println();
        }//kết thúc vòng lặp for ngoài
        
    }
}
