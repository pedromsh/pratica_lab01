package laboratorio01;

import java.util.Calendar;

public class Agendamento {
 
	private int id;
	private Calendar data;
	private Cliente cliente;
	private Cabelereiro cabelereiro;
	
	public Agendamento(Cliente cliente, Cabelereiro cabelereiro) {
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id > 0)
		this.id = id;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}
	
	public String imprimir() {
		String saida="";
		saida+="----------------------------------------------------\n";
		saida+="\n******* Cliente:  *******";
		saida+="\n id: " + this.cliente.getId();
		saida+="\n Nome: " + this.cliente.getNome();
		saida+="\n CPF:  "+ this.cliente.getCPF();
		
		saida+= "\n\n*******  Cabeleiro:  *******  ";
		saida+="\n id: " + this.cabelereiro.getId();
		saida+="\n Nome: " + this.cabelereiro.getNome();
		saida+="\n CPF:  "+ this.cabelereiro.getCpf();
		
		saida+="\n Data do agendamento:  "+ 
		+ this.data.get(Calendar.DATE) + "/"
		+ this.data.get(Calendar.MONTH) + "/"
		+ this.data.get(Calendar.YEAR) + " - "
		+ this.data.get(Calendar.HOUR) + ":" 
		+this.data.get(Calendar.MINUTE) + "/";
		
		return saida;
	}
	
}
