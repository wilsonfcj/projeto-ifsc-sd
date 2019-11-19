package ifsc.projeto.pesquisa.sd.ws.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjetosPorSituacao {
	
	@JsonProperty(value="Situacao")
	private int situacao;
	@JsonProperty(value="Quantidade")
	private int qtd;
	
	public ProjetosPorSituacao(int situacao) {
		super();
		this.situacao = situacao;
		this.qtd = 0;
	}
	
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void addQtd() {
		this.qtd += 1;
	}

}
