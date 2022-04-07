package com.company;

public class Square {
    private float height, width, length;

    public float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getLength(){
        return this.length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getSquareVolume(){
        return (this.getHeight() * this.getWidth());
    }

    public float getSquareArea(){
        return (this.getHeight() * this.getWidth() * this.getLength());
    }
}
