package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Mauricio Cadavid";
        int salarioBase = 1700000; 
        int horasTrabajo = 240; 
        int horasExtras = 8; 
        double auxilioTransporte = 162000;
        
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }

    
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
      
      double horaTrabajo =  salarioBase / (8 * 30);
      
      double horaExtra = horaTrabajo * 1.5; 
      
      double salarioDevengado = salarioBase + (horaTrabajo * horasTrabajo) + (horaExtra * horasExtras);
        return salarioDevengado; 
    } 

    
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        
      double deducciones = auxilioTransporte; 
        return deducciones;   
    } 
}