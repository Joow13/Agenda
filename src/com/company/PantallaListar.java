package com.company;

public class PantallaListar {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("NOTAS GUARDADAS");

        for(Nota nota: Main.blocDeNotas.notas){
            System.out.println(nota.titulo);
        }

    }
}