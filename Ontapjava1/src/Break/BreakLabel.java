/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Break;

/**
 *
 * @author Tran Y
 */
public class BreakLabel {
    public static void main(String[] args) {
        first:
        for(int i =1;i< 5 ; i++){
            second:
            for(int j =1; j<3 ; j++){
                System.out.println("i = " + i+ "; j = " + j);
                if(i == 2){
                break second;
                }
            }
        }
        
    }
}
