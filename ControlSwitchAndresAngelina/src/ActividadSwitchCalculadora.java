import java.util.Scanner;

/** Programa, un menu el cual te ayuda a hacer operaciones basicas.
 */
public class ActividadSwitchCalculadora {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("------------------------");
            System.out.println("Calculos básicos matemáticos");
            System.out.println("(Todas las operaciones deben de ser de dos digitos)");
            System.out.println("1) Sumar. 2)Restar. 3)Multiplicar. 4)Dividir.");
            System.out.println("¿Qué operación deseas realizar?");

            int opcion = scanner.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida");
            } else {
                double VariableA = obtenerVaribleA(scanner,"Ingresa el primer digito:");
                double VariableB = obtenerVaribleB(scanner, "Ingresa el segundo digito:");
                switch (opcion){
                    case 1:
                        System.out.println("Sumemos, dime que quieres sumar:");
                        double RESULTADO_SUMA = obtenerSuma(VariableA,VariableB);
                        System.out.println("Digito1: "+ VariableA+" Digito2: "+VariableB);
                        System.out.println("El total de la suma es:"+ RESULTADO_SUMA);
                        break;
                    case 2:
                        System.out.println("Restemos, dime que quieres restar:");
                        double RESULTADO_RESTA = obtenerResta(VariableA,VariableB);
                        System.out.println("Digito1: "+VariableA+" Digito2: "+VariableB);
                        System.out.println("El total de la resta es: "+RESULTADO_RESTA);
                        break;
                    case 3:
                        System.out.println("Multipliquemos, dime que quieres multiplicar:");
                        double RESULTADO_MULTIPLICACION = obtenerMultiplicacion(VariableA,VariableB);
                        System.out.println("Digito1: "+VariableA+" Digito2: "+VariableB);
                        System.out.println("El total de la multiplicación es: "+RESULTADO_MULTIPLICACION);
                        break;
                    case 4:
                        System.out.println("Dividamos, dime que quieres dividir:");
                        System.out.println("Ojo!, si tu segundo digito es 0 no se podra ejecutar");
                        if (VariableB==0){
                            System.out.println("No se puede dividr entre cero");
                        }else {
                            double RESULTADO_DIVISION = obtenerDivision(VariableA,VariableB);
                            System.out.println("Digito1: "+VariableA+" Digito2: "+VariableB);
                            System.out.println("El total de la división es: "+RESULTADO_DIVISION);
                        }
                        break;
                    default:
                        System.out.println("Opción invalida, suerte para la proxima");
                        break;
                }
            }

        }

    /**
     * Metodo que nos permite solicitar al usuario los valores y las almacena como decimal.
     * @param scanner las guarda en decimal
     * @param mensaje nos permite introducir un mensaje el cual el usuario leera.
     * @return lo guardamos
     */
        public static double obtenerVaribleA(Scanner scanner, String mensaje){
            System.out.println(mensaje);
            return scanner.nextDouble();
        }
        public static double obtenerVaribleB(Scanner scanner, String mensaje){
            System.out.println(mensaje);
            return scanner.nextDouble();
        }

    /**
     * Metodos para calcular cada peticion, suma, resta, multiplicacion y division.
     * @param variableA primer digito que nos da el usuario y el cual usaremos para las operaciones.
     * @param variableB segund digito el cual usamos en las operaciones.
     * @return Devuelve el resultado final de cada operacion.
     */
        public static double obtenerSuma(double variableA, double variableB){
            return variableA+variableB;
        }
        public static double obtenerResta(double variableA, double variableB){
            return variableA-variableB;
        }
        public static double obtenerMultiplicacion(double variableA, double variableB){
            return variableA*variableB;
        }
        public static double obtenerDivision(double variableA, double variableB){
            return variableA/variableB;
        }
    }
