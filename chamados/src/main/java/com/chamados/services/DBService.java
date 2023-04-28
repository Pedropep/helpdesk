package com.chamados.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.chamados.domain.Chamado;
import com.chamados.domain.Cliente;
import com.chamados.domain.Tecnico;
import com.chamados.enums.Perfil;
import com.chamados.enums.Prioridade;
import com.chamados.enums.Status;

import repository.ChamadoRepository;
import repository.ClienteRepository;
import repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired 
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instaciaDB() {
		Tecnico tec1 = new Tecnico(null, "Pedro", "67537776804", "pedro@pedro.com", "Pedro123");
		tec1.addPerfis(Perfil.ADMIN);

		Cliente cliente1 = new Cliente(null, "carol", "68907776804", "carol@carol.com", "carol123");

		Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "tela AZUL",
				"Fui ligar e deu uma tela azul", cliente1, tec1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cliente1));
		chamadoRepository.saveAll(Arrays.asList(chamado1));

	}
}
