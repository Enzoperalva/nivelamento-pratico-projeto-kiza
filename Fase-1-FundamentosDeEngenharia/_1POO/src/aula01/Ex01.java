package aula01;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int senhaUsuario, senhaCorreta = 1234, cont = 0;

		do {
			cont++;
			System.out.print("Senha: ");
			senhaUsuario = input.nextInt();
			if(cont>0) {
				System.out.println("Senha errada");
			}

		} while(senhaUsuario != senhaCorreta);

		System.out.println("Acesso permitido");


		input.close();
	}
}
