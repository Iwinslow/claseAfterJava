import java.util.Scanner;

public class AppCalculator {
    public static void main(String[] args) {

        // // int a = Integer.parseInt((new Scanner(System.in)).nextLine());

        Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el primer numero:");

        // int a = Integer.parseInt(sc.nextLine());
        // System.out.println("Ingrese el segundo numero:");
        // int b = Integer.parseInt(sc.nextLine());

        // Calculadora calculadora = new Calculadora(a, b);

        // calculadora.restar();
        // calculadora.sumar();

        // System.out.println("Ingrese el primer numero:");
        // int c = Integer.parseInt(sc.nextLine());
        // System.out.println("Ingrese el segundo numero:");
        // int d = Integer.parseInt(sc.nextLine());

        // calculadora.restar(c, d);
        // calculadora.sumar(c, d);

        // calculadora.setFirstNumber(1);
        // calculadora.setSecondNumber(1);

        Calculadora calculadoraDos = new Calculadora(1, 1);

        int quiereCalcular = -1;

        do {
            int respuesta = -1;

            do {
                System.out.println("Queres sumar o restar? (SUMAR = 1; RESTAR = 2)");
                try {
                    respuesta = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Ingrese un numero entero");
                }
            } while (!(respuesta == 1 || respuesta == 2));
            /*
             * otras posibilidades:
             * (!(respuesta!=0 || respuesta!=0 )
             * respuesta!=0 && respuesta!=1
             */
            calculadoraDos.realizarOperacion(respuesta);

            try {
                System.out.println("Queres volver a calcular algo?(SI = 1; NO = 0)");
                quiereCalcular = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            }

        } while (quiereCalcular == 1);

        sc.close();
    }
}
