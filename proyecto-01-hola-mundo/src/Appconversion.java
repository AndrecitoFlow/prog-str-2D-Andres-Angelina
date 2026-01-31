import java.util.Scanner;
// Esperemos se suba al git hub
public class Appconversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VALOR_CAMBIO = 1.8;
        final double CONSTANTE_GRADOS = 32;
        final double FACTOR_CAMBIOKM = 0.621371;

        int opcion = 0;
        int conversionesTotales = 0;
        int celsiusFahrenhait = 0;
        int fahrenhaitCelsius = 0;
        int kmMillas = 0;
        int millasKm = 0;

        do {
            System.out.println("-----------------------------");
            System.out.println("Conversiones divertidas");
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) Salir");
            System.out.print("Ingresa tu opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                if (opcion == 5) {
                   // el usuario salio entonces no hacemos nada
                } else if (opcion >= 1 && opcion <= 4) {
                    double valor;
                    // veridficamos que sea numerico
                    while (true) {
                        System.out.print("Ingresa el valor a convertir: ");
                        if (sc.hasNextDouble()) {
                            valor = sc.nextDouble();
                            break;
                        } else {
                            System.out.println("Ingresa un dato numerico");
                            sc.next();
                        }
                    }

                    switch (opcion) {
                        case 1:
                            System.out.println("Resultado: " + ((valor * VALOR_CAMBIO) + CONSTANTE_GRADOS) + " °F");
                            celsiusFahrenhait++;
                            break;
                        case 2:
                            System.out.println("Resultado: " + ((valor - CONSTANTE_GRADOS) * VALOR_CAMBIO) + " °C");
                            fahrenhaitCelsius++;
                            break;
                        case 3:
                            System.out.println("Resultado: " + (valor * FACTOR_CAMBIOKM) + " Millas");
                            kmMillas++;
                            break;
                        case 4:
                            System.out.println("Resultado: " + (valor / FACTOR_CAMBIOKM) + " Km");
                            millasKm++;
                            break;
                    }
                    conversionesTotales++;

                } else {
                    System.out.println("Tu opcion no esta en el rango :[ (1-5). Intenta de nuevo.");
                }
            } else {
                System.out.println("Opcion invalida, debes ingresar un numero.");
                sc.next();
            }

        } while (opcion != 5);

        System.out.println("--------------------------------");
        System.out.println("RESUMEN");
        System.out.println("Total de conversiones: " + conversionesTotales);
        System.out.println("°C a °F: " + celsiusFahrenhait);
        System.out.println("°F a °C: " + fahrenhaitCelsius);
        System.out.println("Km a Millas: " + kmMillas);
        System.out.println("Millas a Km: " + millasKm);

        System.out.println("Cerraste el programa");
    }
}