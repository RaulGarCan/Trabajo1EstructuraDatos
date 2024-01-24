package Ejemplo;

import java.util.ArrayList;
import java.util.List;

public class NodoGrafo {
    int valor;
    List<NodoGrafo> vecinos;

    public NodoGrafo(int valor) {
        this.valor = valor;
        vecinos = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public List<NodoGrafo> getVecinos() {
        return vecinos;
    }

    public void addVecino(NodoGrafo vecino) {
        this.vecinos.add(vecino);
    }
}
