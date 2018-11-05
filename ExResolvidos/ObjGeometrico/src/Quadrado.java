/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class Quadrado {
    double lado;
    
    Quadrado(double lado){
        this.lado = lado;
    }
    
    double area(){
        return lado * lado;
    }
    
    double perimetro(){
        return lado + lado + lado + lado;
    }
    
}
