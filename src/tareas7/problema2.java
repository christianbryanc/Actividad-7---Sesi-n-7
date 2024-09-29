
package tareas7;

import java.util.Scanner;
public class problema2 {
    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //Variables
        int notas, aprobados, desaprobados, Ndepersonas;
        double porcentajeA, porcentajeD;
        String continuar;
        //Proceso
        aprobados=0;
        desaprobados=0;
        Ndepersonas=0;
        do {            
            System.out.print("Ingrese una nota: ");
            notas=lectura.nextInt();
            Ndepersonas++;
            
            if (notas>=11) {
                aprobados++;                              
            }else{
                desaprobados++;
            }
            
            System.out.print("Desea continuar? (si/no): ");
            continuar=lectura.next();
            
        } while (continuar.equals("si"));
        if (Ndepersonas>0) {
            porcentajeA = ((double)aprobados/Ndepersonas)*100;
            porcentajeD = ((double)desaprobados/Ndepersonas)*100;
            porcentajeA = Math.round(porcentajeA * 100.0) / 100.0;
            porcentajeD = Math.round(porcentajeD * 100.0) / 100.0;
            System.out.println("El porcentaje de alumnos aprobados es: "+porcentajeA+"%");
            System.out.println("El porcentaje de alumnos desaprobados es: "+porcentajeD+"%");
        }

            
     }
    
    
}
