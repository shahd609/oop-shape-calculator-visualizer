/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject2;

/**
 *
 * @author Lenovo
 */
public class Circle extends Shape
{
    private double radius;

    @Override//ميثود كانت عندي في الاب بغير الامبليمنتيشن بتاعها
    //عشان لو كتبت حاجه غلط
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
        
    }

    @Override
    public String howToDraw()
    {
        return "Circle";
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) {
        
        if(radius>0)
        { 
            this.radius = radius;
           
        }  
        else
         System.out.println("invalid");
       
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public Circle(double r) 
    {
        super();
       setRadius(r);
       
    }

    public Circle(double r, String c) {
        super(c);
       setRadius(r);
    }
    
}
