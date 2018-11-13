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
public abstract class Decorador extends Componente {
    
    private Componente componente; //creamos un componente para ser asignado al decorador
    
    public Decorador(Componente componente){
        this.componente = componente; //asignamos el componente
    }
    
    public Componente getComponente(){
        return componente; //devolvemos el componente
    }
}
