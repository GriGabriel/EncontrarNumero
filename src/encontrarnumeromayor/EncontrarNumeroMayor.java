
package encontrarnumeromayor;
import java.util.Scanner;

public class EncontrarNumeroMayor {
       
    
    public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);   
         System.out.print("Ingrese el primer número: ");
         int num1 = sc.nextInt();
         System.out.print("Ingrese el segundo número: ");
         int num2 = sc.nextInt();
         System.out.print("Ingrese el tercer número: ");
         int num3 = sc.nextInt();
         
        // Determinar el mayor número
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Determinar el menor número
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Determinar el número mediano
        int mediano = num1;
        if (num1 != mayor && num1 != menor) {
            mediano = num1;
        } else if (num2 != mayor && num2 != menor) {
            mediano = num2;
        } else {
            mediano = num3;
        }

        // Mostrar resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número mediano es: " + mediano);
        System.out.println("El número menor es: " + menor);
         
         
    }
    
}
