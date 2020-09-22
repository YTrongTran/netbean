/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhdoituong;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Studentweb {
    private int id;
    private String name;
    private double  php1;
    private double php2;
    private double btc;

    public Studentweb(){
}
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhp1(double php1) {
        this.php1 = php1;
    }

    public void setPhp2(double php2) {
        this.php2 = php2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPhp1() {
        return php1;
    }

    public double getPhp2() {
        return php2;
    }

    public Studentweb(int id, String name, double php1, double php2) {
        this.id = id;
        this.name = name;
        this.php1 = php1;
        this.php2 = php2;
    }
    public double agv(double m1,double m2){
    return (m1+m2)/2;
    
    }
    public double sum (double m1,double m2){
    return m1+m2;
  
    }
    public void getxeploai(double tbc){
    String xl= "";
        if (tbc >=8) {
            xl=" gioi ";
        } else {
            if (tbc >=6.5) {
                xl = "kha";
            } 
        }  
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("name");
        setName(sc.next());
        System.out.println("so1");
        setPhp1(sc.nextInt());
        System.out.println("so2");
        setPhp2(sc.nextInt());
    }
    public void output(){
    double tbc= agv(php1, php2);
        System.out.println("=>"+getId()+"-"+getName()+"-"+sum(php1, php2)+"-"+agv(php1,php2));
    getxeploai(tbc);
    }
    
    
    public static void main(String[] args) {
        Studentweb sw= new Studentweb();
        sw.input();
        sw.output();
        
    }

   
}



