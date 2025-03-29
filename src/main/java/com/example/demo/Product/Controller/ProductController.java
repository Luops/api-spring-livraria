package com.example.demo.Product.Controller;

import com.example.demo.Product.Model.ProductModel;
import com.example.demo.Product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Setar que esse arquivo é um controlador.
@RequestMapping("api/v1/products") // Annotation para criar rotas

public class ProductController {

    @GetMapping("boasVindas") // Criar rota, ex.: localhost:8080/boasVindas
    public String boasVindas(){
        return "Boas vindas ao Livros";
    }

    @PostMapping("adicionar") // Criar rota para adicionar Produto
    public ProductModel productAdd(){
        ProductModel productModel = new ProductModel(null,"Titulo","Autor",18.00,"Descricao",true);

        return productModel;
    }

    @Autowired
    private ProductService productService;

    @GetMapping("getAll")
    public ResponseEntity<List<ProductModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProductModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @PostMapping("addProduct")
    public ResponseEntity<ProductModel> create(@RequestBody ProductModel productModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
    }

    @PutMapping("refresh")
    public ResponseEntity<ProductModel> update(@RequestBody ProductModel productModel){
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(productModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
