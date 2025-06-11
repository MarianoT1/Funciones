import java.util.*;

public class Funciones {
    //Clase que voy a utilizar para Funciones Basicas
    public static void main(String[] args) {

        Saludo();
        System.out.println("");
        String Nombre = "Mariano";
        saludar(Nombre);
        System.out.println("");

        int base = 2;
        int altura = 7;
        int area= calculararea(base, altura);
        System.out.printf("La base del rectangulo es de: " + area);
        System.out.println("");

        String mensaje = "Ma levanta la ropa que está por llover";
        Mayuscula(mensaje);
        System.out.println(Mayuscula(mensaje));
        Menu();

        int n = 4;
        FuncionesL.adivinadorpar(n);

        int numeros = 8;
        int cuadrado = FuncionesL.cuadrado(numeros);
        System.out.println("El cuadrado de su numero es: " + cuadrado);

        int factor = 13;
        long respuesta = FuncionesL.factorial(factor);
        System.out.println("Mi estimado, su factorial es de: " + respuesta); 

    }

    //Metodo de saludo simple
    public static void Saludo(){
        System.out.println(" Sean Bienvenidos a las Funciones de Java ");
    }

    //Metodo para saludar con el Nombre
    public static void saludar(String Nombre){
        System.out.printf(" Hola mundo, soy " + Nombre);
    }

    //Metodo para calcular el area de un rectangulo
    public static int calculararea (int base, int altura){
        int area = base * altura;
        return  area;
    }

    //Metodo para las Mayusculas
    public static String Mayuscula (String mensaje){
        return mensaje.toUpperCase();
    }

    //Metodo para el menú (menu de opcines, no el menú de comer)
    public static void Menu(){
        System.out.println("  Opciones  ");
        System.out.println("1. Cocinar");
        System.out.println("2. Encargar");
        System.out.println("3. N0 Comer");
    }

}






