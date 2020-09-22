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
public class ForToanTuDauPhay {
    public static void main(String[] args) {
        int x,y;
        int max = 10;// phần khởi tạo và phần tăng/giảm chứa đựng nhiều hơn một câu lênh;
        
        for ( x =0 , y = max ; x <= max ; x++,y--) {
           // System.out.printf("\n%d + %d = %d "  ,x,y,x+y);
            System.out.println(x + " + " + y + " = " + (x+y));
        }
    }
   
}
