import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void holamundo() {
        System.out.println("Hola Mundo");
    }

    public static void suma(int a, int b) {
        int c = a + b;
        System.out.printf("%d + %d = %d", a, b, c);
    }

    public static void es_par(int n) {
        if (n % 2 == 0) {
            System.out.println("el numero es par");
        }
        else {
            System.out.println("el numero es impar");
        }
    }

    public static void factorial(int n) {
        int r = 1;
        for (int i = n; i >= 1; i--) {
            r = r * i;
        }
        System.out.printf("%d!  = %d", n, r);
    }

    public  static void tabla(int n) {
        int r;
        for (int i = 1; i <= 10; i++) {
            r = n * i;
            System.out.printf("%d * %d = %d\n", n, i, r);
        }
    }

    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       int opcion = 1;

       do {

           int x = 0, y = 0, n = 0;

           System.out.println("seleccione un ejercicio");
           System.out.printf("1)hola mundo %n2)suma %n3)es par %n4)factorial %n5)tabla %n6)terminar %n");
           opcion = scanner.nextInt();

           switch (opcion) {
               case 1:
                   holamundo();
                   break;
               case 2:
                  System.out.println("ingrese un numero");
                  x = scanner.nextInt();
                  System.out.println("ingrese otro numero");
                 y = scanner.nextInt();
                 suma(x,y);
                break;
               case 3:
                   System.out.println("ingrese un numero");
                   n =scanner.nextInt();
                   es_par(n);
               break;
               case 4:
                   System.out.println("ingrese un numero");
                  x = scanner.nextInt();
                   factorial(x);
               break;

               case 5:
                   System.out.println("ingrese un numero");
                    n = scanner.nextInt();
                   tabla(n);
               break;

               case 6:
                   System.out.println("¡Adios!");
               break;

               default:
                   System.out.println("opcion invalida");
                   break;
           }

           System.out.printf("%n %n %n");
       }while (opcion!=6);
    }
}