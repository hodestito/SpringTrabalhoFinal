package br.com.fiap.fiapCard.Cartao.service;

import br.com.fiap.fiapCard.Cartao.dto.CartaoDTO;
import br.com.fiap.fiapCard.Cartao.dto.CreateCartaoDTO;
import br.com.fiap.fiapCard.Cartao.model.Cartao;

import java.util.List;

public interface CartaoService {

    List<CartaoDTO> findAll();

    CartaoDTO findById(Integer id);

    CartaoDTO ativarCartao(Integer id);

    CartaoDTO bloquearCartao(Integer id);

    CartaoDTO create(CreateCartaoDTO createCartaoDTO);

    CartaoDTO consumirLimite(Integer idCartao, Double valor);

}