package com.lyalencar.icompras.produtos.service;

import lombok.RequiredArgsConstructor;
import com.lyalencar.icompras.produtos.model.Produto;
import org.springframework.stereotype.Service;
import com.lyalencar.icompras.produtos.repository.ProdutoRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Transactional
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    @Transactional(readOnly = true)
    public Produto obterProduto(Long id){
        return produtoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));
    }
}
