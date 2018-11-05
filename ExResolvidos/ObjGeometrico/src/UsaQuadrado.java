/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class UsaQuadrado {
    public static void main(String args[]){
        Quadrado q1 = new Quadrado(5);
        System.out.println(" Quadrado de lado " + q1.lado + 
                " Area =  " + q1.area() + " Perimetro = " + 
                q1.perimetro());
    }
}
