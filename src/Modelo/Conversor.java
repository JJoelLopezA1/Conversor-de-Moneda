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
    private float cantidad;
    private float valorPeso = 0.00025;
    private float valorDolar = 4000;
    private float resultado;

    public Conversor() {
        
    }

    public Conversor(float cantidad, float resultado) {
        this.cantidad = cantidad;
        this.resultado = resultado;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(float valorPeso) {
        this.valorPeso = valorPeso;
    }

    public float getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(float valorDolar) {
        this.valorDolar = valorDolar;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float convertirADolar(){
        this.resultado = (this.cantidad*this.valorPeso);
        
        return this.resultado;
    }
    
    public float convertirAPeso(){
        this.resultado = (this.cantidad*this.valorDolar);
        
        return this.resultado;
    }

    @Override
    public String toString() {
        return "Conversor{" + "cantidad=" + cantidad + ", valorPeso=" + valorPeso + ", valorDolar=" + valorDolar + ", resultado=" + resultado + '}';
    }
    
    
}
