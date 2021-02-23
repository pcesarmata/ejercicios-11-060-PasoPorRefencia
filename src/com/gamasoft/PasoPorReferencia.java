package com.gamasoft;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona objPersona = new Persona();
        objPersona.cambiarNombre("Cesar");
        imprimirNombre(objPersona);
        modificarPersona(objPersona);
        imprimirNombre(objPersona);
    }

    public static void imprimirNombre(Persona p1){
        System.out.println("Valor recibido: " + p1.obtenerNombre());
    }

    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Mata");
    }
}
