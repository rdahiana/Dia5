import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Generala {
    int[] valores = new int[5];

    public Generala() {
    }

    public Generala(int[] valores) {
        this.valores = valores;
    }

    @java.lang.Override
    public String toString() {
        return
                "valores=" + java.util.Arrays.toString(valores) ;
    }

    public void GenerarValores() {
        // Crear un objeto de la clase Random
        Random random = new Random();
        // Asignar valores aleatorios al array en el rango de 1 a 6 (inclusive)
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(6) + 1;
        }
    }


    public boolean todosIguales(int[] valores) {
        int valor1 = valores[0];
        for (int i = 1; i < valores.length; i++) {
            // Verificar si el sgt numero es igual
            if (valor1 != valores[i]) {
                return false; // Si no lo es, retornar false, ya que las cartas no están en orden secuencial
            }
        }
        // Si todas las comparaciones pasan sin retornar false, retornar true
        return true;
    }

    public boolean cartasSecuenciales(int[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
            // Almacenar el valor numérico del elemento en la posición i
            int valor1 = valores[i];

            // Almacenar el valor numérico del elemento en la posición i+1
            int valor2 = valores[i + 1];

            // Verificar si el valor numérico del siguiente elemento no es igual al valor numérico del elemento actual + 1
            if (valor2 != valor1 + 1) {
                return false; // Si no lo es, retornar false, ya que las cartas no están en orden secuencial
            }
        }
        // Si todas las comparaciones pasan sin retornar false, retornar true
        return true;
    }

    public int[] contarRepeticiones(int[] valores) {
        Map<Integer, Integer> repeticiones = new HashMap<>();

        // Itera sobre el array de números
        for (int numero : valores) {
            // Si el número ya está en el mapa, incrementa su contador de repeticiones
            repeticiones.put(numero, repeticiones.getOrDefault(numero, 0) + 1);
        }

        // Crear un array para almacenar la cantidad de repeticiones de cada número
        int[] repeticionesArray = new int[6]; // 6 porque hay 6 números

        // Obtener la cantidad de repeticiones de cada número del mapa y almacenarla en el array
        for (int i = 1; i <= 6; i++) {
            repeticionesArray[i - 1] = repeticiones.getOrDefault(i, 0);
        }

        return repeticionesArray;
    }
}
