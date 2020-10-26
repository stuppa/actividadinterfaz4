/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author gi_mb
 */
public class TrianguloEquilatero extends FigurasGeometricas {
    
    private double base;
    private double altura;
    
    public TrianguloEquilatero(){
        super();
    }

    public TrianguloEquilatero(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

   

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double CalcularArea(){
        return (base * altura/2);
    }
    @Override
    public double CalcularPerimetro(){
        return (base*3);
    }
    

    
}
