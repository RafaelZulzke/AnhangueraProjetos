/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class UsaData {
    
    public static void main(String args[]){
        
        Data data1 = new Data(29, 8, 2016);
        Data data2 = new Data(20, 8);
        
        
        if ( data1.vemAntes(data2) ){
            System.out.println(data1.dia + "/" +
                    data1.mes + "/" + data1.ano +
                    " vem antes de " + data2.dia +
                    "/" + data2.mes + "/" + data2.ano);
        }else{
            System.out.println(data1 + " vem depois " + data2);
        }
        
    }
    
}
