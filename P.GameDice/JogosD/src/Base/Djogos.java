package Base;
import java.util.*; //biblioteca que chama a função Random (è uma importação de varios pacotes, esses pacotes estão importados e são importante para executar o método random)
public class Djogos { 
	//declaração de classe pública class jogos
	//Sequência de atributos
		private Random randomNum=new Random(); //variável privado da função Random (usada para gerar uma corrente de números pseudoaleatórios, (gera um numero aleatório).
		private enum Status {Continue, WON, LOST}; //variável com um conjunto de constantes predefinidas, (vai dar o status da pesssoa dentro do jogo, se ela venceu, perdeu ou se o jogo tem que continuar)
	  
	  //obs: o final que estão ao lado de private, são variáveis que não podem ser alterada. 
		private final static int SNAKE_EYES=2; //variável constante privado de valor fixo do tipo inteiro de valor 2
		private final static int TREY=3; //variável constante privado de valor fixo do tipo inteiro de valor 3
		private final static int SEVEN=7; //variável constante privado de valor fixo do tipo inteiro de valor 7
		private final static int YO_LEVEN=11; //variável constante privado de valor fixo do tipo inteiro de valor 11
		private final static int BOX_CARS=12; //variável constante privado de valor fixo do tipo inteiro de valor 12
		
	  // Abaixo a seguir, os Metodos e o comportamento da classe Djogos:
	  
		public void play() { //método público que não retorna nenhum valor
			int myPoint=0; //variável inteira que tem como valor 0
			Status gameStatus; //variável que pode conter as constantes predefinidas de Status (Continue, WON e LOST)
			int sumDice=rollDice(); //variável inteira que tem como valor o método rollDice, vale lembrar que aqui estamos amarzenando a soma de dois numeros aleatrórios
			
			switch (sumDice) { //pode ter vários caminhos de execução possíveis cujo valores representam a variável sumDice
			case SEVEN: //define o valor SEVEN que será comparado com a expressão (sumDice)
			case YO_LEVEN: //define o valor YO_LEVEN que será comparado com a expressão (sumDice)
				gameStatus=Status.WON; //variável com valor de Status.WON (é executado em case SEVEN e YO_LEVEN)
				break; //encerrará uma das instruções do switch envolvente
			case SNAKE_EYES: //define o valor SNAKE_EYES que será comparado com a expressão (sumDice)
			case BOX_CARS: //define o valor BOX_CARS que será comparado com a expressão (sumDice)
			case TREY: //define o valor TREY que será comparado com a expressão (sumDice)
				gameStatus=Status.LOST; //variável com valor de Status.LOST, ou seja será executado em case SNAKE_EYES, BOX_CARS e TREY
				break; //encerra mais uma instrução do switch envolvente
			default: //valores que não são tratados explicitamente por uma das seções de case acima
				gameStatus=Status.Continue; //variável com valor de Status.Continue
				myPoint=sumDice; //variável com valor de sum.Dice (vai receber a soma dos dados)
				System.out.printf("\nPoint is %d\n\n", myPoint); //imprimi Strings e especifica a formatação a ser usada que tem como parâmetro (String format, Object... args)
				break; //encerra uma das ultimas instruções do switch envolvente
			}
			
			while (gameStatus==Status.Continue) { //executa continuamente um bloco de instruções enquanto uma determinada condição for verdadeira (condição: se o valor da variável gameStatus for igual a Status.Continue)
				sumDice=rollDice(); //variável que tem como valor o método rollDice
				if (sumDice==myPoint) //execução de determinada seção de código apenas se um teste específico for avaliado como verdadeiro
					gameStatus=Status.WON; //variável com valor de Status.WON (é executado se o valor da variável sumDice for igual a myPoint)
				else //alem de fazer parte do laço de repetição while, ele faz a execução de determinada seção de código quando o teste específico for avaliado como falso
					if (sumDice==SEVEN) //execução de determinada seção de código apenas se um teste específico for avaliado como verdadeiro (é executado se o valor da variável sumDice for diferente de myPoint)
						gameStatus=Status.LOST; //variável com valor de Status.LOST (é executado se o valor da variável sumDice for igual a SEVEN)
			}
			
			if (gameStatus==Status.WON)//execução de determinada seção de código apenas se um teste específico for avaliado como verdadeiro
				System.out.println ("\nPlayer wins"); //imprime Strings no output padrão (System.out) e cria uma nova linha abaixo da atual (é executado se o valor da variável gameStatus for igual a Status.WON)
			else //ele faz a execução de determinada seção de código quando o teste específico for avaliado como falso
				System.out.println ("\nPlayer loses"); //imprime Strings no output padrão (System.out) e cria uma nova linha abaixo da atual (é executado se o valor da variável gameStatus for dstinta de Status.WON)
		}
		
		public int rollDice() { //método público inteiro rollDice (rollDice para nos significa rolar dado, ou seja, rola dois dados e dá dois resultados diferente)
			int die1=1+randomNum.nextInt(6); //variável inteira que tem como valor a soma 1 mais a variável randomNum (que recebe como parâmetro um número pseudoaleatório inteiro entre 1 e 6)
			int die2=1+randomNum.nextInt(6); //variável inteira que tem como valor a soma 1 mais a variável randomNum (que recebe como parâmetro um número pseudoaleatório inteiro entre 1 e 6)
			int sum=die1+die2; //variável inteira que tem como valor a soma das variáveis die1 e die2
			System.out.printf ("Player rolled %d+%d=%d\n", die1, die2, sum); //imprime Strings e especifica a formatação a ser usada que tem como parâmetro (String format, Object... args)

			return sum; //retorna o valor inteiro do método sum.
		}
	
}
