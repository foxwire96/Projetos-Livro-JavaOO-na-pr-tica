package calculando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Parte interna da Classe
public class Calculadora {
	
	//Metodo Main
	public static void main(String[] args) throws IOException {
		countln("Calculadora sem OO");
		char ch = ' '; //Criação da variavel ch em espaço em branco
		
		/*While para verificar se o usuario deseja sair
		 * True é looping infinito, dentro do loop é passado a mensagem de sair
		 * se for dado S ou s o loop é quebrado com break */
		while(true) {
			cout("Para sair digite S ou s: ");
			
			ch = cinch();
			if(ch == 'S' || ch =='s')break;
			
			//Caso seja inserido caracter diferente de S/s, o armazenamento em op será escolhido
			cout("Digite o primeiro Numero: ");
			double d1 = cind();
			
			cout("Digite o segundo Numero: ");
			double d2 = cind();
			
			cout("Escolha a operação + - * / -> ");
			char op = cinch();
		
		/*Classe String para mensagem de resposta
		 * Variavel double para armazenar a conta feita */
		String msg = "Invalido";
		double dResultado = 0;
		
		//Switch para executar os valores de op escolhidos pelo usuario 
		switch(op) {
			case '+':
				dResultado = d1+d2;
				msg = "A some é: ";
			break;
			
			case '-':
				dResultado = d1-d2;
				msg = "A subtração é: ";
				break;
				
			case '*':
				dResultado = d1*d2;
				msg = "A multiplicação é: ";
				break;
				
			case '/': //Para divisão é avaliado o segundo numero é diferente de 0
				if(d2 !=0) {
				dResultado = d1/d2;
				msg = "A divisão é: ";
				}
				else {
					dResultado = 999999999.999999999;
					msg = "Erro de divisão por zero";
				}
			break;
			default:
				msg = "Operação não implementada... ";
				break;
			}
		countln(msg+""+dResultado);
			}
		
		countln("Encerrado.");
		
	}

	//Permite ler a String do teclado e retorna
	static String cin() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String str = br.readLine();
		return str;
	}
	//Metodo teste para certificar que os caracteres são todos validos para numero
	static double cind() throws IOException {
		String str = cin();
		double d = 0;
		int i=0;
		while (i<str.length()) {
			if((str.charAt(i)>= '0' && str.charAt(i) <= '9' ) || str.charAt(i) == '.'||
					str.charAt(i) == '-') {i++;continue;}
			else return d;
		}
		d = Double.parseDouble(str);
		return d;
	}
	//Metodo para ler um caractere do teclado
	static char cinch() throws IOException {
		String str = cin();
		char ch = 'e';
		if(str.length() >= 1)
			ch = str.charAt(0);
		return ch;
	}
	/*Metodo cinch utiliza método cin para ler String e seleciona primeiro caractere da String
	 *Metodo cout escreve e mantem cursor na mesma linha
	 *Metodo countl escreve e passa o cursor para a linha seguinte*/
	static void cout(String str) {
		System.out.println(str);
	}
	
	static void countln(String str) {
		System.out.println(str);
	}

}

