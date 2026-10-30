/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject2;

/**
 *
 * @author Lenovo
 */
public class Cube extends ThreeDShape { 

    private double side;

    public Cube(double s) 
    {
        super();
        if(s>0)
        { 
            this.side = s;
        }  
        else
         System.out.println("invalid");
        
    }
    public Cube(String c,double s)
    {
        super(c);
         if(s>0)
        { 
            this.side = s;
        }  
        else
         System.out.println("invalid");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        if(s>0)
        { 
            this.side = s;
        }  
        else
         System.out.println("invalid");
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }
    
    
    
    @Override
    public double getVolume() 
    {
        return side*side*side;
       
    }

    @Override
    public double getArea() 
    {
        return 6*side*side;
    }

    @Override
    public double getPerimeter() 
    {
        return 12*side;
    }

    @Override
    public String howToDraw() 
    {
        return "Cube";
    }
    
    
}
