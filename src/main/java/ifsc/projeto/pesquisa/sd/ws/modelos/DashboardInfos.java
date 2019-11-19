package ifsc.projeto.pesquisa.sd.ws.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DashboardInfos {
	
	@JsonProperty(value="TotalProjetos")
	private int totalProjetos;
	@JsonProperty(value="QuantidadePorSituacao")
	private List<ProjetosPorSituacao> projetosPorSituacaos;
	
	public int getTotalProjetos() {
		return totalProjetos;
	}
	
	public void setTotalProjetos(int totalProjetos) {
		this.totalProjetos = totalProjetos;
	}
	
	public List<ProjetosPorSituacao> getProjetosPorSituacaos() {
		return projetosPorSituacaos;
	}
	
	public void setProjetosPorSituacaos(List<ProjetosPorSituacao> projetosPorSituacaos) {
		this.projetosPorSituacaos = projetosPorSituacaos;
	}
	
}
