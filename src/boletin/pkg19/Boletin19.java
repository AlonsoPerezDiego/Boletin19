/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

import static IntroducirDatos.Datos.pedirString;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libreria gestion = new Libreria();
        
        int select;
        
        do{
            select = Integer.parseInt(JOptionPane.showInputDialog("1: Añadir libro. \n2: Mostrar todos libros. \n3: Vender. \n4: Buscar libro. \n5: Para descatalogr un libro. \n6: Salir."));
            
            switch(select){
                
                case 1: gestion.añadir();
                        break;
                       
                case 2: gestion.mostrarTodos();
                        break;
                
                case 3: gestion.vender(pedirString("Introduce título del libro que quieras vender:"));
                        gestion.borrarSinUnidades();
                        break;
                        
                case 4: gestion.buscar(pedirString("Introduce título del libro que quieras buscar:"));
                        break;
                       
                case 5: gestion.retirar(pedirString("Introduce título del libro que quieras descatalogar:"));
            }
        
        }while(select<6);
    }
}
