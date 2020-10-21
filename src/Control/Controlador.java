/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conversor;
import Vista.ConversorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joel López Andarsia
 */
public class Controlador implements ActionListener{
    //
    private ConversorVista view;
    private Conversor con;

    public Controlador(ConversorVista view, Conversor con) {
        this.view = view;
        this.con = con;
        //
        this.view.btnConvertP.addActionListener(this);
        this.view.btnConvertD.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTittle("Conversor de Moneda");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        con.setCantidad(Float.parseFloat(view.txtIngreso.getText()));
        con.convertirADolar();
        con.convertirAPeso();
        
        view.txtResultado.setText(String.valueOf(con.getResultado()));
    }    
    
}
