/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import javax.swing.JOptionPane;

/**
 *
 * @author Marolyn Salazar R
 */
public class Multiplicación extends Operaciones{
    
    public Multiplicación(float n1, float n2){
        super(n1,n2);
        float producto;
        
        try{
        producto= (n1*n2);
        this.setResultado(producto);
        }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Hubo un error, revise la información e intente de nuevo");
            }
        
    }
}
