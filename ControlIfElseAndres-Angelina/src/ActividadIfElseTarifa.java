import java.util.Scanner;
public class ActividadIfElseTarifa {
    /**
     * Asignacion de variables para eliminar números magicos.
     * EDAD_NIÑO: se le asigna un valor de 12 años.
     * TARIFA_NIÑO: Tarifaa minima por la edad.
     * ADULTO: se le asigna un valor de 17 años como limite antes de reconocer como adulto.
     * EDAD_MINIMA: No hay usuario existente con una edad menor a 0.
     * EDAD_MAXIMA: No hay usuario con una edad mayor a esa.
     * TARIFA_ESTUDIANTE: Al ser estudiante la tarifa es menor acorde a la edad.
     * TARIFA_NOESTUDIANTE: Al no ser estudiante la tarifa aumenta respecto a la edad.
     * TARIFA_UNIVERSITARIO: Una tarifa equlibrada entre edad y estudiante.
     * TARIFA_NOUNIVERSITARIIO: Mayor tarifa al ser adulto y no ser estudiante.
     * */
    public static int EDAD_NIÑO = 12;
    public static int TARIFA_NIÑO = 50;
    public static int ADULTO =17;
    public static int EDAD_MINIMA =0;
    public static int EDAD_MAXIMA =120;
    public static int TARIFA_ESTUDIANTE =60;
    public static int TARIFA_NOESTUDIANTE =80;
    public static int TARIFA_UNIVERSITARIO =90;
    public static int TARIFA_NOUNIVERSITARIO=120;


     public static void main (String[]args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("¿Eres estudiante?  Sí/No");
         String respuesta = scanner.next();
         boolean esEstudiante = respuesta.equals("si");
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad <EDAD_MINIMA || edad > EDAD_MAXIMA){
            System.out.println("Edad invalida.");
            scanner.close();
            return;
        }
        int TARIFA_FINAL = ObtenerTarifa (edad, esEstudiante);

        System.out.println("--------------------------------------------");
        System.out.println("Tu edad es de: "+ edad+ " años.");
        System.out.println("Eres estudiante: ");
        System.out.println(esEstudiante? "si":"No" );
        System.out.println("Tu tarifa es de: "+ TARIFA_FINAL);

         }
    public static int ObtenerTarifa(int edad, boolean esEstudiante) {
        if (edad < EDAD_NIÑO){
            return TARIFA_NIÑO;
        }
        if (edad <= ADULTO) {
            return esEstudiante ? TARIFA_ESTUDIANTE : TARIFA_NOESTUDIANTE;
        }
            return esEstudiante ? TARIFA_UNIVERSITARIO : TARIFA_NOUNIVERSITARIO;
    }
}