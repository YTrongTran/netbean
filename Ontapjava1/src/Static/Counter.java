/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *khong su dung bien static
 * @author Tran Y
 */
public class Counter {
 // int count = 0;//se lay bo nho (memory) khi bien instance duoc tao
 static int count = 0;//se lay bo nho chi mot lan va giu lay gia tri do
    Counter(){
    count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter cs = new Counter();
         Counter cs1 = new Counter();
          Counter cs2 = new Counter();
    }
}
