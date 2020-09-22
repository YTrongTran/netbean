/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import View.Sinhvien;
import View.Sinhvien;

/**
 *
 * @author trany
 */
public class QuanlyDiiemPanel {
   private  Sinhvien sv;
   private double diemTin;
   private double diemAV;
   private double DiemGDTC;

    public QuanlyDiiemPanel() {
    }

    public QuanlyDiiemPanel(Sinhvien sv, double diemTin, double diemAV, double DiemGDTC) {
        this.sv = sv;
        this.diemTin = diemTin;
        this.diemAV = diemAV;
        this.DiemGDTC = DiemGDTC;
    }

    public Sinhvien getSv() {
        return sv;
    }

    public void setSv(Sinhvien sv) {
        this.sv = sv;
    }

    public double getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(double diemTin) {
        this.diemTin = diemTin;
    }

    public double getDiemAV() {
        return diemAV;
    }

    public void setDiemAV(double diemAV) {
        this.diemAV = diemAV;
    }

    public double getDiemGDTC() {
        return DiemGDTC;
    }

    public void setDiemGDTC(double DiemGDTC) {
        this.DiemGDTC = DiemGDTC;
    }
   public double getDiemTb(){
   return (diemAV+DiemGDTC+diemTin)/3;
   }
   public String xeploai(){
       double tbc = getDiemTb();
   String xl;
       if (tbc>=9) {
           xl="gioi";
           
       }else {
           if (tbc>=8) {
               xl="kha";
           } else {
               if (tbc>=5) {
                   xl="trung binh";
               }else {
                   xl="yeu";
                   
           }
               
       
       }
           
       
   }
       return xl;
       
   }  
       
}
