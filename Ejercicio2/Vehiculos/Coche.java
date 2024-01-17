package Ejercicio2.Vehiculos;

public class Coche extends Vehiculo {
    
    private int caballos;

    public Coche(int cv){
        super();
        this.caballos = cv;
    }



    public int getCaballos() {
        return caballos;
    }


    public void quemarueda(int metros){
        System.out.printf("He quemaso rueda %d metros", metros);
    }
}
