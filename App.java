public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        dibujarFigura(3);
        System.out.println();
    }

    private static void dibujarFigura(int n) {
        String fila = "";

        if (n < 1 || n > 9){
            System.out.println("Debes poner un numero del 1 al 9");
            return;
        }

        // Solución normal
        
        /*
        
        for (int i = n; i > 0; i--) {
            fila += i;
        }

        for (int i = 2; i <= n; i++) {
            fila += i;
        }
        
        for (int i = 0; i < fila.length(); i++) {
            System.out.println(fila);
        }
        */

        // Solución de psicopata y optimizado

        for (int j = 0; j < (n * 2) - 1; j++) {
            for (int i = 0; i < (n * 2) - 1; i++)
                System.out.print((n - i > 0) ? n - i : ((n - i) * - 1) + 2);
            System.out.println();
        }
    }
}
