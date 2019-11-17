package ifsc.projeto.pesquisa.sd.ws.modelos.rest;

public class ResponseBase<E> {
	private boolean sucesso;
	private String mensagem;
	private E Data;
	
	public ResponseBase() {
		super();
	}
	
	public ResponseBase(boolean sucesso, String mensagem, E data) {
		super();
		this.sucesso = sucesso;
		this.mensagem = mensagem;
		Data = data;
	}
	public boolean isSucesso() {
		return sucesso;
	}
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public E getData() {
		return Data;
	}
	public void setData(E data) {
		Data = data;
	}
	
	
}
