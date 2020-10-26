
package LogicaNegocio;

/**
 *
 * @author gi_mb
 */
public abstract class FigurasGeometricas implements TiposFiguras {
    
    protected String nombre;

    public FigurasGeometricas() {
    }
    

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double CalcularArea();
    
    public abstract double CalcularPerimetro();
   
    
    
}
