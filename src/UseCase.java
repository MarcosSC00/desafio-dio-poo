import iphone.Iphone;

public class UseCase {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		//Telefone
		iphone.executarTelefone("123456789");
		
		//Reprodutor de Musica
		iphone.executarReprodutor("Lose yourself");
		
		//Navegador na internet
		iphone.executarNavegador("google.com");

	}

}
