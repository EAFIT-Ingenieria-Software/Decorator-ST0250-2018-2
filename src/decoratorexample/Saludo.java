/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorexample;

/**
 *
 * @author tefa
 */
public class Saludo extends Componente{
    
    @Override
    public String mostrar(){
        return "Hola, mundo. :3"; //declaramos el contenido del componente
    }
    
}