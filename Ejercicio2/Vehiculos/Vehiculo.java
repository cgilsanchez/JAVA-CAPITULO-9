package Ejercicio2.Vehiculos;

public class Vehiculo {

    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;
    
        
        public Vehiculo(){
            this.kilometrosRecorridos = 0;
            vehiculosCreados++;
        }

        public void anda(int metros){
            Vehiculo.kilometrosTotales=+metros;
            this.kilometrosRecorridos=+metros;
        }

        public int getKilometrosRecorridos() {
            return kilometrosRecorridos;
        }

        public static int getKilometrosTotales() {
            return kilometrosTotales;
        }
        public static int getVehiculosCreados() {
            return vehiculosCreados;
        }
    
}
