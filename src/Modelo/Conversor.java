/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Joel López Andarsia
 */
public class Conversor {
    private double cantidad;
    private double valorPeso = 0.00025;
    private double valorDolar = 4000;
    private double resultado;

    public Conversor() {
        
    }

    public Conversor(float cantidad, float resultado) {
        this.cantidad = cantidad;
        this.resultado = resultado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(double valorPeso) {
        this.valorPeso = valorPeso;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double convertirADolar(){
        this.resultado = (this.cantidad*this.valorPeso);
        
        return this.resultado;
    }
    
    public double convertirAPeso(){
        this.resultado = (this.cantidad*this.valorDolar);
        
        return this.resultado;
    }

    @Override
    public String toString() {
        return "Conversor{" + "cantidad=" + cantidad + ", valorPeso=" + valorPeso + ", valorDolar=" + valorDolar + ", resultado=" + resultado + '}';
    }
    
    
}
