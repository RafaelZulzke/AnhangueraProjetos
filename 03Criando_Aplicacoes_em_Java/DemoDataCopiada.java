class DemoDataCopiada {

    public static void main(String[] argumentos) {

        Data lançamentoDaAtlantis18 = new Data();
        Data inícioDeOperaçãoDoHAL = new Data();
        Data morteDeCharlesHuggins;
        lançamentoDaAtlantis18.inicializaData((byte) 12, (byte) 1, (short) 1997);
        inícioDeOperaçãoDoHAL.inicializaData((byte) 12, (byte) 1, (short) 1997);
        morteDeCharlesHuggins = lançamentoDaAtlantis18;
        System.out.println(lançamentoDaAtlantis18 == morteDeCharlesHuggins);
        System.out.println(lançamentoDaAtlantis18 == inícioDeOperaçãoDoHAL);
    }
}