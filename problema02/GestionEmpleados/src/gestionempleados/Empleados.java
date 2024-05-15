/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author santy
 */
public class Empleados {
    private String nombre;
    private double salario;
    private int edad;

    public Empleados(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Edad: " + edad;
    }
}
