package com.example.demo.Product.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// JPA = Java Persistence API
// Transformar a classe em uma entidade no banco de dados
@Entity
// Trabalhar com tabelas e setar o nome da tabela
@Table(name = "tb_livros")
// Criar construtor sem argumentos
@NoArgsConstructor
// Criar construtor com argumentos
@AllArgsConstructor
// Criar os getters e setters
@Data
public class ProductModel {
    @Id
    // Condicao para gerar o ID (Nesse caso gerar com numeros)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String description;
    private boolean availability;

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
