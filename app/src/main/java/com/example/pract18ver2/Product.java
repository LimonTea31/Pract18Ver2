package com.example.pract18ver2;

public class Product {
    String name;
    int price,image;
    boolean box;


    Product(String _describe, int _price, int _image, boolean _box) {
        name = _describe;
        price = _price;
        image = _image;
        box = _box;
    }
}