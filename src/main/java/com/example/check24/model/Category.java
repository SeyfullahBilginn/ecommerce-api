package com.example.check24.model;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Scope("prototype")
@Entity
@Table(name="Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products;

    public Category() {}
    public Category(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Category( String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(long id, String name, String description, Set<Product> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", products=" + products +
                '}';
    }
}
