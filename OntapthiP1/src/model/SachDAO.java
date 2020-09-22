/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class SachDAO {

    List<Sachfr> lsn = new ArrayList<>();

    public int add(Sachfr s) {
        lsn.add(s);
        return 1;
    }

    public int count() {
        return lsn.size();
    }

    public List<Sachfr> getALLSACHFr() {
        return lsn;

    }

    public int delBYID(String id) {
        for (Sachfr r : lsn) {
            if (r.getmSach().equalsIgnoreCase(id)) {
                lsn.remove(r);
                return 1;

            }
        }
        return -1;
    }

    public Sachfr getSachBYID(String id) {
        for (Sachfr r : lsn) {
            if (r.getmSach().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
    }

    public int editS(Sachfr r) {
        for (Sachfr fr : lsn) {
            if (fr.getmSach().equals(r.getmSach())) {
                fr.settSach(r.gettSach());
                fr.setChuyennganhS(r.getChuyennganhS());
                fr.setNgaynhap(r.getNgaynhap());
                fr.setSoluong(r.getSoluong());
                fr.setGiaban(r.getGiaban());
                return 1;
            }
        }
        return -1;
    }
    public Sachfr getSachfATPOINT(int position){
    return lsn.get(position);
    }
}
