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
public class División extends Operaciones{
    
    public División(float n1, float n2){
        super(n1,n2);
        float division;
        
        try{
         if((n2!=0)){
            division=(n1/n2);
            this.setResultado(division);
            
          }else
            JOptionPane.showMessageDialog(null, "No se puede, digite de nuevo");
         
        }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Hubo un error, revise la información e intente de nuevo");
            }
        
    }
    
}
