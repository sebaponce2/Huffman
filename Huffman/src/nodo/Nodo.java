package nodo;

public class Nodo {
    char dato;
    int frecuencia;
    Nodo nodoIzquierdo;
    Nodo nodoDerecho;

    public Nodo(char dato, int frecuencia){
        this.dato = dato;
        this.frecuencia = frecuencia;
    }
}
