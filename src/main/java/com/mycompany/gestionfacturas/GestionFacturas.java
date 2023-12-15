/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionfacturas;

// Importación de la librería Arraylist
import java.util.ArrayList;

// Importación de la librería Scanner para poder leer los datos ingresados por el usuario
import java.util.Scanner;

/**
 *
 * @author aleja
 */

// Se define la clase "GestionFacturas"
public class GestionFacturas {
    
    // Declaración de un ArrayList asignado a una variable "facturas"
    private ArrayList<Factura> facturas;

    // Constructor perteneciente a la variable "GestiónFacturas"
    public GestionFacturas() {
        
        // ArrayList vacío que almacena valores de tipo "facturas"
        facturas = new ArrayList<>();
    }

    // Se inicia el método agregarFactura para agregar nuevas facturas
    public void agregarFactura(int numero, String cliente, double total) {
        
        // Con un bucle se indica que el número es menor que 0 
        if (numero < 0) {
            
            // Si se verifica lo anterior se imprime un mensaje que indica que el número no puede ser negativo
            System.out.println("El número de factura no puede ser negativo.");
            
            // Salida del método
            return; 
            
        // Si no
        } else {
            
        // Se crea un objeto "Factura" con los datos anteriores que se almacena en la variable "nuevaFctura"
        Factura nuevaFactura = new Factura(numero, cliente, total);
       
        // Agregación del objeto "nuevaFactura" a la lista "facturas"
        facturas.add(nuevaFactura);
        
        // Se imprime el valor de la factura almacenada en la variable "nuevaFactura"
        System.out.println("Factura agregada: " + nuevaFactura);
        
        }
    }

    // Se define el método "mostrarFacturas"
    public void mostrarFacturas() {
        
        // Se utiliza un bucle para indicar que si la lista está vacía se imprime un mensaje que lo indica
        if (facturas.isEmpty()) {
            System.out.println("La lista de facturas está vacía.");
            
        // Si no, se imprimen los valores
        } else {
            System.out.println("Lista de facturas:");
            
            // Se utiliza un bucle para recorrer la lista "facturas" 
            for (Factura factura : facturas) {
                
                // Se imprime el objeto "factura"
                System.out.println(factura);
            }  
        }
    }

    // Se define el método "eliminarFactura" que no devuelve ningún valor ("void"). Toma una variable "numero" de tipo "int"
    public void eliminarFactura(int numero) {
        
        // Se declara una variable llamada "encontrado" de tipo "boolean" que se inicia con valor "false"
        boolean encontrado = false;
        
        // Se utiliza otro bucle for para recorrer la lista
        for (Factura factura : facturas) {
            
            // Con un bucle if se verifica si el número de la factura es igual al número proporcionado
            if (factura.getNumero() == numero) {
                
                // Si se cumple lo anterior se elimina la factura de la lista
                facturas.remove(factura);
                
                // Se imprime la factura eliminada
                System.out.println("Factura eliminada: " + factura);
                
                // Se establece la variable "encontrado" en "true"
                encontrado = true;
                
                // Salida del bucle
                break;
            }
        }
        
        // Se utiliza el bucle if para indicar que la variable "encontrado" es "false"
        if (!encontrado) {
            
            // Si se cumple lo anterior se imprime un mensaje que indica que no se ha encontrado la factura
            System.out.println("Factura no encontrada.");
        }
    }
    
    // Se declara el método "main" para poder ejecutar el programa
    public static void main(String[] args) {
        
        // Se crea una nueva instancia de la clase "GestionFacturas" y se almacena en la variable "gestionFacturas"
        GestionFacturas gestionFacturas = new GestionFacturas();
        
        // Se crea una nueva instancia del objeto "Scanner" para poder leer los datos ingresados por el usuario. Esta
        // se almacena en la variable "scanner"
        Scanner scanner = new Scanner(System.in);

        // Se utiliza un bucle while para indicar que la instancia es "true"
        while (true) {
            
            // Si se cumple lo anterior se imprime el mensaje "Menu: ". Se utiliza "\n" para hacer un salto de línea
            System.out.println("\nMenu:");
            
            // Si se cumple lo anterior se imprime el mensaje "1. Agregar factura"
            System.out.println("1. Agregar factura");
            
            // Si se cumple lo anterior se imprime el mensaje "2. Mostrar facturas"
            System.out.println("2. Mostrar facturas");
            
            // Si se cumple lo anterior se imprime el mensaje "3. Eliminar factura"
            System.out.println("3. Eliminar factura");
            
            // Si se cumple lo anterior se imprime el mensaje "4. Salir"
            System.out.println("4. Salir");
            
            // Si se cumple lo anterior se imprime el mensaje "Seleccione una opción: "
            System.out.print("Seleccione una opción: ");

            // Lee el número entero ingresado por el usuario y se almacena en la variable "opcion"
            int opcion = scanner.nextInt();
            
            // Después de la lectura del valor anterior salta a la siguiente línea
            scanner.nextLine(); 

            // Se utiliza una estructura switch basándose en la variable "opcion"
            switch (opcion) {
                
                // Este es el primer caso del switch
                case 1:
                    
                    // Se imprime la línea que indica al usuario que ingrese el número de la factura
                    System.out.print("Ingrese el número de la factura: ");
                    
                    // Lee el número ingresado por el usuario y lo almacena en la variable "numero" de tipo "int"
                    int numero = scanner.nextInt();
                    
                    // Después de la lectura del valor anterior salta a la siguiente línea
                    scanner.nextLine(); 
                    
                    // Se imprime la línea que indica al usuario que ingrese el nombre del cliente
                    System.out.print("Ingrese el nombre del cliente: ");
                    
                    // Lee la línea de texto ingresada por el usuario y la almacena en la variable "cliente"
                    String cliente = scanner.nextLine();
                    
                    // Se imprime la línea que indica al usuario que ingrese el precio total de la factura
                    System.out.print("Ingrese el total de la factura: $");
                    
                    // Lee un número de tipo "double" ingresado por el usuario y lo almaxcena en la variable "total"
                    double total = scanner.nextDouble();
                    
                    // Se utiliza el método "agregarFactura" para añadir una nueva factura con los datos proporcionados
                    // anteriormente
                    gestionFacturas.agregarFactura(numero, cliente, total);
                    
                    // Salida del bucle
                    break;
                
                // Este es el segundo caso del switch
                case 2:
                    
                    // Se utiliza el método "mostrarFacturas" para mostrar las facturas almacenadas
                    gestionFacturas.mostrarFacturas();
                    
                    // Salida del bucle
                    break;
                    
                // Este es el tercer caso del switch
                case 3:
                    
                    // Se imprime la línea que indica al usuario que ingrese el número de la factura a eliminar
                    System.out.print("Ingrese el número de la factura a eliminar: ");
                    
                    // Lee el número de tipo "int" ingresado por el usuario y lo almacena en la variable "numeroEliminar"
                    int numeroEliminar = scanner.nextInt();
                    
                    // Se utiliza el método "eliminarFactura" para eliminar las factura indicada
                    gestionFacturas.eliminarFactura(numeroEliminar);
                    
                    // Salida del bucle
                    break;
                   
                // Este es el tcuarto caso del switch
                case 4:
                    
                    // Se imprime la línea que indica al usuario que está saliendo del programa
                    System.out.println("Saliendo del programa.");
                    
                    // Finalización del programa
                    System.exit(0);
                 
                // Se utiliza el bloque "default" si el valor de la variable no coincide con ningún caso anterior
                default:
                    
                    // Si se cumple lo anterior se imprime el mensaje que indica al usuario que la opción escogida 
                    // no es válida y que lo tiene que volvera intentar
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}