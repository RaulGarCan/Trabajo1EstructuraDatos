package QuienEsQuienLoL;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void rellenarDatos(Nodo raiz, String[] preguntas){
        Nodo puntero;

        raiz.setHijoIzq(new Nodo(preguntas[1],"No",raiz));
        raiz.setHijoDer(new Nodo(preguntas[2],"No",raiz));

        puntero = raiz.getHijoIzq(); // Pregunta1
        puntero.setHijoIzq(new Nodo(preguntas[3],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[4],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 3
        puntero.setHijoIzq(new Nodo(preguntas[7],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[8],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 7
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Shen");
        puntero.setHijoDer(new Nodo());
        puntero.setCampeon("Sett");

        puntero = puntero.getPadre(); // Pregunta 3
        puntero = puntero.getHijoDer(); // Pregunta 8
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Khazix");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Nilah");

        puntero = puntero.getPadre(); // Pregunta 3
        puntero = puntero.getPadre(); // Pregunta 1
        puntero = puntero.getHijoDer(); // Pregunta 4
        puntero.setHijoIzq(new Nodo(preguntas[9],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[10],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 9
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Kassadin");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Akali");

        puntero = puntero.getPadre(); // Pregunta 4
        puntero = puntero.getHijoDer(); // Pregunta 10
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Blitzcrank");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Ivern");

        puntero = raiz.getHijoDer(); // Pregunta 2
        puntero.setHijoIzq(new Nodo(preguntas[5],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[6],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 5
        puntero.setHijoIzq(new Nodo(preguntas[11],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[12],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 11
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Lux");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Bardo");

        puntero = puntero.getPadre(); // Pregunta 5
        puntero = puntero.getHijoDer(); // Pregunta 12
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Thresh");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Heimerdinger");

        puntero = puntero.getPadre(); // Pregunta 5
        puntero = puntero.getPadre(); // Pregunta 2
        puntero = puntero.getHijoDer(); // Pregunta 6
        puntero.setHijoIzq(new Nodo(preguntas[13],"No",puntero));
        puntero.setHijoDer(new Nodo(preguntas[14],"No",puntero));

        puntero = puntero.getHijoIzq(); // Pregunta 13
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Jhin");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Aphelios");

        puntero = puntero.getPadre(); // Pregunta 6
        puntero = puntero.getHijoDer(); // Pregunta 14
        puntero.setHijoIzq(new Nodo());
        puntero.getHijoIzq().setCampeon("Zeri");
        puntero.setHijoDer(new Nodo());
        puntero.getHijoDer().setCampeon("Ashe");
    }
    public static void recorridoRecursivo(Nodo x){
        Scanner userInput = new Scanner(System.in);
        String respuesta = "";

        if(x.getPregunta()!=null){
            System.out.println(x.getPregunta());
            respuesta = userInput.nextLine();
        }
        if(respuesta.equalsIgnoreCase("Si")){
            x.setRespuesta(respuesta);
        }
        if(x.getCampeon()!=null){
            System.out.println(x.getCampeon());
        }
        if(x.getRespuesta()!=null){
            if(x.getRespuesta().equalsIgnoreCase("Si")){
                x.setHijoDer(null);
            } else {
                x.setHijoIzq(null);
            }
        }
        if(x.getHijoIzq() != null){
            recorridoRecursivo(x.getHijoIzq());
        }
        if(x.getHijoDer()!=null){
            recorridoRecursivo(x.getHijoDer());
        }
    }
    public static void main(String[] args) {
        String[] campeones = {"Shen","Sett","Khazix","Nilah","Kassadin","Akali","Blitzcrank","Ivern","Lux","Bardo","Thresh","Heimerdinger","Jhin","Aphelios","Zeri","Ashe"};
        System.out.println("Elige uno de los siguientes Campeones:\n"+ Arrays.toString(campeones));
        String[] preguntas = {
                "¿Es cuerpo a cuerpo?",
                "¿Es de daño físico?",
                "¿Es de daño mágico?",
                "¿Es top?",
                "¿Es mid?",
                "¿Es mago?",
                "¿Utiliza munición?",
                "¿Es tanque?",
                "¿Es jungla?",
                "¿Es del vacío?",
                "¿Es support?",
                "¿Es humano?",
                "¿Es support?",
                "¿Es un artista?",
                "¿Es de Zaun?"
        };
        Nodo raiz = new Nodo(preguntas[0],"No", null); // Pregunta 0
        rellenarDatos(raiz, preguntas);
        recorridoRecursivo(raiz);
    }
}
