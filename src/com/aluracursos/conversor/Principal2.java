package com.aluracursos.conversor;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        List<ConversorDeMoneda> lista =new LinkedList<>();

        int opcion = 0;
        while (opcion != 9) {
            System.out.println("""
                    \nBienvenido al conversor de monedas
                    Escoja una de las siguientes opciones disponibles:
                    1) Convierte de USD - Dólar estadounidense (United States) a ARS - Peso Argentino (Argentina)
                    2) Convierte de USD - Dólar estadounidense (United States) a BOB - Bolivian Boliviano (Bolivia)
                    3) Convierte de USD - Dólar estadounidense (United States) a BRL - Real brasileño (Brazil)
                    4) Convierte de USD - Dólar estadounidense (United States) a CLP - Peso chileno (Chile)
                    5) Convierte de USD - Dólar estadounidense (United States) a COP - Peso colombiano (Colombia)
                    6) Convierte de EUR - Euro (European Union) a USD - Dólar estadounidense (United States)
                    7) Convierte de CNY - Chinese Renminbi (China) a USD - Dólar estadounidense (United States)
                    8) Convierte de ARS - Peso Argentino (Argentina) a USD - Dólar estadounidense (United States)
                    9) Salir!
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion) {
                case 1:
                    ConversorDeMoneda.convertir2("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConversorDeMoneda.convertir2("USD", "BOB", consulta, lectura);
                    break;
                case 3:
                    ConversorDeMoneda.convertir2("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConversorDeMoneda.convertir2("USD", "CLP", consulta, lectura);
                    break;
                case 5:
                    ConversorDeMoneda.convertir2("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConversorDeMoneda.convertir2("EUR", "USD", consulta, lectura);
                    break;
                case 7:
                    ConversorDeMoneda.convertir2("CNY", "USD", consulta, lectura);
                    break;
                case 8:
                    ConversorDeMoneda.convertir2("ARS", "USD", consulta, lectura);
                    break;
                case 9:
                    System.out.println("Saliendo del conversor de monedas");
                    break;
                default:
                    System.out.println("Opcion no valida, seleccione una opcion valida");
                    break;

            }

            System.out.println("Gracias por su operacion");

        }
    }
}
