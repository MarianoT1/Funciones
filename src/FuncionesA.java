//Clase para las funciones con array y esas cosas

public class FuncionesA extends Funciones{
    private static double suma;

    //Metodo para la suma de los numeros en la lista
     public static int sumatoria(int... numeros){
         int suma = 0;
         for (int num : numeros){
             suma += num;
         }
         return suma;
     }

     //Metodo para calcular el promedio de una lista de numeros
     public static double promedio (double[] numeros){
         for (double num : numeros){
             suma += num;
         }
         return suma / numeros.length;
     }

     //Metodo para saber si un numero se encuentra en la lista (detector de numeros)
     public static boolean detector (int [] numeros, int numerosolicitado){
         for (int num: numeros){
             if (num == numerosolicitado){
                 return true;
             }
         }
         return false;
     }

     //Metodo para contar las palabras (Contador de Palabras)
    public static int palabra(String[] nombres, String palabrabuscada){
         int recuento =0;
         for (String elemento: nombres){
             if (elemento.equals(palabrabuscada)){
                 recuento++;
             }
         }
         return recuento++;
    }
}



