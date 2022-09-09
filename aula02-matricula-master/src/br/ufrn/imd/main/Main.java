package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;

import br.ufrn.imd.domino.Aluno;
import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {

		//C
		Aluno jose = new Aluno();
		jose.setNome("Jos� da Silva");
		jose.setMatricula("20229393939");
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 19);
		dataNascimento.set(Calendar.MONTH, 06);
		dataNascimento.set(Calendar.YEAR, 1988);
		jose.setDataNascimento(dataNascimento.getTime());
		
		Curso bti = new Curso();
		bti.setDescricao("Bacharelado em Tecnologia da Informa��o");
		
		jose.setCurso(bti);
		
		Disciplina imd0040 = new Disciplina();
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programa��o II");
		
		jose.setDisciplinas(new ArrayList<Disciplina>());
		jose.getDisciplinas().add(imd0040);
		jose.setIra(9.6);
		
		System.out.println(jose);
		
		for (Disciplina d : jose.getDisciplinas()) {
			System.out.println(d);
		}
		
		//inser��o interativa desses itens 
		//regras de neg�cio - implementa��o dos m�todos de solicitar matr�cula
		
	}

}
