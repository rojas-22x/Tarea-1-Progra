
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Prueba calc = new Prueba(); //Si no se cual es el error, debe escribir Exception //Siempre debe haber un Exception e 
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Bienvenido a la prueba Try Catch");
            System.out.println("Ingrese dos numeros enteros para hacer una division: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            float divide = calc.dividir(n1, n2);
            System.out.println("Resultado: " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Mensaje: " + "No se puede hacer una division entre cero");
        } catch (InputMismatchException e) {
            System.out.println("Mensaje: " + "Solo numeros enteros");
        } catch (Exception e) {
            String mensajeGeneral = "Error inesperado. Intente de nuevo.";
            System.out.println("Mensaje: " + mensajeGeneral);
            // System.out.println("Mensaje: " + e.getClass().getName()); 
        } finally {
            System.out.println("\nFin de la ejecucion de la prueba");
        }
    }
}

