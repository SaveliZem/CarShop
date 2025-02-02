package org.example.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Purchase implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private Customer customer;
    private Product product;
    private LocalDate purchaseDate;

    public Purchase(Customer customer, Product product) {
        this.id = UUID.randomUUID();
        this.customer = customer;
        this.product = product;
        this.purchaseDate = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return "Покупатель: " + customer + ", Товар: " + product + ", Дата покупки: " + purchaseDate;
    }
}
