package testes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import negocio.Aluno;
import negocio.Graduacao;
import negocio.Instituicao;

public class TestaInstituicao {
	public static void main(String[] args) {
		
		Calendar dtNascimento;
		
		Graduacao g = new Graduacao();
		g.setNome("João");
		g.setIdade(20);
		g.setMensalidade(1500);
		g.setEmail("joao@joao.com");
		g.setDataNascimento(null);
		
		Graduacao g2 = new Graduacao();
		g2.setNome("Maria");
		g2.setIdade(30);
		g2.setMensalidade(1200);
		g2.setEmail("maria@maria.com");
		g2.setDataNascimento(null);
//		 01/11/1984 às 12:01.
		
		Graduacao e1 = new Graduacao();
		e1.setNome("José");
		e1.setIdade(40);
		e1.setMensalidade(1000);
		e1.setEmail("jose@jose.com");
		e1.setDataNascimento(null);
//		12/12/2012 às 12:12.
		
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(g);
		lista.add(g2);
		lista.add(e1);
		
		Instituicao i1 = new Instituicao();
		i1.setNome("Infnet");
		i1.setEndereco("Rua São José, 90");
		i1.setAlunos(lista);
		
	}
}
