package Ejercicio2;

import Ejercicio2.Vehiculos.Bicicleta;
import Ejercicio2.Vehiculos.Coche;
import Ejercicio2.Vehiculos.Vehiculo;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(27.5f);
        Coche coche = new Coche(200);
        boolean salir = true;
        
        
            
        do{

            System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8):");
        System.out.println();
        
            int opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        bicicleta.anda(500);
                    break;
                    case 2:
                        bicicleta.caballito(200);
                    break;
                    case 3:
                        coche.anda(1000);
                    break;
                    case 4:
                        coche.quemarueda(100);
                    break;
                    case 5:
                        System.out.printf("El kilometraje total de la bicicleta es %d", bicicleta.getKilometrosRecorridos());
                    break;
                    case 6:
                    System.out.printf("El kilometraje total del coche es %d", coche.getKilometrosRecorridos());
                    break;
                    
                    case 7:
                    System.out.printf("El kilometraje total es de %d", Vehiculo.getKilometrosTotales());
                    break;
                    case 8:
                    salir = false;
                    break;
    
                default:
    
                    break;
            }
            }while(salir==true);
        
    }
}
