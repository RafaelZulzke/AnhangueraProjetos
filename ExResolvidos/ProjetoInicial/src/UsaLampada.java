/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class UsaLampada {
    
    public static void main(String args[]){
        Lampada l = new Lampada();
        
       // l.ligar();
        l.mostrar();
        System.out.println("A lampada L está " + l.mostrarOutraVez() + " e não está acesa!");
                
        l.desligar();
        l.mostrar();
        System.out.println(l.mostrarOutraVez());
        
        Lampada l2 = new Lampada(true);
        l2.desligar();
        l2.mostrar();
        System.out.println("A lampada L2 está " + l2.mostrarOutraVez() + " e não está acesa!");
    }
}
