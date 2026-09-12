package com.lyalencar.pedidos.pedidos.repository;

import com.lyalencar.pedidos.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
