package Ejemplo;

public class NodoBinario {
    private int valor;
    private NodoBinario hijoIzq;
    private NodoBinario hijoDer;

    public NodoBinario(int valor) {
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

    public NodoBinario getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoBinario hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoBinario getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoBinario hijoDer) {
        this.hijoDer = hijoDer;
    }
}
