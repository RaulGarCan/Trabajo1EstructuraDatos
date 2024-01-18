package Ejemplo;

public class Nodo {
    private int valor;
    private Nodo hijoIzq;
    private Nodo hijoDer;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
}
