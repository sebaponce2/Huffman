package huffman;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ArbolHuffman implements ICrearListaDeArboles{
    private NodoArbol nodoArbol2;

    @Override
    public List<NodoArbol> crearListaArboles(HashMap<Integer, Integer> mapTablaHuffman) {
        List<NodoArbol> nodoArbols = new ArrayList<NodoArbol>();
        int pos = 0;
        for (Integer key : mapTablaHuffman.keySet()) {
            if (key > 0) {
                pos++;
                NodoArbol nodo = new NodoArbol((char) key.intValue(), mapTablaHuffman.get(key), true);
                nodoArbols.add(nodo);
                System.out.println("Nodo ");
                System.out.println(pos);
                System.out.println(" " + (char) key.intValue() + "(");
                System.out.println(mapTablaHuffman.get(key));
                System.out.println("); ");
            }
        }

        return nodoArbols;
    }

    @Override
    public void procesarListaDeArboles(List<NodoArbol> listaArbol) {
        List<NodoArbol> listadeArbolAux = new ArrayList<NodoArbol>();        
    }
}
