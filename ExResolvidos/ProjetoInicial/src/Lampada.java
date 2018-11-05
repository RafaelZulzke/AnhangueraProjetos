/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class Lampada {
    
    boolean estado;
    
    public Lampada(){
        
    }
    
    public Lampada(boolean estado){
        this.estado = estado;
    }
    
    void ligar(){
        estado = true;
    }
    
    void desligar(){
        estado = false;
    }

    boolean isEstado() {
        return estado;
    }

    void mostrar(){
        if (isEstado())
            System.out.println("Lampada acesa!");
        else
            System.out.println("Lampada apagada!");
    }
    
    String mostrarOutraVez(){
        if (isEstado())
            return "Acesa!";
        return "Apagada!";
    }
}
