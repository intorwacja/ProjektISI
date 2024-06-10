package org.example.projektisi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Liczba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int liczba1;
    private int liczba2;

    @ManyToMany(mappedBy = "liczby")
    private List<Product> products;

    public int getId() {
        return id;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

