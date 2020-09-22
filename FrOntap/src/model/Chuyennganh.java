/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author trany
 */
public class Chuyennganh {
    private String mCN;
    private String tenCN;

    public Chuyennganh() {
    }

    @Override
    public String toString() {
        return  tenCN ;
    }

    
   

//    Chuyennganh(String ms01, String a1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public Chuyennganh(String mCN, String tenCN) {
        this.mCN = mCN;
        this.tenCN = tenCN;
    }

    public String getmCN() {
        return mCN;
    }

    public void setmCN(String mCN) {
        this.mCN = mCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

  
   
}
