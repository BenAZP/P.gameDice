package Base;
import java.util.*; //biblioteca que chama a fun��o Random (� uma importa��o de varios pacotes, esses pacotes est�o importados e s�o importante para executar o m�todo random)
public class Djogos { 
	//declara��o de classe p�blica class jogos
	//Sequ�ncia de atributos
		private Random randomNum=new Random(); //vari�vel privado da fun��o Random (usada para gerar uma corrente de n�meros pseudoaleat�rios, (gera um numero aleat�rio).
		private enum Status {Continue, WON, LOST}; //vari�vel com um conjunto de constantes predefinidas, (vai dar o status da pesssoa dentro do jogo, se ela venceu, perdeu ou se o jogo tem que continuar)
	  
	  //obs: o final que est�o ao lado de private, s�o vari�veis que n�o podem ser alterada. 
		private final static int SNAKE_EYES=2; //vari�vel constante privado de valor fixo do tipo inteiro de valor 2
		private final static int TREY=3; //vari�vel constante privado de valor fixo do tipo inteiro de valor 3
		private final static int SEVEN=7; //vari�vel constante privado de valor fixo do tipo inteiro de valor 7
		private final static int YO_LEVEN=11; //vari�vel constante privado de valor fixo do tipo inteiro de valor 11
		private final static int BOX_CARS=12; //vari�vel constante privado de valor fixo do tipo inteiro de valor 12
		
	  // Abaixo a seguir, os Metodos e o comportamento da classe Djogos:
	  
		public void play() { //m�todo p�blico que n�o retorna nenhum valor
			int myPoint=0; //vari�vel inteira que tem como valor 0
			Status gameStatus; //vari�vel que pode conter as constantes predefinidas de Status (Continue, WON e LOST)
			int sumDice=rollDice(); //vari�vel inteira que tem como valor o m�todo rollDice, vale lembrar que aqui estamos amarzenando a soma de dois numeros aleatr�rios
			
			switch (sumDice) { //pode ter v�rios caminhos de execu��o poss�veis cujo valores representam a vari�vel sumDice
			case SEVEN: //define o valor SEVEN que ser� comparado com a express�o (sumDice)
			case YO_LEVEN: //define o valor YO_LEVEN que ser� comparado com a express�o (sumDice)
				gameStatus=Status.WON; //vari�vel com valor de Status.WON (� executado em case SEVEN e YO_LEVEN)
				break; //encerrar� uma das instru��es do switch envolvente
			case SNAKE_EYES: //define o valor SNAKE_EYES que ser� comparado com a express�o (sumDice)
			case BOX_CARS: //define o valor BOX_CARS que ser� comparado com a express�o (sumDice)
			case TREY: //define o valor TREY que ser� comparado com a express�o (sumDice)
				gameStatus=Status.LOST; //vari�vel com valor de Status.LOST, ou seja ser� executado em case SNAKE_EYES, BOX_CARS e TREY
				break; //encerra mais uma instru��o do switch envolvente
			default: //valores que n�o s�o tratados explicitamente por uma das se��es de case acima
				gameStatus=Status.Continue; //vari�vel com valor de Status.Continue
				myPoint=sumDice; //vari�vel com valor de sum.Dice (vai receber a soma dos dados)
				System.out.printf("\nPoint is %d\n\n", myPoint); //imprimi Strings e especifica a formata��o a ser usada que tem como par�metro (String format, Object... args)
				break; //encerra uma das ultimas instru��es do switch envolvente
			}
			
			while (gameStatus==Status.Continue) { //executa continuamente um bloco de instru��es enquanto uma determinada condi��o for verdadeira (condi��o: se o valor da vari�vel gameStatus for igual a Status.Continue)
				sumDice=rollDice(); //vari�vel que tem como valor o m�todo rollDice
				if (sumDice==myPoint) //execu��o de determinada se��o de c�digo apenas se um teste espec�fico for avaliado como verdadeiro
					gameStatus=Status.WON; //vari�vel com valor de Status.WON (� executado se o valor da vari�vel sumDice for igual a myPoint)
				else //alem de fazer parte do la�o de repeti��o while, ele faz a execu��o de determinada se��o de c�digo quando o teste espec�fico for avaliado como falso
					if (sumDice==SEVEN) //execu��o de determinada se��o de c�digo apenas se um teste espec�fico for avaliado como verdadeiro (� executado se o valor da vari�vel sumDice for diferente de myPoint)
						gameStatus=Status.LOST; //vari�vel com valor de Status.LOST (� executado se o valor da vari�vel sumDice for igual a SEVEN)
			}
			
			if (gameStatus==Status.WON)//execu��o de determinada se��o de c�digo apenas se um teste espec�fico for avaliado como verdadeiro
				System.out.println ("\nPlayer wins"); //imprime Strings no output padr�o (System.out) e cria uma nova linha abaixo da atual (� executado se o valor da vari�vel gameStatus for igual a Status.WON)
			else //ele faz a execu��o de determinada se��o de c�digo quando o teste espec�fico for avaliado como falso
				System.out.println ("\nPlayer loses"); //imprime Strings no output padr�o (System.out) e cria uma nova linha abaixo da atual (� executado se o valor da vari�vel gameStatus for dstinta de Status.WON)
		}
		
		public int rollDice() { //m�todo p�blico inteiro rollDice (rollDice para nos significa rolar dado, ou seja, rola dois dados e d� dois resultados diferente)
			int die1=1+randomNum.nextInt(6); //vari�vel inteira que tem como valor a soma 1 mais a vari�vel randomNum (que recebe como par�metro um n�mero pseudoaleat�rio inteiro entre 1 e 6)
			int die2=1+randomNum.nextInt(6); //vari�vel inteira que tem como valor a soma 1 mais a vari�vel randomNum (que recebe como par�metro um n�mero pseudoaleat�rio inteiro entre 1 e 6)
			int sum=die1+die2; //vari�vel inteira que tem como valor a soma das vari�veis die1 e die2
			System.out.printf ("Player rolled %d+%d=%d\n", die1, die2, sum); //imprime Strings e especifica a formata��o a ser usada que tem como par�metro (String format, Object... args)

			return sum; //retorna o valor inteiro do m�todo sum.
		}
	
}
