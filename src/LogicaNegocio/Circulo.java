
package LogicaNegocio;

/**
 *
 * @author gi_mb
 */
public class Circulo extends FigurasGeometricas {
    private double radio;
    
    
    public Circulo(){
        super();
    }

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea(){
        return Math.PI * (radio * radio);
    }
    
    @Override
    public double CalcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
     
     
   


   
    
    
}
