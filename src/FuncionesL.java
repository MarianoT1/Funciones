//Clase para las Funciones Logicas

public class FuncionesL extends Funciones{

    //Metodo para saber si es par el numero
    public static void adivinadorpar(int n){
        if (n % 2 ==0 ){
            System.out.println(n + ": En efecto, su numero elegido es divisible por 2");
        }
        else {
            System.out.println(n + ": Su numero no es posible de ser divido por 2. Recomendamos que se aprenda las tablas");
        }
    }

    //Metodo para el saber el cuadrado de un numero
    public static int cuadrado(int numero){
     return numero * numero;
    }

    //Metodo para el factorial, no tengo que es un factorial. No le digan a Luis que dije eso
    public static long factorial (int factor){
       if (factor <1 ) {
           return 1;
       }
       else {
       return factor * factorial(factor-1);
       }

    }

}
