package huffman;

public class NodoArbol {

    char clave;
    int frecuencia;
    boolean esDato;
    NodoArbol nodoIzquierdo, nodoDerecho;

    public NodoArbol(char clave, int frecuencia, boolean EsD){
        this.clave = clave;
        this.esDato = EsD;
        this.frecuencia = frecuencia;
    }

    public char getClave(){
        return this.clave;
    }

    public void setClave(char clave){
        this.clave = clave;
    }

    public int getFrecuencia(){
        return this.frecuencia;
    }

    public void setFrecuencia(int frecuencia){
        this.frecuencia = frecuencia;
    }

    public boolean isEsDato(){
        return this.esDato;
    }

    public void setEsdato(boolean esDato){
        this.esDato = esDato;   
    }

}
