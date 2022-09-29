package laboratorio01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import lab1.Agendamento;
import lab1.Atendimento;

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
		int cpf = entrada.next();
		Cabelereiro cabelereiro = new Cabelereiro(nome, cpf);

		System.out.print("\nid do cabeleireiro: ");
		cabelereiro.setId(entrada.nextInt());

		return cabelereiro;
	}

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(101);
		cliente1.setId(1);
		cliente1.setNome("ana");
		
		Cliente cliente2 = new Cliente(102);
		cliente2.setId(2);
		cliente2.setNome("iara");
		
		Cliente cliente3 = new Cliente(103);
		cliente3.setId(3);
		cliente3.setNome("glória");
		
		Cabelereiro cabelereiro1 = new Cabelereiro("alex", 201);
		cabelereiro1.setId(21);
		
		Cabelereiro cabelereiro2 = new Cabelereiro("eduardo", 202);
		cabelereiro2.setId(22);
		
		Cabelereiro cabelereiro3 = new Cabelereiro("pedro", 203);
		cabelereiro3.setId(23);
		
		Agendamento agendamento1 = new Agendamento(cliente1, cabelereiro1);
		Calendar data1 = Calendar.getInstance();
		data1.set(2022, 9, 29, 19, 30);
		agendamento1.setData(data1);
		
		Agendamento agendamento2 = new Agendamento(cliente2, cabelereiro2);
		Calendar data2 = Calendar.getInstance();
		data2.set(2022, 9, 29, 20, 30);
		agendamento1.setData(data2);
		
		Agendamento agendamento3 = new Agendamento(cliente3, cabelereiro3);
		Calendar data3 = Calendar.getInstance();
		data1.set(2022, 9, 29, 21, 30);
		agendamento1.setData(data3);
		
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
		
		Atendimento atendimento1 = new Atendimento(cliente1, cabelereiro1);
		atendimento1.addServico(servico1);
		
		Atendimento atendimento2 = new Atendimento(cliente2, cabelereiro2);
		atendimento2.addServico(servico2);
		
		Atendimento atendimento3 = new Atendimento(cliente3, cabelereiro3);
		atendimento3.addServico(servico3);	
		
		Teste t = new Teste();
		
		Atendimento atendimento4 = t.dadosCarregadosDoTecladoAtendimento();
		System.out.println(atendimento4.imprimir());

	}

}
