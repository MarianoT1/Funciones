//Clase para las Funciones complejas

public class FuncionesC extends Funciones{


    // Metodo para dar una lista entre corchetes
    public static int[] listacorchete(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return numeros;
    }

    // Metodo para ordenar al reves una lista ingresada
  public static int[] darvuelta(int[] numeros) {
    int[] darvuel = new int[numeros.length];
    for (int i = 0; i < numeros.length; i++) {
        darvuel[i] = numeros[numeros.length - 1 - i];
    }
      for (int num : darvuel) {
          System.out.print(num + " ");

      }
      return darvuel;
  }


// Metodo para combinar 2 listas
public static String mejor(String[] nombres, int[] notas) {
    if (nombres.length == 0 || notas.length == 0 || nombres.length != notas.length) {
        return "Datos inválidos";
    }

    int elmejor = 0;
    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > notas[elmejor]) {
            elmejor = i;
        }
    }
    System.out.println("El mejor alumno es: " + nombres[elmejor] + " con la nota " + notas[elmejor]);
    return nombres[elmejor];
}
}

