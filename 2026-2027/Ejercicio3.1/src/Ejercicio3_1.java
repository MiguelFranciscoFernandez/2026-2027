import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // Todos los ejercicios con el random

    /*
     * Ejercicio 1: Escribe un programa que pida un número y diga si es o no
     * múltiplo de 3.
     */
    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");
        int numero = random.nextInt(101);
        System.out.println("Número generado: " + numero);
        if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3.");
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 3.");
        }
        System.out.println();
    }

    /*
     * Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y
     * calcula y muestra el
     * mayor de los tres.
     */
    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        System.out.println("Números generados: " + a + ", " + b + ", " + c);
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
        System.out.println();
    }

    /*
     * Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H,
     * M, S correspondientes
     * a hora, minutos y segundos respectivamente, y comprueba si la hora que
     * indican es una hora válida.
     * 
     * Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
     * para las horas será
     * mayor o igual que cero y menor que 24. El valor válido para los minutos y
     * segundos estará
     * comprendido entre 0 y 59 ambos incluidos.
     */
    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");
        int horas = random.nextInt(24);
        int minutos = random.nextInt(60);
        int segundos = random.nextInt(60);
        System.out.println("Hora generada: " + horas + ":" + minutos + ":" + segundos);
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            System.out.println("La hora es válida." + horas + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("La hora no es válida.");
        }
        System.out.println();
    }

    /*
     * Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10,
     * y muestre en pantalla
     * el nombre en letras de ese número. Se debe controlar que se introduzca un
     * número válido.
     */
    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");
        int numero = random.nextInt(11);
        System.out.println("Número generado: " + numero);
        if (numero < 0 || numero > 10) {
            System.out.println("Número no válido.");
        } else {
            switch (numero) {
                case 0:
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
                case 10:
                    System.out.println("Diez");
                    break;
            }
        }
        System.out.println();
    }

    /**/
    public static void ejercicio5() {
        System.out.println("=== Ejercicio 5 ===");

    }

    /* */
    public static void ejercicio6() {
        System.out.println("=== Ejercicio 6 ===");

    }

    /* */
    public static void ejercicio7() {
        System.out.println("=== Ejercicio 7 ===");

    }

    /* */
    public static void ejercicio8() {
        System.out.println("=== Ejercicio 8 ===");

    }

    /* */
    public static void ejercicio9() {
        System.out.println("=== Ejercicio 9 ===");

    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        scanner.close();
    }
}
