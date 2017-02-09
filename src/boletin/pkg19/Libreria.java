/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

import static IntroducirDatos.Datos.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Diego
 */
public class Libreria {
    ArrayList <Libros> lib;

    public Libreria() {
        lib = new ArrayList <Libros> ();
    }
    
    public void añadir(){
        Libros li = new Libros(pedirString("Introduce título:"), pedirString("Introduce autor:"), pedirString("Introduce ISBN:"), pedirFloat("Introduce precio:"), pedirInt("Introduce número de unidades:"));
        lib.add(li);
    }
    
    public void vender(String titulo){
        for(int i = 0; i<lib.size(); i++){
            if(lib.get(i).getTitulo() .equals(titulo) ){
                lib.get(i).setUnidades(lib.get(i).getUnidades()-1);
            }
        }
    }
    
    public void mostrarTodos(){
        for(Libros li:lib){
            System.out.println(li);
        }
    }
    
    public void borrarSinUnidades(){
        
        for(int i = 0; i<lib.size(); i++){
            if(lib.get(i).getUnidades()==0){
                lib.remove(i);
            }
        }
    }
    
    public void buscar(String titulo){
        int i;
        for(i = 0; i<lib.size(); i++){
            if(lib.get(i).getTitulo() .equals(titulo)){
                System.out.println("Está ese libro.\n" + lib.get(i).toString());
            }
        }
        if(i==lib.size()){
            System.out.println("No está ese libro.");
        }
    }
    
    public void retirar(String titulo){
        for(int i = 0; i<lib.size(); i++){
            if(titulo .equals(lib.get(i).getTitulo())){
                lib.remove(i);
                System.out.println("Libro descatalogado.");
            }
            else{
                System.out.println("Ese libro ya no estaba.");
            }
        }
    }
    
    public void ordenar(){
        Collections.sort(lib);
    }
}
