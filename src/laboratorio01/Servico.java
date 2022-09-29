package laboratorio01;

public class Servico {
	
	private int id;
	private String nome;
	private int valor;
	private String descricao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id > 0)
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.length() > 4)
		this.nome = nome;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		if(valor > -1)
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length() > 9)
		this.descricao = descricao;
	}
	

}
