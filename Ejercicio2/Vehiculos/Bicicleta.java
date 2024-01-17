package Ejercicio2.Vehiculos;

public class Bicicleta extends Vehiculo{
    
    private float pulgadas;

    public Bicicleta(float n){
        super();
        this.pulgadas = n;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void caballito(int metros){
        System.out.printf("He hecho el caballito durante %d metros", metros);
    }
}
