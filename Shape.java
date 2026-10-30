/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject2;
import java.util.Date;
/**
 *
 * @author Lenovo
 */
public abstract class Shape implements Drawable
{
    private Date datacreated;
    private String color;

    public Shape() 
    {
        color="blue";
        datacreated =new Date();
        
    }

    public Shape(String color) {
        this.color = color;
    }

    public Date getDatacreated() {
        return datacreated;
    }

    public void setDatacreated(Date datacreated) {
        this.datacreated = datacreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public  abstract double getArea();
    public  abstract double getPerimeter();
        
    
}
