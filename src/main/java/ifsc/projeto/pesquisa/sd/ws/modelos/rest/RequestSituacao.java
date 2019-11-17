package ifsc.projeto.pesquisa.sd.ws.modelos.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSituacao {
	
	@JsonProperty(value="Situacao")
	public Integer situacao;

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	} 
}
