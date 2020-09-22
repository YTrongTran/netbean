/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptgt;

/**
 *
 * @author ADMIN
 */
//lớp oto kế thừa lớp PTGT
public class OTO extends PTGT{
    //Khai báo các thuộc tính thêm của lớp oto.
    private String kieudongco;
    private int sochongoi;
    //tạo hàm khởi tạo.
    public OTO(){}

    public OTO(String kieudongco, int sochongoi, String hangsanxuat, String mau, int namsanxuat, double giaban) {
        super(hangsanxuat, mau, namsanxuat, giaban);
        this.kieudongco = kieudongco;
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }
    
}
