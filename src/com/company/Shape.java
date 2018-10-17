package com.company;

public class Shape {
    public abstract class Shape
    {
        private String type;
        public Shape(String type)
        {
            this.type = type;
        }
        public abstract double getArea();
        public abstract double getPerimeter();

        public String toString()
        {
            return("I am " + type + ".");
        }
    }
}
