package huffman;

import java.util.HashMap;
import java.util.List;

public interface ICrearListaDeArboles {
    public List<NodoArbol> crearListaArboles(HashMap<Integer,Integer> mapTablaHuffman);
    
    public void procesarListaDeArboles(List<NodoArbol> listaArbol);
 }
