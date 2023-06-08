/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicioextra2;

import java.util.Scanner;

public class EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el valor para A: ");
        int A = entrada.nextInt();
        
        System.out.print("Ingresa el valor para B: ");
        int B = entrada.nextInt();
        
        System.out.print("Ingresa el valor para C: ");
        int C = entrada.nextInt();
        
        System.out.print("Ingresa el valor para D: ");
        int D = entrada.nextInt();
        
        System.out.println("Variables iniciales: "+"A: "+A+", B: "+B+", C: "+C+", D: "+D);
 
        int aux = B;
                
        B = C;
        C = A;
        A = D;
        D = aux;
               
        System.out.println("");
        System.out.println("Variables finales:   "+"A: "+A+", B: "+B+", C: "+C+", D: "+D);        
    }    
}
