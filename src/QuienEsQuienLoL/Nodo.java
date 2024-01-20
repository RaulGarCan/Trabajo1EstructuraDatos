package QuienEsQuienLoL;

public class Nodo {
    private String pregunta;
    private String respuesta;
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private String campeon;
    private Nodo padre;

    public Nodo(String pregunta, String respuesta, Nodo padre) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.padre = padre;
    }
    public Nodo(){}

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
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

    public String getCampeon() {
        return campeon;
    }

    public void setCampeon(String campeon) {
        this.campeon = campeon;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
}
