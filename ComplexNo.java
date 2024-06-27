package com.cse.oop.practice.complexnooperation;

public class ComplexNo {
    public int real, img;

    public ComplexNo() {
    }

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    //will add method in future class
    ComplexNo add(ComplexNo c) {
        ComplexNo temp;
        temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    ComplexNo sub(ComplexNo c) {
        ComplexNo temp;
        temp = new ComplexNo();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }

    @Override
    public String toString() {
        return "Complex No : " + real + "+" + img + 'i';
    }
}
