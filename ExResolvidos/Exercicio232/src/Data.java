/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class Data {

    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = 2016;
    }

    boolean vemAntes(Data d) {
        if (ano < d.ano) {
            return true;
        } else if (ano > d.ano) {
            return false;
        } else //iguais
        if (mes < d.mes) {
            return true;
        } else if (mes > d.mes) {
            return false;
        } else //iguais
        if (dia < d.dia) {
            return true;
        } else if (dia > d.dia) {
            return false;
        }
        return true; // tudo igual
    }

//    String mostraData() {
//        return dia + "/" + mes + "/" + ano;
//    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    
    
}
