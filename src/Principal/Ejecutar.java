/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Control.Controlador;
import Modelo.Conversor;
import Vista.ConversorVista;

/**
 *
 * @author Joel López Andarsia
 */
public class Ejecutar {
    Conversor con = new Conversor();
    ConversorVista view = new ConversorVista();
    
    Controlador ctrl = new Controlador(view, con);
    
    //ctrl.iniciar();
    //view.setVisible(true);
    
    }
