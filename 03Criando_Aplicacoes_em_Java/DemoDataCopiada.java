class DemoDataCopiada {

    public static void main(String[] argumentos) {

        Data lan�amentoDaAtlantis18 = new Data();
        Data in�cioDeOpera��oDoHAL = new Data();
        Data morteDeCharlesHuggins;
        lan�amentoDaAtlantis18.inicializaData((byte) 12, (byte) 1, (short) 1997);
        in�cioDeOpera��oDoHAL.inicializaData((byte) 12, (byte) 1, (short) 1997);
        morteDeCharlesHuggins = lan�amentoDaAtlantis18;
        System.out.println(lan�amentoDaAtlantis18 == morteDeCharlesHuggins);
        System.out.println(lan�amentoDaAtlantis18 == in�cioDeOpera��oDoHAL);
    }
}