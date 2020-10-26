/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import LogicaNegocio.FigurasGeometricas;
import LogicaNegocio.TrianguloEquilatero;

/**
 *
 * @author gi_mb
 */
public class GUITrianguloEquilatero extends GUIFiguras {
    
    public GUITrianguloEquilatero() {
        this.setTitle("TRIANGULO EQUILATERO");
    }
    

    @Override
    protected void CalcularArea() {
        double base = Double.parseDouble(txtbase.getText()); //obtenemos
        double altura = Double.parseDouble(txtaltura.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas triangulo = new TrianguloEquilatero(base,altura,nombre); //instanciamos el radio
        double area= triangulo.CalcularArea();
        txtarea.setText((String.valueOf(area)));
    }

    @Override
    protected void CalcularPerimetro() {
        double base = Double.parseDouble(txtbase.getText()); //obtenemos
        double altura = Double.parseDouble(txtaltura.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas triangulo = new TrianguloEquilatero(base,altura,nombre); //instanciamos el radio
        double perimetro= triangulo.CalcularPerimetro();
        txtperimetro.setText((String.valueOf(perimetro)));
    }
    
}
