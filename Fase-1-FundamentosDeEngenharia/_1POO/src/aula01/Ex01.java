package aula01;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[5];

		double media=0, soma=0, quantNotas=0;
		String resultadoFinalTurma, notasTurma = "";

		for (int i = 0; i < arr.length; i++) {
			quantNotas++;
			System.out.printf("Nota do aluno %d:", i+1);
			arr[i] = input.nextDouble();
			soma+=arr[i];
			notasTurma += arr[i] + " ";
		}

		media = soma/quantNotas;

		if (media >= 7 && media <= 10) {
			resultadoFinalTurma = "Turma aprovada!";
		} else if (media >=5) {
			resultadoFinalTurma = "Turma de recuperação!";
		}else {
			resultadoFinalTurma = "Turma reprovada!";
		}

		System.out.printf("Notas da turma: %s%n", notasTurma);
		System.out.printf("Média da turma: %.1f%n", media);
		System.out.println(resultadoFinalTurma);

		input.close();
	}
}
