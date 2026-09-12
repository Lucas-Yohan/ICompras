package com.lyalencar.icompras.produtos.controller;

import lombok.RequiredArgsConstructor;
import com.lyalencar.icompras.produtos.model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lyalencar.icompras.produtos.service.ProdutoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto){
        Produto produtoSalvo = produtoService.save(produto);
        return ResponseEntity.ok(produtoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> obterDados(@PathVariable Long id){
        Produto produto = produtoService.obterProduto(id);
        return ResponseEntity.ok(produto);
    }



}
