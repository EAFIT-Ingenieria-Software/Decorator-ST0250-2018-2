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
public class AplicarBordes extends Decorador{
    
    public AplicarBordes(Componente componente){
        super(componente); //tomamos el componente que fue declarado en la clase Decorador
    }
    
    @Override
    public String mostrar(){
        return "◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈\n" + this.getComponente().mostrar()
                + "\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈"; //aplicamos la decoración al componente
    }
    
}
