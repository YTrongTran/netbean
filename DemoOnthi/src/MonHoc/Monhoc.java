/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonHoc;

/**
 *
 * @author Administrator
 */
public class Monhoc {
    private int maMonHoc;
    private String tenmonHoc;

    public Monhoc() {
    }

    public Monhoc(int maMonHoc, String tenmonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenmonHoc = tenmonHoc;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenmonHoc() {
        return tenmonHoc;
    }

    public void setTenmonHoc(String tenmonHoc) {
        this.tenmonHoc = tenmonHoc;
    }
    
}
