public class Main {
    public static void main(String[] args) {
        Generala generala = new Generala();
        generala.GenerarValores();

        int[] valoresDados = generala.valores;

        try {
            if (generala.todosIguales(valoresDados)) {
                System.out.println("GENERALA");
                return;
            }

            int[] repeticiones = generala.contarRepeticiones(valoresDados);
            int contador3 = 0;
            int contador2 = 0;
            for (int i = 0; i < 6; i++) {
                if (repeticiones[i] == 4) {
                    System.out.println("POKER");
                    return;
                } else if (repeticiones[i] == 3) {
                    contador3++;
                } else if (repeticiones[i] == 2) {
                    contador2++; // Incrementar el contador de números repetidos dos veces
                }
            }

            if (contador2 == 1 && contador3 == 1) {
                System.out.println("Full");
                return;
            }

            if (generala.cartasSecuenciales(valoresDados)) {
                System.out.println("ESCALERA");
                return;
            }

            System.out.println("NADA");
        } catch (Exception e) {
            System.out.println("INVALIDO");
            e.printStackTrace(); // Imprime el seguimiento de la pila para ayudar en la depuración
        }
    }
}
