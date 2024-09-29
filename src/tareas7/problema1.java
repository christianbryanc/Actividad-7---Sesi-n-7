
package tareas7;

import java.util.Scanner;
public class problema1 {

    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //Variables
        int edad, Sedades, Npersonas;
        double promedio;
        String continuar;
        //Proceso
        Sedades=0;
        Npersonas=0;
        do {                       
            System.out.print("Ingrese una edad: ");
            edad=lectura.nextInt();
            Sedades+=edad;
            Npersonas++;
            
            System.out.print("Desea continuar? (si/no): ");
            continuar=lectura.next();
            
            
        } while (continuar.equals("si"));
        if (Npersonas>0) {
            promedio = (double) Sedades/Npersonas;
            System.out.println("El promedio de las edades es: "+promedio);
        }else{
            System.out.println("No se ingresaron edades.");
        }
               
    }
    
}
