package org.example;

import java.util.Map;

import static org.example.CombinarCorrespondencia.*;

public class Main {
    public static void main(String[] args) {
        try {

            Map<String, Cliente> clientes = cargarClientes();
            String plantilla = cargarPlantilla();

            if (clientes.isEmpty() || plantilla.isEmpty()) {

                System.out.println("Comprobar que los archivos tienen contenido");

            } else {

                vaciarCarpetaSalida();
                combinarCorrespondencia(clientes, plantilla);
                System.out.println("Combinación completada.");
            }
        } catch (ArchivosFaltantesException e) {

            System.out.println(e.getMessage());
            System.out.println("Comprobar archivos necesarios");
        }
    }
}