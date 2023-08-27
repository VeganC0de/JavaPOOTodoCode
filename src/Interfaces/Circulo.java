/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author tesla
 */
public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;
    
    public Circulo(){
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un Circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, Estoy rotando un Circulo");
    }
     
}
