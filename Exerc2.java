package RepeticaoExerccios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String continua = "s";
			int idade = 1;
			
			Scanner leia = new Scanner(System.in);
			

			
		while (!continua.equals("n")) {
	    System.out.println("\nDigite uma idade:");
		idade = leia.nextInt();
		idade++;
	
		
		 if(idade < 21) {
			 System.out.println("\nTotal de pessoas menores de 21 anos:"+idade);
		 }else if (idade > 50) {
			 System.out.println("\nTotal de pessoas maiores de 50 anos:"+idade);
		
		
		
		 }
		
		}
		
		
			
			
		}
			
			

}
	