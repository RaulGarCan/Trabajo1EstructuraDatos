package Ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<Integer> pre = new ArrayList<>();
    static ArrayList<Integer> in = new ArrayList<>();
    static ArrayList<Integer> post = new ArrayList<>();
    static ArrayList<NodoGrafo> visitados = new ArrayList<>();
    public static void main(String[] args) {
        //arbolBinario();
        //arbolNoBinario();
        grafo();
    }
    public static void arbolBinario(){
        NodoBinario puntero;
        NodoBinario raiz = new NodoBinario(1);

        raiz.setHijoIzq(new NodoBinario(2));
        puntero = raiz.getHijoIzq();
        puntero.setHijoDer(new NodoBinario(3));
        puntero = puntero.getHijoDer();
        puntero.setHijoIzq(new NodoBinario(4));

        raiz.setHijoDer(new NodoBinario(5));
        puntero = raiz.getHijoDer();
        puntero.setHijoIzq(new NodoBinario(6));
        puntero = raiz.getHijoDer();
        puntero.setHijoDer(new NodoBinario(7));

        //recorrerEnBucle(raiz);
        recorridoRecursivo(raiz);

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    public static void arbolNoBinario(){
        NodoNoBinario puntero;
        NodoNoBinario raiz = new NodoNoBinario(1);
        NodoNoBinario[] hijos = {
                new NodoNoBinario(2),
                new NodoNoBinario(3),
                new NodoNoBinario(4),
                new NodoNoBinario(5)
        };
        raiz.addHijos(hijos);

        puntero = raiz.getHijos().get(0);
        hijos = new NodoNoBinario[]{
                new NodoNoBinario(6),
                new NodoNoBinario(7)
        };
        puntero.addHijos(hijos);

        puntero = puntero.hijos.get(0);
        puntero.addHijo(new NodoNoBinario(8));
        puntero = raiz.getHijos().get(1);
        hijos = new NodoNoBinario[]{
                new NodoNoBinario(9),
                new NodoNoBinario(10)
        };
        puntero.addHijos(hijos);

        puntero = raiz.getHijos().get(3);
        hijos = new NodoNoBinario[]{
                new NodoNoBinario(11),
                new NodoNoBinario(12),
                new NodoNoBinario(13)
        };
        puntero.addHijos(hijos);

        recorridoRecursivo(raiz);
    }
    public static void grafo(){
        ArrayList<NodoGrafo> grafo = new ArrayList<>();

        grafo.add(new NodoGrafo(1));
        grafo.add(new NodoGrafo(2));
        grafo.add(new NodoGrafo(3));
        grafo.add(new NodoGrafo(4));
        grafo.add(new NodoGrafo(5));
        grafo.add(new NodoGrafo(6));
        grafo.add(new NodoGrafo(7));

        NodoGrafo puntero;
        puntero = grafo.get(0); // 1
        puntero.addVecino(grafo.get(1));
        puntero.addVecino(grafo.get(5));

        puntero = grafo.get(1); // 2
        puntero.addVecino(grafo.get(0));
        puntero.addVecino(grafo.get(4));
        puntero.addVecino(grafo.get(2));

        puntero = grafo.get(2); // 3
        puntero.addVecino(grafo.get(1));
        puntero.addVecino(grafo.get(5));
        puntero.addVecino(grafo.get(6));
        puntero.addVecino(grafo.get(3));

        puntero = grafo.get(3); // 4
        puntero.addVecino(grafo.get(4));
        puntero.addVecino(grafo.get(2));
        puntero.addVecino(grafo.get(6));

        puntero = grafo.get(4); // 5
        puntero.addVecino(grafo.get(1));
        puntero.addVecino(grafo.get(3));

        puntero = grafo.get(5); // 6
        puntero.addVecino(grafo.get(0));
        puntero.addVecino(grafo.get(2));
        puntero.addVecino(grafo.get(6));

        puntero = grafo.get(6); // 7
        puntero.addVecino(grafo.get(5));
        puntero.addVecino(grafo.get(2));
        puntero.addVecino(grafo.get(3));

        recorridoRecursivo(grafo.get(0));
    }

    public static void recorrerEnBucle(NodoBinario raiz){
        ArrayList<NodoBinario> noVisitado = new ArrayList<>();
        noVisitado.add(raiz);

        while (!noVisitado.isEmpty()){
            NodoBinario visitado = noVisitado.get(0);
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
    public static void recorridoRecursivo(NodoBinario x){
        System.out.println(x.getValor());
        pre.add(x.getValor());
        if(x.getHijoIzq() != null){
            recorridoRecursivo(x.getHijoIzq());
        }
        in.add(x.getValor());
        if(x.getHijoDer()!=null){
            recorridoRecursivo(x.getHijoDer());
        }
        post.add(x.getValor());
    }
    public static void recorridoRecursivo(NodoNoBinario x){
        for(NodoNoBinario hijo : x.getHijos()){
            recorridoRecursivo(hijo);
        }
        System.out.println(x.getValor());
    }

    public static void recorridoRecursivo(NodoGrafo x){
        if(!visitados.contains(x)) {
            visitados.add(x);
            for (NodoGrafo vecino : x.getVecinos()) {
                recorridoRecursivo(vecino);
            }
            System.out.println(x.getValor());
        }
    }
}
