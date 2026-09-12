package com.lyalencar.pedidos.pedidos.controller;

import com.lyalencar.pedidos.pedidos.controller.dto.NovoPedidoDto;
import com.lyalencar.pedidos.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<NovoPedidoDto> criarPedido(@RequestBody NovoPedidoDto dto) {
        return null;
    }
}
