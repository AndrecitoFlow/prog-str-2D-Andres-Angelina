import java.util.Scanner;

public class Main {
    public static double RANGO_BAJO=18.5;
    public static double RANGO_MEDIO=25;
    public static double RANGO_ALTO=30;
    public static double VALOR_CAMBIO=1.8;
    public static double CONSTANTE_F= 32;
    public static double CONSTANTE_PI=3.1416;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu CALCULOS DIVERTIDOS");
            System.out.println("1. Calcular IMC");
            System.out.println("2.  Calcular el área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular el área de un circulo");
            System.out.println("5. Salir de CALCULOS DIVERTIDOS");
            System.out.println("¿Qué quieres hacer? Ingresa tu opción");

            opcion= scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Calculemos tu IMC");
                    double Pesokg = obtenerDouble(scanner, "Ingresa el peso en Kilogramos: ");
                    double Alturam = obtenerDouble(scanner,"Ingresa la altura en Metros");
                    double IMC = calcularIMC(Pesokg,Alturam);
                    System.out.println("Tu IMC es: "+IMC);
                    System.out.println("Clasificación: "+obtenerClasificacion(IMC) );
                    break;
                case 2:
                    System.out.println("Calculemos el área del rectángulo");
                    double base = obtenerDouble(scanner, "Ingresa el valor de tu base en cm: ");
                    double altura = obtenerDouble(scanner, "Ingresa la altura en cm: ");
                    double area = calculararea(altura, base);
                    System.out.println("El área del rectángulo es: "+area+"cm");
                    break;
                case 3:
                    System.out.println("Convirtamos Fahereinthait");
                    double celcius = obtenerDouble(scanner,"Ingresa los grados que quieres convertir: ");
                    double Farenhait = converirgrados(celcius,VALOR_CAMBIO , CONSTANTE_F);
                    System.out.println(celcius+"°C equivalen a: "+Farenhait+"°F");
                    break;
                case 4:
                    System.out.println("Calculemos el área del círculo");
                    double radio = obtenerDouble(scanner,"Ingresa el radio en cm: ");
                    double areaC = areacirculo(radio, CONSTANTE_PI);
                    System.out.println("EL área de tu círculo es:"+areaC+"cm");
                    break;
                case 5:
                    System.out.println("Cerraste el programa");
                    break;
                default:
                    System.out.println("No logre captar tu petición, vuelve a intentar");
                }

            } while (opcion !=5);
        }

    /**
     * metodo para guardar los doubles en una variable
     * @param sc Guarda y combierte la variable en valor double
     * @param mensaje nos permite decirle al usuario de que queremos el dato
     * @return lo convierte en un double listo para usarse
     */
        public static double obtenerDouble(Scanner sc, String mensaje){
            System.out.println(mensaje);
            return sc.nextDouble();
        }

    /**
     * Metodo para calcular IMC a partir del peso y altura que proporcione el usuario
     * @param PesoKg Este dato es ingresado por el usuario en kilogramos
     * @param Alturam Este dato es ingresado por el usuario expresado en metros
     * @return Muestra el IMC calculado al usuario
     */
    public static double calcularIMC(double PesoKg, double Alturam){
        return PesoKg/(Alturam*Alturam);
    }

    /**Metodo de clasificacion del IMC
     * @param imc Este dato sera evaluado con los estandares que previamente habiamos asignado
     * @return devulve un mensaje con la clasificacion del IMC
     */
    public static String obtenerClasificacion(double imc){
        if(imc<RANGO_BAJO) return "Bajo peso";
        else if(imc<RANGO_MEDIO) return "Peso medio";
        else if(imc<RANGO_ALTO) return "Sobre peso";
        else return "Obesidad";
    }

    /**
     * Metodo para calcular el area de un rectangulo con una base y una altura
     * @param base la base nos la brinda el usuario en cm, es fundamental para la operacion
     * @param altura la altura nos la brinda el usuario en cm
     * @return muestra el area calculada con los datos prporcionados por el usuario
     */
    public static double calculararea(double base, double altura){
        return base*altura;
    }
    /**Metodo para convertir grados celcius a Farenheit
     * @param celcius Celcios es un dato que le solicitamos al usiario y usaremos en la conversion
     * @param VALOR_CAMBIO es parte de la formula global 3/2= 1.8, este valor no pude ser modificado
     * @param CONSTANTE_F parte de la formula global es la sumatoria final para la equivalencia
     * @return muestra los grados celcius que quiere convertir y los grados ya convertios en Farenhait
     */
    public static double converirgrados(double celcius, double VALOR_CAMBIO, double CONSTANTE_F){
        return (celcius*VALOR_CAMBIO) +CONSTANTE_F;
    }

    /**
     * Metodo para calcular el area de un circulo
     * @param radio el radio nos lo brinda el usuario en cm
     * @param CONSTANTE_PI El valor de pi el cual es una constante en este proceso
     * @return devuelve el area del circulo en centimetros cubicos
     */
    public static double areacirculo(double radio, double CONSTANTE_PI){
        return (radio*radio)*CONSTANTE_PI;
    }

}