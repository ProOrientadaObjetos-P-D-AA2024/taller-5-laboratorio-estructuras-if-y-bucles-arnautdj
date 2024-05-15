/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author santy
 */
import java.util.Scanner;
public class EjecutarEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad maxima de empleados a registrar: ");
        int maxEmpleados = entrada.nextInt();
        entrada.nextLine();

        Empleados[] empleados = new Empleados[maxEmpleados];
        int cantidadEmpleados = 0;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n1. Agregar empleado");
            System.out.println("2. Mostrar informacion de empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    if (cantidadEmpleados < maxEmpleados) {
                        System.out.print("Ingrese nombre del empleado: ");
                        String nombre = entrada.nextLine().trim();
                        System.out.print("Ingrese salario del empleado: ");
                        double salario = Double.parseDouble(entrada.nextLine());
                        System.out.print("Ingrese edad del empleado: ");
                        int edad = Integer.parseInt(entrada.nextLine());
                        empleados[cantidadEmpleados] = new Empleados(nombre, salario, edad);
                        cantidadEmpleados++;
                    } else {
                        System.out.println("No se pueden ingresar mas empleados");
                    }
                    break;
                case 2:
                    System.out.println("\nInformacion de los empleados:");
                    for (int i = 0; i < cantidadEmpleados; i++) {
                        System.out.println(empleados[i]);
                    }
                    break;
                case 3:
                    if (cantidadEmpleados > 0) {
                        System.out.print("Ingrese el porcentaje de aumento "
                                + "salarial (sin el %): ");
                        double porcentajeAumento = entrada.nextDouble();
                        entrada.nextLine();
                        double salarioPromedio = calcularSalarioPromedio
                                                (empleados, cantidadEmpleados);
                        for (int i = 0; i < cantidadEmpleados; i++) {
                            if (empleados[i].getSalario() < salarioPromedio) {
                                empleados[i].aumentarSalario(porcentajeAumento);
                                System.out.printf("Nuevo salario de %s: %.2f%n",
                                        empleados[i].getNombre(),
                                        empleados[i].getSalario());
                            }
                        }
                    } else {
                        System.out.println("No hay empleados registrados para "
                                + "calcular el aumento salarial.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
        entrada.close();
    }

    private static double calcularSalarioPromedio(Empleados[] empleados, int cantidadEmpleados) {
        double sumaSalarios = 0;
        for (int i = 0; i < cantidadEmpleados; i++) {
            sumaSalarios += empleados[i].getSalario();
        }
        return sumaSalarios / cantidadEmpleados;
    }

}
