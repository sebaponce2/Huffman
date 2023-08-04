package main;

public class Main {
    public static void main(String[] args) throws Exception {
        admArchivo = new AdmArchivo();
        arbolHuffman = new ArbolHuffman();
        admArchivo.cargarTablaHuffman("");
        arbolHuffman.procesarListaDeArboles(arbolHuffman.crearListaArboles(admArchivo.getTabl));
    }
}
