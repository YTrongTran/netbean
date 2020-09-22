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
public class dowhilebt {
        //tinh trung binh cong chia het cho 3 <100
        public static void main(String[] args) {
        int i =0;
        int sum=0;
        int count=0;
            do {   
                if ( i % 3==0) {
                    sum+=i;
                    System.out.println("=>"+i);
                    count++;
                    
                }
                i++;
                
                
            } while (i<100);
            System.out.println("sum"+sum);
            System.out.println("avg"+sum/3);
            System.out.println("count"+count);
    }
}
