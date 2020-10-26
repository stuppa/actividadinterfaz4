/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import LogicaNegocio.FigurasGeometricas;
import LogicaNegocio.Rectangulo;

/**
 *
 * @author gi_mb
 */
public class GUIRectangulo extends GUIFiguras {
    
    public GUIRectangulo() {
        this.setTitle("RECTANGULO");
    }

    @Override
    protected void CalcularArea() {
        double base = Double.parseDouble(txtbase.getText()); //obtenemos
        double altura = Double.parseDouble(txtaltura.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas rectangulo = new Rectangulo(base,altura,nombre); //instanciamos el radio
        double area= rectangulo.CalcularArea();
        txtarea.setText((String.valueOf(area)));
    }

    @Override
    protected void CalcularPerimetro() {
        double base = Double.parseDouble(txtbase.getText()); //obtenemos
        double altura = Double.parseDouble(txtaltura.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas rectangulo = new Rectangulo(base,altura,nombre); //instanciamos el radio
        double perimetro= rectangulo.CalcularPerimetro();
        txtperimetro.setText((String.valueOf(perimetro)));
        
    }
    
}
