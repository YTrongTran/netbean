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
public class LoaisanphamDAO {

    List<Loaisanpham> lsp = new ArrayList<Loaisanpham>();

    public LoaisanphamDAO() {
        lsp.add(new Loaisanpham("1", "samsung"));
        lsp.add(new Loaisanpham("2", "oppa"));
        
    }
    public int add(Loaisanpham sp){
    lsp.add(sp);
    return 1;
    }
    public List<Loaisanpham> getAllLoaisp(){
    
    return lsp;
    }

    
}
