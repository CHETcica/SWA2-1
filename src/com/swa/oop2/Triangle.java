package com.swa.oop2;

public class Triangle extends Shape {
	public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}
