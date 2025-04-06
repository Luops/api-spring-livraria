package com.example.demo.Domain.WishList.Model;

import java.io.Serializable;

import com.example.demo.Domain.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_listaDesejos")
@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")   
public class WishListModel extends BaseEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
