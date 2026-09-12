package com.lyalencar.pedidos.pedidos.service;

import com.lyalencar.pedidos.pedidos.repository.PedidoRepository;
import com.lyalencar.pedidos.pedidos.repository.ItemPedidoRepository;
import com.lyalencar.pedidos.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator pedidoValidator;




}
