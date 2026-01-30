import java.util.Random;
import java.util.Scanner;
// <>

public class App {
    public static int intentofallado =0;
    public static int datononumerico =0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int max = 100;
        int min = 1;
        int secreto = random.nextInt(100) + 1; // Genera un numero random ente el 1 al 100
        int intentos = 0;
        int limiteIntentos = 7;
        boolean gano = false;

        System.out.println("Adivina el numero secreto (1-100)");
        while(intentos<limiteIntentos){
            int numero= obtenerNumeroValido(sc, "intento "+(intentos+1),min, max);
            intentos ++;
            if (numero == secreto){
                System.out.println("Felicidades, ganaste mi brou!"+ intentos+"Estuviste fuera del rango "+intentofallado+" veces"+" Escribiste un valor no numerico "+datononumerico+" Veces");
                gano = true; // Para saber si el usuario gano o no.
                break;
            } else if (numero > secreto) {
                System.out.println("El numero que estas buscando es menor a"+numero);
            }else{
                System.out.println("El numero que estas buscando es mayor a"+ numero);
            }
        }if (!gano){
            System.out.println("Perdiste, el numero secreto es "+secreto+"Estuviste fuera del rango "+intentofallado+" Veces  "+" Escribiste un valor no numerico "+datononumerico+" veces");
        }
    }
    public static int obtenerNumeroValido(Scanner sc, String mensaje, int min, int max ){
        int valor;
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                //Es un dato numerico
                valor = sc.nextInt();
                if (valor>=min && valor<=max){
                    return valor;
                }
                System.out.println("El valor ingresado esta fuera del rango(1-100)");
                intentofallado++;
            }else{
                System.out.println("El dato ingresado no es numerico");
                datononumerico++;
                sc.next();
            }

        }
    }



}