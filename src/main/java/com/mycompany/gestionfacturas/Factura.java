/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfacturas;

/**
 *
 * @author aleja
 */

// Se define la clase "Factura"
class Factura {
    
    // Declaración de la variable "numero" de tipo "int". Al ser "private", solo se tendrá acceso a esta variable dentro
    // de la misma clase
    private int numero;
    
    // Declaración de la variable "cliente" de tipo "String". Al ser "private", solo se tendrá acceso a esta variable dentro
    // de la misma clase
    private String cliente;
    
    // Declaración de la variable "total" de tipo "double". Al ser "private", solo se tendrá acceso a esta variable dentro
    // de la misma clase
    private double total;

    // Se inicializa un constructor llamado "Factura" en el que se toman las tres variables anteriores
    public Factura(int numero, String cliente, double total) {
        
        // Se instancia la variable "numero" mediante un "this" con el valor de "numero" que se pasa al constructor
        this.numero = numero;
        
        // Se instancia la variable "cliente" mediante un "this" con el valor de "cliente" que se pasa al constructor
        this.cliente = cliente;
        
        // Se instancia la variable "total" mediante un "this" con el valor de "total" que se pasa al constructor
        this.total = total;
    }

    // Definición del método "getNumero" que devuelve un valor de tipo "int"
    public int getNumero() {
        
        // Devuelve el valor de la variable "numero"
        return numero;
    }

    // Definición del método "getCliente" que devuelve un valor de tipo "String"
    public String getCliente() {
        
        // Devuelve el valor de la variable "Cliente"
        return cliente;
    }

    // Definición del método "getTotal" que devuelve un valor de tipo "double"
    public double getTotal() {
        
        // Devuelve el valor de la variable "total"
        return total;
    }

    @Override
    
    // Definición del método "toString" que devuelve un valor de tipo "String"
    public String toString() {
        
        // Devuelve el valor de la variable "numero", la variable "cliente" y la variable "total"
        return "Número: " + numero + ", Cliente: " + cliente + ", Total: $" + total;
    }
}

