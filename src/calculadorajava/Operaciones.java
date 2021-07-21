/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

/**
 *
 * @author Marolyn Salazar R
 */
public class Operaciones {
    private float num1;
    private float num2;
    private float resultado;
    
    public Operaciones(float n1, float n2){
        this.num1=n1;
        this.num2=n2;
    }
    
    public void setResultado(float r){
        this.resultado=r;
    }
    public double getResultado(){
        return this.resultado;
    }
    
    public String mostrar(){
        String m= String.valueOf(getResultado());
        return m;
    }
}
