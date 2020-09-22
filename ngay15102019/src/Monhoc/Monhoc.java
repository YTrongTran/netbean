/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monhoc;

/**
 *
 * @author Administrator
 */
public class Monhoc {
private String Mamon;
private String Tenmon;
public Monhoc(){}

    public Monhoc(String Mamon, String Tenmon) {
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String Tenmon) {
        this.Tenmon = Tenmon;
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
