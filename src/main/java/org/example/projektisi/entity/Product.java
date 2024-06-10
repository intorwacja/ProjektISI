package org.example.projektisi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;
    private double productPrice;
    private int productQuantity;

    @ManyToMany
    @JoinTable(
            name = "product_liczba",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "liczba_id")
    )
    private List<Liczba> liczby;

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public List<Liczba> getLiczby() {
        return liczby;
    }

    public void setLiczby(List<Liczba> liczby) {
        this.liczby = liczby;
    }
}
