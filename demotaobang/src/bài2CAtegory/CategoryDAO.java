/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài2CAtegory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CategoryDAO {
    public static final String FILE_NAME="category.txt";
    List<Category> ls = new ArrayList<>();
    public int add(Category cate){
    ls.add(cate);
    return 1;
    }
    public int count (){
    return ls.size();
    
    }
    public int find(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Category cate = ls.get(i);
            if (cate.getId()==id) {
                pos  = i ;
            }
        }
    return pos;
    }
    public int del ( int id){
    int pos = find(id);
        if (pos>=0) {
            ls.remove(pos);
        }
    return pos;
    }
    public Category getCategoryByID(int id){
    int pos =find(id);
    Category cate =null;
        if (pos>=0) {
            cate=ls.get(pos);
        }
       return cate;
    }
    public int edit(Category cate  ){
    int pos =find(cate.getId());
        if (pos>=0) {
            ls.set(pos, cate);
        }
    return pos;
    }
    public void saveFile(){
//    FileUtils.writeFile(FILE_NAME,ls);

fileUtils.writeFile(FILE_NAME, ls);
    
    
    }
    public void getAllCategory(){
//    ls=FileUtils.readFile(FILE_NAME);
ls = fileUtils.readFile(FILE_NAME);
    
    }
     
}
