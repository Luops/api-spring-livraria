package com.example.demo.Domain.Product.Model;


import com.example.demo.Domain.BaseEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

// JPA = Java Persistence API
// Transformar a classe em uma entidade no banco de dados
@Entity
// Trabalhar com tabelas e setar o nome da tabela
@Table(name = "tb_livros")
// Criar construtor sem argumentos
@NoArgsConstructor
// Criar construtor com argumentos
@AllArgsConstructor
@SuperBuilder
public class ProductModel extends BaseEntity {
    @Id
    // Condicao para gerar o ID (Nesse caso gerar com numeros)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String description;
    private boolean availability;


    public ProductModel(String title, String author, Double price, String description, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }


    public void obterDetalhes(){
        System.out.println(id +
                ", title:'" + title + '\'' +
                ", author:'" + author + '\'' +
                ", price:" + price +
                ", description:'" + description + '\'' +
                ", availability:" + availability);
    }

    @Override
    public String toString() {
        return id +
                ", title:'" + title + '\'' +
                ", author:'" + author + '\'' +
                ", price:" + price +
                ", description:'" + description + '\'' +
                ", availability:" + availability;
    }
}
