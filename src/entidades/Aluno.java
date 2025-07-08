package entidades;

public class Aluno 
{
	public String NomeAluno;
	public double Np1;
	public double Np2;
	public double Pim;
	
	public double CalculaNota() 
	{
		return (Np1 * 4 + Np2 * 4 + Pim * 2) / 10;
	}
	
	public double CalculaPontosRestantes() 
	{
		return 7 - CalculaNota();
	}
	
	public void ExibeSituacao() 
	{
		if(CalculaNota() < 7) 
		{
			System.out.printf("\nREPROVADO"
					+ "\nFaltando %.2f pontos"
					+ "\nNota final: %.2f", CalculaPontosRestantes(), CalculaNota());
		}
		else 
		{
			System.out.printf("\nAPROVADO"
					+ "\nNota final: %.2f", CalculaNota());
		}
	}
	
	
}
