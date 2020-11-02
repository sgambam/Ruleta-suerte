package ruleta_apuestas;

import java.util.Scanner;

public class Ruleta_Apuestas {

    public static void main(String[] args) {
        double a = 0, b = 0,apuestas = 0;
        int c = 0, color = 0, numero = 0;
        boolean participantes = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dinero que desea tener en la mesa de apuestas: ");
        b = sc.nextInt();
        a = b;
        if (a < 1000) {
            System.out.println("El valor ingresado es inferior a 1000");
        } else {
            do {
                if (a <= 0) {
                    System.out.println("Usted se ha quedado sin dinero");
                    participantes = true;
                } else {
                    System.out.println("------------------------------ RULETA DE APUESTAS --------------------------- \n"
                            + "\n"
                            + "1. Apostar al rojo\n"
                            + "2. Apostar al negro\n"
                            + "3. Apostar a un numero especifico\n"
                            + "4. Salir\n"
                            + "\n"
                            + "Elija una de las opciones anteriores: ");
                    c = sc.nextInt();
                    int num = (int) (Math.random() * 37);
                    if (num % 2 != 0) {
                        color = 1;
                    } else if (num % 2 == 0) {
                        color = 2;
                    }
                    switch (c) {
                        case 1:
                            System.out.print("Ingrese la cantidad que desea apostar (minimo 100): ");
                            b = sc.nextDouble();
                            apuestas = apuestas +b;
                            if (b > a || b < 100) {
                                System.out.println("Usted no tiene esa cantidad de dinero para apostar o no puede apostar menos de 100");
                            } else if (color == 1) {
                                b = b * 1.8;
                                a = a + b;
                                System.out.println("!FELICIDADES HAS GANADO¡ El número generado por la ruleta fue: " + num + ", es rojo.");
                                System.out.println("Su nuevo saldo es de " + a);
                            } else {
                                a = a - b;
                                System.out.println("LO SENTIMOS. El número generado por la ruleta fue: " + num + ", es negro. ");
                                System.out.println("Su nuevo saldo es de " + a);
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad que desea apostar (minimo 100): ");
                            b = sc.nextDouble();
                            apuestas = apuestas +b;
                            if (b > a || b < 100) {
                                System.out.println("Usted no tiene esa cantidad de dinero para apostar o no puede apostar menos de 100");
                            } else if (color == 2) {
                                b = b * 1.8;
                                a = a + b;
                                System.out.println("!FELICIDADES HAS GANADO¡ El número generado por la ruleta fue: " + num + ", es negro.");
                                System.out.println("Su nuevo saldo es de " + a);
                            } else {
                                a = a - b;
                                System.out.println("LO SENTIMOS. El número generado por la ruleta fue: " + num + ", es rojo. ");
                                System.out.println("Su nuevo saldo es de " + a);
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese la cantidad que desea apostar (minimo 100): ");
                            b = sc.nextDouble();
                            apuestas = apuestas +b;
                            if (b > a || b < 100) {
                                System.out.println("Usted no tiene esa cantidad de dinero para apostar o no puede apostar menos de 100");
                            } else {
                                System.out.print("Elija un numero entre 0 y 36: ");
                                numero = sc.nextInt();
                                if (numero == num) {
                                    b = b * 5;
                                    a = a + b;
                                    System.out.println("!FELICIDADES HAS GANADO¡ El número generado por la ruleta fue: " + num
                                            + ", y el numero que elegiste fue: " + numero);
                                    System.out.println("Su nuevo saldo es de " + a);
                                } else {
                                    a = a - b;
                                    System.out.println("LO SENTIMOS. El número generado por la ruleta fue: " + num
                                            + ",y el numero que elegiste fue: " + numero);
                                    System.out.println("Su nuevo saldo es de " + a);
                                }
                            }
                            break;
                        case 4:
                            participantes = true;
                            System.out.println("El jugador se ha retirado");
                            break;
                        default:
                            System.out.println("El valor elegido no esta en las opciones");
                    }
                }
            } while (!participantes);
        }
        System.out.println("Saldo final del participante es de: " + a);
        System.out.println("Cantidad de dinero apostado por el jugador es de: " + apuestas);
    }
}