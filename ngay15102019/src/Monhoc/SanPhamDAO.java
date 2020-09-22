/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monhoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SanPhamDAO {
    List<Sanpham> lsp = new ArrayList<Sanpham>();
    public int add(Sanpham sp){
    lsp.add(sp);
    return 1;
    
    }
    public int count(){
    return lsp.size();
    
    }
    public List<Sanpham> getAllSanpham(){
    return lsp;
    }
    public Sanpham findByID (String id){
        for (Sanpham sp : lsp) {
            if (sp.getMaSp().equalsIgnoreCase(id)) {
                return sp;
            }
        }
        return null;
    }
    public Sanpham getSanphamAtpoint(int position){
    return lsp.get(position);
    }
}
