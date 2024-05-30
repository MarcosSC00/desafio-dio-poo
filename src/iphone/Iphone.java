package iphone;

import navegador.Navegador;
import reprodutor_musical.Reprodutor;
import telefone.Telefone;

public class Iphone implements Navegador, Telefone, Reprodutor {

	@Override
	public void tocar() {
		System.out.println("Musica em play.");
	}
	
	@Override
	public void pausar() {
		System.out.println("Musica pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando a musica: " + musica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " +numero);
	}
	
	@Override
	public void atender() {
		System.out.println("Ligação atendida.");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz aberto.");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina com a url: " +url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atulaizada.");
	}
	
	public void executarTelefone(String numero) {
		System.out.println("Iniciando o Telefone...");
		ligar(numero);
		atender();
		iniciarCorreioDeVoz();
		System.out.println("###############################");
	}
	
	public void executarReprodutor(String musica) {
		System.out.println("Iniciando o Reprodutor de musica...");
		selecionarMusica(musica);
		pausar();
		tocar();
		System.out.println("###############################");
	}
	
	public void executarNavegador(String url) {
		System.out.println("Executando o Navegador...");
		exibirPagina(url);
		atualizarPagina();
		adicionarNovaAba();
		System.out.println("###############################");
	}

}
