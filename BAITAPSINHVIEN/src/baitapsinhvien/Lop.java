/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapsinhvien;

/**
 *
 * @author Administrator
 */
public class Lop {
    private int id;
    private String Name;
    public Lop(){}

    @Override
    public String toString() {
        return this.Name; //To change body of generated methods, choose Tools | Templates.
    }

   
    

    public Lop(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
