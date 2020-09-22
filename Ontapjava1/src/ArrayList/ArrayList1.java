/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;


/**
 *
 * @author Tran Y
 */
public class ArrayList1 {
    //khoi tao arraylist
    ArrayList marks = new ArrayList();
    //luu tru diem vao arraylist
    public void storeMarks()
    {
        System.out.println("store marks, please wait...");
        marks.add(67);
        marks.add(50);
        marks.add(35);
        marks.add(5);
    }
    //xuat ra danh sach hien thi
    public void displayMarks()
    {
        System.out.println("Marks are: ");
        //dung vong lap for de truy xuat cac phan tu
        //size la tra ve so luong phan tu danh sach, length tra ve do dai trong index
        //get thi tra ve chi so cua phan tu trong index
        for(int i =0; i< marks.size(); i++)
        {
            System.out.println("Marks " +marks.get(i));
        }
    }
}
