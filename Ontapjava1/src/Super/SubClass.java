/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author Tran Y
 */
public class SubClass extends SuperClass {
    // ghi đè method printMethod của lớp cha SuperClass
    public void printMethod(){
    super.printMethod();//dùng super để gọi tới phương thức bị ghi đè ở lớp cha
        System.out.println("Đang ở lớp Con");
    }
    public static void main(String[] args) {
        SubClass  s = new SubClass();
        s.printMethod();
                
    }
}
