/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Continue;

/**
 *
 * @author Tran Y
 */
public class Continue {
    public static void main(String[] args) {
        for(int i =1; i<=10;i++ ){
        //neu gia cau i thi giua 4 va 9 , continue se thuc hien
        if(i > 4 && i< 9){
        continue;
        }
            System.out.println("gia tri " + i);
        } 
    }
            
}
