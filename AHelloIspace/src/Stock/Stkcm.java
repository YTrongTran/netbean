/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Stkcm implements Serializable
{
private int id;
private String desc;
private double price;
private int quantity;
public Stkcm (int id, String desc, double price, int quantity){
this.id=id;
this.desc=desc;
this.price= price;
this.quantity= quantity;

}

    Stkcm(int i, String haichau) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public String toString(){
return (id+" "+desc+" "+price+" "+quantity);

}
}
