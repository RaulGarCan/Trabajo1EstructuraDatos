package Ejemplo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Nodo puntero;
        Nodo raiz = new Nodo(1);

        raiz.setHijoIzq(new Nodo(2));
        puntero = raiz.getHijoIzq();
        puntero.setHijoDer(new Nodo(3));
        puntero = puntero.getHijoDer();
        puntero.setHijoIzq(new Nodo(4));

        raiz.setHijoDer(new Nodo(5));
        puntero = raiz.getHijoDer();
        puntero.setHijoIzq(new Nodo(6));
        puntero = raiz.getHijoDer();
        puntero.setHijoDer(new Nodo(7));

        //recorrerEnBucle(raiz);
        recorridoRecursivo(raiz);
    }

    public static void recorrerEnBucle(Nodo raiz){
        ArrayList<Nodo> noVisitado = new ArrayList<>();
        noVisitado.add(raiz);

        while (!noVisitado.isEmpty()){
            Nodo visitado = noVisitado.get(0);
            System.out.println(visitado.getValor());
            noVisitado.remove(0);
            if(visitado.getHijoIzq()!=null){
                noVisitado.add(visitado.getHijoIzq());
            }
            if(visitado.getHijoDer()!=null){
                noVisitado.add(visitado.getHijoDer());
            }
        }
    }
    public static void recorridoRecursivo(Nodo x){
        System.out.println(x.getValor());
        if(x.getHijoIzq() != null){
            recorridoRecursivo(x.getHijoIzq());
        }
        if(x.getHijoDer()!=null){
            recorridoRecursivo(x.getHijoDer());
        }
    }
}
