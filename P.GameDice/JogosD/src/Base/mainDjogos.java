package Base;

public class mainDjogos {
// Essa classe criara uma instancia com a classe Jogos atraves do argumento abaixo, permitindo a sua execução  no console

	public static void main(String[] args) {
// public static void main(String[] args) será o responsavel em guardar os argumentos da linha.
		// TODO Auto-generated method stub
		Djogos game = new Djogos();
		// a classe Jogos passara a ter uma nova instancia criada por esa classe.
		game.play();
		//significa que o atributo game irá chamar os metodos e atributos de play no escopo atual.

	}

}
