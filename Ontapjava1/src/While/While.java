/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package While;

/**
 *
 * @author Tran Y
 */
public class While {
    public static void main(String[] args) {
        int sum = 0,i =100;
        while(i != 0){
        sum += i; // sum = sum +i
        --i;
        }
        System.out.println("Sum: "+sum);
    }
            
}
