package com.lyalencar.pedidos.pedidos.repository;

import com.lyalencar.pedidos.pedidos.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
