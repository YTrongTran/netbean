/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LAptop
 */
public class Major {
    private int id;
    private String name;

    public Major() {
    }

    public Major(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Major(int major) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Major{" + "id=" + id + ", name=" + name + '}';
    }

   
}
