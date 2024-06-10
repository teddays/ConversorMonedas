package com.aluracursos.conversor;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        List<ConversorDeMoneda> lista = new LinkedList<>();

        int salir = 1;
        while(salir !=0){

            System.out.println("""
                \nBienvenido al conversor de monedas
                \nUsted puede realizar la conversion de monedas entre las siguientes opciones:
                
                ARS - Peso Argentino (Argentina), BOB - Bolivian Boliviano (Bolivia),
                BRL - Real brasileño (Brazil), CLP - Peso chileno (Chile),
                COP - Peso colombiano (Colombia), USD - Dólar estadounidense (United States),
                CNY - Chinese Renminbi (China), EUR - Euro (European Union),
                JPY - Japanese Yen (Japan), MXN - Mexican Peso (Mexico),
                RUB - Russian Ruble (Russia), SAR - Saudi Riyal (Saudi Arabia)
               
                Ejemplo:
                1) De USD a  ARS
                2) De ARS a USD
                """);
            System.out.println("\nIngrese el codigo de la moneda base: ");
            var monedaOrigen = String.valueOf(lectura.nextLine()).toUpperCase();
            System.out.println("Ingresa el codigo de la moneda que desea convertir: ");
            var monedaConversion = String.valueOf(lectura.nextLine()).toUpperCase();
            System.out.println("Ingrese la cantidad de su moneda a convertir: ");
            var cantidad = Double.valueOf(lectura.nextLine());
            Moneda moneda = consulta.consultaMoneda(monedaOrigen, monedaConversion,cantidad);
            ConversorDeMoneda.convertir(monedaOrigen, monedaConversion, cantidad, consulta, lectura);

            System.out.println("\nEscriba 0 para salir, o 1 para realizar una nueva conversion");
            salir = lectura.nextInt();
            lectura.nextLine();
        }

    }
}
