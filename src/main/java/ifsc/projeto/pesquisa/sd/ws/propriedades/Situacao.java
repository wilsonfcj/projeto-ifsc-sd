package ifsc.projeto.pesquisa.sd.ws.propriedades;

public enum Situacao {
	
	DEFAULT(-1, "Situação não cadastrada"),
	CADSTRO_EM_ANDAMENTO(0,"Cadastro em andamento"),
	SUBMETIDO(1,"Submetido"),
	CADASTRADO(2,"Cadastrado"),
	DISTRIBUIDO_PARA_AVALIAÇÃO_AUTOMATICAMENTE(3,"Distribuído para avaliação (Automaticamente)"),
	AVALIAÇAO_INSUFICIENTE(4,"Avaliação insuficiente"),
	DISTRIBUIDO_PARA_AVALIAÇÃO_MANUALEMTE(5,"Distribuído para avaliação (Manualmente)"),
	APROVADO(6,"Aprovado"),
	EM_EXECUÇÃO(7,"Em execução"),
	FINALIZADO_RENOVADO(8,"Finalizado (Renovado)"),
	FINALIZADO(9,"Finalizado"),
	REPROVADO(10,"Reprovado"),
	DESATIVADO(11,"Desativado"),
	EXCLUIDO(12,"Excluído"),
	FINALIZADO_COM_PENDÊNCIAS(13,"Finalizado com Pendências");

	Situacao(int aCodigo, String aSituacao) {
		this.codigo = aCodigo;
		this.situacao = aSituacao;
	}
	
	public int codigo;
	public String situacao;
	
	public Situacao getSituacao(int aCod) {
		for (Situacao lSituacao :  Situacao.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public Situacao getSituacao(String aSituacao) {
		for (Situacao lSituacao :  Situacao.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(aSituacao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
