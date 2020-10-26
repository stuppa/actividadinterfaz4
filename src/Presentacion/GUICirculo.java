/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import LogicaNegocio.Circulo;
import LogicaNegocio.FigurasGeometricas;
import java.text.DecimalFormat;

/**
 *
 * @author gi_mb
 */
public class GUICirculo extends GUIFiguras {
    DecimalFormat formato = new DecimalFormat("0.00");

    @Override
    protected void CalcularArea() {
        double radio = Double.parseDouble(txtbase.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas circulo = new Circulo(radio, nombre); //instanciamos el radio
        double area= circulo.CalcularArea();
        txtarea.setText((String.valueOf(formato.format(area))));
    }
    
    public GUICirculo() {
        
        this.jLabel1.setText("Radio");
        this.jLabel2.setVisible(false);
        this.txtaltura.setVisible(false);
        this.setTitle("CIRCULO");
    }

    @Override
    protected void CalcularPerimetro() {
        double radio = Double.parseDouble(txtbase.getText()); //obtenemos
        String nombre = null;
        FigurasGeometricas circulo = new Circulo(radio,nombre); //instanciamos el radio
        double perimetro= circulo.CalcularPerimetro();
        txtperimetro.setText(String.valueOf(formato.format(perimetro)));
        
    }
    
}
