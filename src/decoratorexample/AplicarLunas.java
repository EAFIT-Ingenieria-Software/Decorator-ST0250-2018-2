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
public class AplicarLunas extends Decorador{
    
    public AplicarLunas(Componente componente){
        super(componente); //tomamos el componente que fue declarado en la clase Decorador
    }
    
    @Override
    public String mostrar(){
        return "☾ " + this.getComponente().mostrar() + " ☽"; //aplicamos la decoración al componente
    }
    
}
