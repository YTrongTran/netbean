/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Tran Y
 */
public class Array {
    public static void main(String[] args) {
        int [] number = {2,-9,0,5,12,-25,22,9,8,12};
        int sum =0;
        Double average;
        //tính tổng và trung bình cộng
//        for(int i = 0 ; i < 10 ; i++){
//            sum += number[i];      
//            System.out.println("chỉ số " + i + " : " + sum);
//        }
        for (int numbers : number) {
            sum = sum+ numbers;
        }
        System.out.println("tổng = " + sum);
        int arrayLength = number.length;
        average = ((double)sum/(double)arrayLength);
        System.out.println("Trung bình cộng = " + average);
    }
}
