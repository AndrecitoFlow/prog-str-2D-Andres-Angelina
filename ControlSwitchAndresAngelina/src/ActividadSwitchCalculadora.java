import java.util.Scanner;
public class ActividadSwitchCalculadora {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("------------------------");
            System.out.println("Calculos básicos matemáticos");
            System.out.println("(Todas las operaciones deben de ser de dos digitos)");
            System.out.println("1) Sumar. 2)Restar. 3)Multiplicar. 4)Dividir.");
            System.out.println("¿Qué operación deseas realizar?");
            int opcion = scanner.nextInt();
            double VARIABLEA = ObtenerVaribleA(scanner,"Ingresa el primer digito:");
            double VARIABLEB = ObtenerVaribleB(scanner, "Ingresa el segundo digito:");
            switch (opcion){
                case 1:
                    System.out.println("Sumemos, dime que quieres sumar:");
                    double RESULTADO_SUMA = ObtenerSuma(VARIABLEA,VARIABLEB);
                    System.out.println("Digito1: "+ VARIABLEA+" Digito2: "+VARIABLEB);
                    System.out.println("El total de la suma es:"+ RESULTADO_SUMA);
                    break;
                case 2:
                    System.out.println("Restemos, dime que quieres restar:");
                    double RESULTADO_RESTA = ObtenerResta(VARIABLEA,VARIABLEB);
                    System.out.println("Digito1: "+VARIABLEA+" Digito2: "+VARIABLEB);
                    System.out.println("El total de la resta es: "+RESULTADO_RESTA);
                    break;
                case 3:
                    System.out.println("Multipliquemos, dime que quieres multiplicar:");
                    double RESULTADO_MULTIPLICACION = ObtenerMultiplicacion(VARIABLEA,VARIABLEB);
                    System.out.println("Digito1: "+VARIABLEA+" Digito2: "+VARIABLEB);
                    System.out.println("El total de la multiplicación es: "+RESULTADO_MULTIPLICACION);
                    break;
                case 4:
                    System.out.println("Dividamos, dime que quieres dividir:");
                    System.out.println("Ojo!, si tu segundo digito es 0 ó mayor 4 y menor a 0 no se podra ejecutar");
                    double RESULTADO_DIVISION = ObtenerDivision(VARIABLEA,VARIABLEB);
                    System.out.println("Digito1: "+VARIABLEA+" Digito2: "+VARIABLEB);
                    System.out.println("El total de la división es: "+RESULTADO_DIVISION);
                    break;
                default:
                    System.out.println("Opción invalida, suerte para la proxima");
                    break;
            }
        }
        public static double ObtenerVaribleA(Scanner scanner,String mensaje){
            System.out.println(mensaje);
            return scanner.nextDouble();
        }
        public static double ObtenerVaribleB(Scanner scanner,String mensaje){
            System.out.println(mensaje);
            return scanner.nextDouble();
        }
        public static double ObtenerSuma(double VARIABLEA, double VARIABLEB){
            double Suma= VARIABLEA+VARIABLEB;
            return Suma;
        }
        public static double ObtenerResta(double VARIABLEA, double VARIABLEB){
            double Resta= VARIABLEA-VARIABLEB;
            return Resta;
        }
        public static double ObtenerMultiplicacion(double VARIABLEA, double VARIABLEB){
            double Multiplicacion = VARIABLEA*VARIABLEB;
            return Multiplicacion;
        }
        public static double ObtenerDivision(double VARIABLEA, double VARIABLEB){
            double Division = VARIABLEA/VARIABLEB;
            if (VARIABLEB ==0){
                System.out.println("No se puede dividir entre cero");
                return 0;

            }
            if (VARIABLEB>=4 || VARIABLEB<=0){
                System.out.println("Opción inválida");
                return 0;
            }
            return Division;
        }
    }
