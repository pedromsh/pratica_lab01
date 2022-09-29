package laboratorio01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Teste {
	
	private Agendamento carregarDadosParaTesteAgendamento() {
		Cliente cliente = new Cliente("080.923.273-19");
		cliente.setId(1);
		cliente.setNome("Pedro");
		
		Cabelereiro cabelereiro = new Cabelereiro("Alex", "088.310.768-70");
		
		Agendamento agendamento = new Agendamento(cliente, cabelereiro);
		Calendar data = Calendar.getInstance();
		data.set(2022, 9, 29, 19, 30);
		agendamento.setData(data);
		
		return agendamento;
	}
	
	public Atendimento carregarDadosParaTesteAtendimento() {
		Cliente cliente = new Cliente("089.258.705-32");
		cliente.setId(1);
		cliente.setNome("Miguel");
		
		Servico servico1 = new Servico();
		servico1.setId(11);
		servico1.setNome("Corte de cabelo");
		servico1.setValor(70);
		servico1.setDescricao("É feito o corte personalizado a partir da escolha do cliente");
		
		Servico servico2 = new Servico();
		servico2.setId(12);
		servico2.setNome("Design de unhas");
		servico2.setValor(35);
		servico2.setDescricao("É feito manuntenção das unhas e personalização com esmaltes a partir da escolha do cliente");
		
		Servico servico3 = new Servico();
		servico3.setId(13);
		servico3.setNome("Design de sobrancelhas");
		servico3.setValor(50);
		servico3.setDescricao("É feito a manutenção personalizada das sobrancelhas a partir da escolha do cliente");
		
		Cabelereiro cabelereiro = new Cabelereiro("Ana", "988.263.276-61");
		
		Atendimento atendimento = new Atendimento(cliente, cabelereiro);
		atendimento.addServico(servico1);
		atendimento.addServico(servico2);
		atendimento.addServico(servico3);
		
		return atendimento;
	}
	
	public Cliente carregarCliente(Scanner entrada) {
		System.out.println("Informe o cpf do cliente: ");
		Cliente cliente = new Cliente(entrada.next());
		System.out.println("id do cliente: ");
		cliente.setId(entrada.nextInt());
		System.out.println("nome do cliente: ");
		cliente.setNome(entrada.next());
		
		return cliente;
	}
	
	public ArrayList<Servico> carregarServico(Scanner entrada) {
		ArrayList<Servico> aux = new ArrayList<Servico>();
		System.out.println("Informe dados sobre os servico(s)");
		String op = "";
		
		do {
			Servico servico = new Servico();
			System.out.println("\nNome do servico:");
			servico.setNome(entrada.next());

			System.out.println("\nDescricao do servico:");
			servico.setDescricao(entrada.next());

			System.out.println("\nValor do servico:");
			servico.setValor(entrada.nextInt());

			aux.add(servico);
			System.out.println("Digite sair ou qualquer tecla para adiocionar novo servico:");
			op = entrada.next();

		} while (!(op.equals("sair")));
		return aux;
	}
	
	public Atendimento dadosCarregadosDoTecladoAtendimento() {
		Scanner entrada = new Scanner(System.in);
		Cliente cliente = carregarCliente(entrada);
		Cabelereiro cabeleireiro = carregarCabelereiro(entrada);
		Atendimento atendimento = new Atendimento(cliente, cabeleireiro);
		atendimento.setListaServico(carregarServico(entrada));
		return atendimento;
	}
	
	private Cabelereiro carregarCabelereiro(Scanner entrada) {

		System.out.println("Informe o nome do cabelereiro: ");
		String nome = entrada.next();
		System.out.print("\ncpf do cabelereiro: ");
		String cpf = entrada.next();
		Cabelereiro cabelereiro = new Cabelereiro(nome, cpf);

		System.out.print("\nid do cabeleireiro: ");
		cabelereiro.setId(entrada.nextInt());

		return cabelereiro;
	}

	public static void main(String[] args) {	
		
		Teste t = new Teste();
		
		Atendimento atendimento1 = t.dadosCarregadosDoTecladoAtendimento();
		System.out.println(atendimento1.imprimir());
		
		Atendimento atendimento2 = t.dadosCarregadosDoTecladoAtendimento();
		Atendimento atendimento3 = t.dadosCarregadosDoTecladoAtendimento();
		
		
		Agendamento agendamento1 = t.carregarDadosParaTesteAgendamento();
		System.out.println(agendamento1.imprimir());
		
		Agendamento agendamento2 = t.carregarDadosParaTesteAgendamento();
		Agendamento agendamento3 = t.carregarDadosParaTesteAgendamento();
		
		Atendimento atendimento4 = t.dadosCarregadosDoTecladoAtendimento();
		System.out.println(atendimento4.imprimir());

	}

}
