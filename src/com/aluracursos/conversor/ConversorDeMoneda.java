package com.aluracursos.conversor;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversorDeMoneda {

    public static void convertir(String monedaOrigen, String monedaConversion, double cantidad, ConsultaAPI consulta, Scanner lectura){

        double cantidadConvertida;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String fechaActual = LocalDateTime.now().format(dtf);
        Moneda moneda = consulta.consultaMoneda(monedaOrigen,monedaConversion,cantidad);
        System.out.println("La tasa de referencia de conversion consultada el " + fechaActual + " para un 1 " + monedaOrigen + " a "+ monedaConversion + " es de " + new DecimalFormat().format(moneda.conversion_rate()).replace(",",".")  + " " + monedaConversion); //redondeamos a 2 decimales
        //System.out.println(moneda)
        System.out.println("La cantidad de " + cantidad + " " + monedaOrigen + " equivale a " + new DecimalFormat().format(moneda.conversion_result()).replace(",",".") + " " + moneda.target_code()+"\n"); //redondeamos a 2 decimales
    }

    public static void convertir2(String monedaOrigen, String monedaConversion, ConsultaAPI consulta, Scanner lectura){
        double cantidad = 0;
        double cantidadConvertida;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String fechaActual = LocalDateTime.now().format(dtf);
        Moneda moneda = consulta.consultaMoneda(monedaOrigen,monedaConversion,cantidad);
        System.out.println("La tasa de referencia de conversion consultada el " + fechaActual + " para 1 " + monedaOrigen + " a "+ monedaConversion + " es de " + new DecimalFormat().format(moneda.conversion_rate()).replace(",",".")  + " " + monedaConversion); //redondeamos a 2 decimales
        System.out.println("Ingrese la cantidad de " + monedaOrigen + " que desea convertir a " + monedaConversion);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println("La cantidad " + cantidad + " " + monedaOrigen + " equivale a " + new DecimalFormat().format(cantidadConvertida).replace(",",".") + " " + moneda.target_code()+"\n"); //redondeamos a 2 decimales
    }


}
