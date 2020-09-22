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
public class whilso4 {
    //tinh trung binh cong chia het cho 3 <100
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int count=0;
        
        while (i<100) {
            if ( i % 3 ==0) {
                count++;
               sum+=i;
                System.out.println("=>"+i);
            }
            i++;
        }
        System.out.println(count);
        System.out.println("sum:"+sum);
        System.out.println("AVG:"+sum/3);
    }
}
