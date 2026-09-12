use clientes;
create table clientes (
                          codigo serial not null primary key,
                          nome varchar(150) not null,
                          cpf varchar(11) not null,
                          logradouro varchar(100),
                          numero varchar(100),
                          email varchar(150),
                          telefone varchar(20)
);

select * from clientes;

use produtos;
create table produtos (codigo serial not null primary key, nome varchar(100) not null, valor_unitario decimal(16,2) not null );

use pedidos;
create table pedido (
                        codigo serial not null primary key,
                        codigo_cliente bigint not null,
                        data_pedido timestamp not null default now(),
                        chave_pagamento text,
                        observacoes text,
                        status_pedido varchar(20) check (
                            status_pedido in ('REALIZADO', 'PAGO', 'FATURADO', 'ENVIADO', 'ERRO_PAGAMENTO', 'PREPARANDO_ENVIO')),
                        total decimal(16,2) not null,
                        codigo_rastreio varchar(255),
                        url_nf text
);

select * from pedido;

use pedidos;
create table item_pedido(
                            codigo serial not null primary key,
                            codigo_pedido bigint not null references pedido (codigo),
                            codigo_produto bigint not null,
                            quantidade int not null,
                            valor_unitario decimal(16,2) not null
);

select * from item_pedido;