package ifsc.projeto.pesquisa.sd.ws.modelos.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSituacao {
	
	@JsonProperty(value="Ano", required = false)
	public Integer ano;
	
	@JsonProperty(value="Situacao", required = false)
	public Integer situacao;

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	} 
	
	
}
