package implementacaoDosModelosCap1;


public class Data {

    int dia;
    int mes;
    int ano;

    void inicializaData(
            int umDia, int umMes, int umAno) {
        if (dataEValida(umDia, umMes, umAno)) {
            dia = umDia;
            mes = umMes;
            ano = umAno;
        } else {
            dia = 0;
            mes = 0;
            ano = 0;
        }
    }

    boolean dataEValida(
            int umDia, int umMes, int umAno) {
        if ((umDia >= 1) && (umDia <= 31) &&
                (umMes >= 1) && (umMes <= 12)) {
            return true;
        } else {
            return false;
        }
    }

    void mostraData() {
        System.out.println(
                dia + "/" + mes + "/" + ano);
    }
    
}
