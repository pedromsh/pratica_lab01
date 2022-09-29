package laboratorio01;

import java.util.ArrayList;
import java.util.Calendar;
import laboratorio01.Servico;

public class Atendimento {
	
	private Cliente cliente;
	private Calendar data;
	private ArrayList<Servico> listaServico;
	private Cabelereiro cabelereiro;
	
	public Atendimento(Cliente cliente, Cabelereiro cabelereiro) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();		
		this.cabelereiro = cabelereiro;
		listaServico = new ArrayList<Servico>();
		
	}
	
	public void setListaServico(ArrayList<Servico> lista) {
		listaServico = lista;
	}
	
	public void addServico(Servico servico) {
		listaServico.add(servico);
	}
	
	public String imprimir() {
		String saida = "";

		saida += "----------------------------------------------------\n";
		saida += "\n******* Cliente:  *******";
		saida += "\n id: " + this.cliente.getId();
		saida += "\n Nome: " + this.cliente.getNome();
		saida += "\n CPF:  " + this.cliente.getCPF();

		saida += "\n\n*******  Cabeleiro:  *******  ";
		saida += "\n id: " + this.cabelereiro.getId();
		saida += "\n Nome: " + this.cabelereiro.getNome();
		saida += "\n CPF:  " + this.cabelereiro.getCpf();

		saida += "\n\n*******  Servicos:  *******  ";
		for (Servico servico : listaServico) {
			saida += "\n id: " + servico.getId();
			saida += "\n nome: " + servico.getNome();
			saida += "\n descricao: " + servico.getDescricao();
			saida += "\n valor: " + servico.getValor() + "\n";
		}

		saida += "----------------------------------------------------";

		return saida;
	}

}
