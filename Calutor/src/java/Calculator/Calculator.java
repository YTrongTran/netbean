/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Administrator
 */
public class Calculator {
    private  double numberA,NumberB;

    public Calculator() {
    }

    public Calculator(double numberA, double NumberB) {
        this.numberA = numberA;
        this.NumberB = NumberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return NumberB;
    }

    public void setNumberB(double NumberB) {
        this.NumberB = NumberB;
    }
    
}
