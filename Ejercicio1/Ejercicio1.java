package Ejercicio1;

import Ejercicio1.Caballo.Caballo;

public class Ejercicio1{
    public static void main(String[] args) {
        try {
            Caballo Caballo = new Caballo("Paco", 4, "Negro");
            Caballo.caminar(1);
            Caballo.esprintar(300);
            Caballo.parar(3);
            Caballo.trotar(500);

        } catch (Exception e) {
            
        }
    }    
}