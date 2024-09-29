
package tareas7;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        // Creando objeto de lectura
        Scanner scanner = new Scanner(System.in);
        //Variables
        int Npersonas = 0;
        double sumaH, sumaCuadrados, altura, promedio, varianza, desviacionEstandar;
        String continuar;
        //Proceso
        sumaH = 0;
        sumaCuadrados = 0;
        do {
            System.out.print("Ingresa una altura en metros: ");
            altura = scanner.nextDouble();
            sumaH += altura;
            sumaCuadrados += Math.pow(altura, 2);
            Npersonas++;
            
            System.out.print("¿Deseas continuar? (si/no): ");
            continuar = scanner.next();
            
        } while (continuar.equals("si"));        
        if (Npersonas > 0) {
            promedio = sumaH / Npersonas;
            varianza = (sumaCuadrados / Npersonas) - Math.pow(promedio, 2);
            desviacionEstandar = Math.sqrt(varianza);
            promedio = Math.round(promedio * 100.0) / 100.0;
            desviacionEstandar = Math.round(desviacionEstandar * 100.0) / 100.0;
            //Salida de datos
            System.out.println("Promedio de alturas: " +promedio+ " m");
            System.out.println("Desviación estándar: " +desviacionEstandar+ " m");
        } 
    }
}

