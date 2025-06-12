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
        System.out.println("");

        int n = 4;
        FuncionesL.adivinadorpar(n);
        System.out.println("");

        int numeros = 8;
        int cuadrado = FuncionesL.cuadrado(numeros);
        System.out.println("El cuadrado de su numero es: " + cuadrado);

        System.out.println("");
        int factor = 13;
        long respuesta = FuncionesL.factorial(factor);
        System.out.println("Mi estimado, su factorial es de: " + respuesta);

        int listaN = FuncionesA.sumatoria(5, 15, 23, 23, 2);
        System.out.println("La suma es de La lista de numeros es: " + listaN);
        System.out.println("");

        double[] listapromedio = {5.5, 8.7, 9.0, 10.5, 1.4};
        double promedio = FuncionesA.promedio(listapromedio);
        System.out.println("El promedio es de: " + promedio);
        System.out.println("");

        int[] listado2 = {1, 2, 3, 4 , 5, 6, 7, 8, 9,10};
        int numeroquequiero =12;
        boolean Sale = FuncionesA.detector(listado2, numeroquequiero);
        System.out.println(listado2);
        if (Sale){
            System.out.println(numeroquequiero + ": Si sale en la lista, ciego");
        }
        else {
            System.out.println(numeroquequiero + ": No sale, creo que sos ciego");
        }

        System.out.println("");
        String [] nombres = {"Mariano", "Mariano", "Mariano", "Juan", "Fran", "Messi", "Ronaldo", "Ariel"};
        String palabraclave= "Mariano";
        int recuento = FuncionesA.palabra(nombres, palabraclave);
        System.out.println("La palabra: " + palabraclave + " sale un total de " + recuento + " veces");
        System.out.println("");

        int [] valores = {1, 2, 3, 4, 5, 6};
        int [] corchete= FuncionesC.listacorchete(valores);
        System.out.println("");

        int [] vuelta = FuncionesC.darvuelta(valores);
        System.out.println("");

        int [] notas = {1, 6, 10, 9, 9};
        String [] alumno = {"Juan", "Perez", "Toledo", "Flores", "Gabi"};
        String notasxalumno = FuncionesC.mejor(alumno, notas);

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






