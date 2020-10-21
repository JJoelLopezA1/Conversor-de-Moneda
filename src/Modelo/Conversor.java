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
    //Cantidad que se desea convertir
    private float cantidad;
    //Valor predeterminado de las monedas en la actualidad
    private float valorPeso = 0.00025;
    private float valorDolar = 4000;
    //Valor de la cantidad convertida
    private float resultado;
    //Constructor vacío
    public Conversor() {
        
    }
    //Contructor Principal
    public Conversor(float cantidad, float resultado) {
        this.cantidad = cantidad;
        this.resultado = resultado;
    }
    //Getter y Setter
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
    //Método para convertir de Peso a Dolar
    public double convertirADolar(){
        this.resultado = (this.cantidad*this.valorPeso);
        return this.resultado;
    }
    //Método para convertir de Dolar a Peso
    public double convertirAPeso(){
        this.resultado = (this.cantidad*this.valorDolar);
        return this.resultado;
    }
    //Método toString
    @Override
    public String toString() {
        return "Conversor{" + "Cantidad=" + cantidad + ", Valor Peso=" + valorPeso + ", Valor Dolar=" + valorDolar + ", Resultado=" + resultado + '}';
    }
    
    
}
