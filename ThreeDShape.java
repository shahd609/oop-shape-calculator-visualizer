/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject2;

/**
 *
 * @author Lenovo
 */
public abstract class ThreeDShape extends Shape {
    public abstract double getVolume();

    public ThreeDShape() 
    {
        super();
            
    }

    public ThreeDShape(String color) {
        super(color);
    }
    
    
    
}
