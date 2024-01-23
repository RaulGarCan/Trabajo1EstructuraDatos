package Ejemplo;

import java.util.ArrayList;
import java.util.List;

public class NodoNoBinario {
    int valor;
    List<NodoNoBinario> hijos;

    public NodoNoBinario(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public List<NodoNoBinario> getHijos() {
        return hijos;
    }

    public void addHijo(NodoNoBinario hijo){
        this.hijos.add(hijo);
    }
    public void addHijos(NodoNoBinario[] hijos){
        for(NodoNoBinario hijo : hijos){
            this.hijos.add(hijo);
        }
    }
}
