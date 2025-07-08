package consoleapp;
import entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("\n** Calcula média **");
		System.out.print("\nPreencha os campos abaixo...");
		System.out.print("\nNome: ");
		aluno.NomeAluno = sc.nextLine();
		System.out.print("\nNota NP1: ");
		aluno.Np1 = sc.nextDouble();
		System.out.print("\nNota NP2: ");
		aluno.Np2 = sc.nextDouble();
		System.out.print("\nNota PIM: ");
		aluno.Pim = sc.nextDouble();
		
		System.out.print("\n\nCalculando sua nota...\n");
		
		aluno.ExibeSituacao();
		
		sc.close();
	}
}
