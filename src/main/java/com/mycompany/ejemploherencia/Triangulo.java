/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploherencia;

/**
 *
 * @author labctr
 */
public class Triangulo extends FiguraGeometrica {
private double altura;
private double base;
public Triangulo(double altura,double base){
    this.altura=altura;
    this.base=base;
}


    @Override
    public double CalcularArea() {
        area=(base*altura)/2;
        return area;
    }
}
