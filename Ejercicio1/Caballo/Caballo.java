package Ejercicio1.Caballo;

public class Caballo {
    
    private String nombre;
    private int edad;
    private String color;

    public Caballo(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void caminar(int Kilometros){
        System.out.printf("He caminadp durante %d Kilometros\n" , Kilometros);
    }
    public void trotar(int metros){
        System.out.printf("He trotado durante %d metros\n",metros);
    }
    public void parar(int minutos){
        System.out.printf("He parado durante %d minutos\n", minutos);
    }
    public void esprintar(int metros){
        System.out.printf("He esprintado durante %d metros\n",metros);
    }
    

    
    

}
