package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class DetalhesTopicoDTO {

	private Long id;
	private String titulo;
	private String mensagem;
	private String nomeCurso;
	private String nomeAutor;
	private List<RespostaDTO> respostas;
	private LocalDateTime dataCriacao;

	public DetalhesTopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.nomeCurso = topico.getCurso().getNome();
		this.nomeAutor = topico.getAutor().getNome();
		this.dataCriacao = topico.getDataCriacao();

		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDTO::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public List<RespostaDTO> getRespostas() {
		return respostas;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}	

}
