package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import negocio.Aluno;

public class TestaApp {

	public static void main(String[] args) {
		System.out.println("AppLast");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		int qtde = Integer.valueOf(args[0]);
		
		Scanner ler = new Scanner(System.in);
		
		// criando uma lista com o list, list não tem tamanho
//		List<String> listaNomes = new ArrayList<String>();
//		List<Integer> listaIdades = new ArrayList<Integer>();
//		List<Float> listaMensalidades = new ArrayList<Float>();
		
		// criando uma lista com vetores recebendo o tamanho pelo args
//		String[] nomes = new String[qtde];
//		int[] idades = new int[qtde];
//		float[] mensalidades = new float[qtde];

		for (int i = 0; i < qtde; i++) {
			Aluno a = new Aluno();
			
			System.out.println("Informe o nome do aluno:"); // puxando do teclado com vetor
//			nomes[i] = ler.next();
			a.setNome(ler.next());
			
//			listaNomes.add(ler.next()); // puxando do teclado com list
			
			System.out.println("Informe a idade do aluno:");
//			idades[i] = ler.nextInt();
			a.setIdade(ler.nextInt());
			
//			listaIdades.add(ler.nextInt());
			
			System.out.println("Informe a mensalidade do aluno:");
//			mensalidades[i] = ler.nextFloat();
			a.setMensalidade(ler.nextFloat());
			
			alunos.add(a);
			
//			listaMensalidades.add(ler.nextFloat());
		}
		for(Aluno aluno: alunos) {
			aluno.exibir();
		}
		
//		for (int i = 0; i < qtde; i++) {
//			System.out.printf("O aluno %s tem %d anos e paga R$%.2f\n",
//					listaNomes.get(i),
//					listaIdades.get(i),
//					listaMensalidades.get(i)
//				);
		}
}

