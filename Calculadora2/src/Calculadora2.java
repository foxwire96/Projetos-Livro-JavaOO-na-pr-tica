public class Calculadora2 {

	public static void main(String[] args) {
		
		EntradaSaida.countln("Calculadora com 2 classes estáticas.");
		
		char ch = ' ';
		String msg = "";
		
		while(true) {
			EntradaSaida.cout("Para sair digite S ou s: ");
			
			ch = EntradaSaida.cinch();
		if(ch =='S' || ch =='s')break;
			
		EntradaSaida.cout("Digite o primeiro numero: ");
		double d1 = EntradaSaida.cind();

		EntradaSaida.cout("Digite o segundo numero: ");
		double d2 = EntradaSaida.cind();
		
		EntradaSaida.cout("Escolha a operação + - * / -> ");
		char op = EntradaSaida.cinch();
		
		double dResultado = 0;
		
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
			
		case '/': 
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
	EntradaSaida.countln(msg+""+dResultado);
		}
	
	EntradaSaida.countln("Encerrado.");
	
	}
		
}


