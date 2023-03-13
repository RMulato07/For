package lacoFor;
import java.util.Scanner;
public class ComparacaoIdade {
	public static void main(String[] args) {
		int i, anoAtual, anoNasc, idade,maior = 1000,menor = -1000;
		Scanner in = new Scanner(System.in);
		for(i=1; i<=10; i++) {
			System.out.println("Digite o ano atual: ");
			anoAtual = in.nextInt();
			System.out.println("Digite a idade de nascimento: ");
			anoNasc = in.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println("sua idade é: "+idade);
			if(idade <maior) {
				System.out.println("mais novo");
			}
			if(idade > menor) {
				System.out.println("mais velho");
			}
		}
	}

}
