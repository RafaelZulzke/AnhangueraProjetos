class TestaDataSimples {

    public static void main(String[] args) {

        DataSimples d1 = new DataSimples();
        d1.inicializaDataSimples(
                (byte)15, (byte)8, (short)2009);
        d1.mostraDataSimples();

        DataSimples d2 = new DataSimples();
        d2.inicializaDataSimples(
                (byte)16, (byte)8, (short)2009);
        d2.mostraDataSimples();

        System.out.println(d1.ÈIgual(d2));




    }

}
