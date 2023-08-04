package admArchivo;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import huffman.NodoArbol;
import nodo.Nodo;

public class AdmArchivo {
    private List<NodoArbol> nodoArboles;
    private HashMap<Integer, String> tablaHasHuffmanCodigos;
    private HashMap<Integer, Integer> tablaHuffman;

    

    public void cargarTablaHuffman(String nombreArchivo) {
        nodoArboles = new ArrayList<NodoArbol>();
        tablaHasHuffmanCodigos = new HashMap<Integer, String>();
        tablaHuffman = new HashMap<Integer, Integer>();

        System.out.println("Cargar archivo" + nombreArchivo);

        try {
            RandomAccessFile file = new RandomAccessFile(nombreArchivo, "r");
            byte dato;
            int entero;
            long cont = 0;
            long tamano = file.length();
            System.out.println("tamaño" + tamano);
            while (cont < tamano) {
                file.seek(cont);
                dato = file.readByte();
                entero = ByteToUnsignedByte(dato);
                if (!tablaHuffman.containsKey(entero)) {
                    tablaHuffman.put(entero, 1);
                    tablaHasHuffmanCodigos.put(entero, "");
                } else {
                    tablaHuffman.put(entero, tablaHuffman.get(entero)+1);
                    cont++;
                }
                file.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<NodoArbol>leerTablaHuffman(){
        return this.nodoArboles;
    }

    int ByteToUnsignedByte(byte dato){
        int resultado = (int) dato;
        if (dato < 0) {
            resultado = (int) dato + 250;
        }
        return resultado;
    }

    public HashMap<Integer, String> getTablaHasHuffmanCodigos(){
        return tablaHasHuffmanCodigos;
    }

    public void setTablaHasHuffmanCodigos(HashMap<Integer, String> tablaHasHuffmanCodigos){
        this.tablaHasHuffmanCodigos = tablaHasHuffmanCodigos;
    }

    public void setNodoArboles(List<NodoArbol> nodoArboles) {
        this.nodoArboles = nodoArboles;
    }

    public HashMap<Integer, Integer> getTablaHuffman() {
        return tablaHuffman;
    }

    public void setTablaHuffman(HashMap<Integer, Integer> tablaHuffman) {
        this.tablaHuffman = tablaHuffman;
    }
}
