package exercice5switch;

import java.util.Scanner;

public class ejercicio5switch {

	public static void main(String[] args)
	{
		// declaracion de variables
		int nMes=0;
		char res='s';
		
		
		//object construction
		Scanner input = new Scanner(System.in);
		do
		{
			nMes=0;
			// validacion de los datos de entrada
			while(nMes<=0) {
		
			System.out.println(" dame un numero de mes ");
			nMes =input.nextInt();
			if(nMes<=0)
			{ System.out.println(" dato no valido");
			
			
			}

		}
			switch(nMes)
			{
			case 1: System.out.println("enero");break;
			case 2: System.out.println("febrero");break;
			case 3: System.out.println("marzo");break;
			case 4: System.out.println("abril");break;
			case 5: System.out.println("mayo");break;
			case 6: System.out.println("junio");break;
			case 7: System.out.println("julio");break;
			case 8: System.out.println("agosto");break;
			case 9: System.out.println("septiembre");break;
			case 10: System.out.println("octubre");break;
			case 11: System.out.println("noviembre");break;
			case 12: System.out.println("diciembre");break;
			default: System.out.println("numero de mes no valido"); 
			
			
			}
			System.out.println(" do you wish to visuality other month s/n");
			res = input.next().charAt(0);
		} while (res=='s');
		

}
}
