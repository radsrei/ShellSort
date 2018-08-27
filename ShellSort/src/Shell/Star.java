package Shell;

import java.util.*;

public class Star{
	
	public static void main(String[] args) {
		System.out.print("Teste padronizado (1) ou teste criado por usuario (2)\n");
		Scanner input = new Scanner(System.in);
		 int i;
		 int caso = input.nextInt();
		 int cont = 0;
		 ShellLogica vetor = new ShellLogica ();
		 
	    	 
	    	 
	    if(caso ==1) {
	    	//teste padronizado	    			 
	    	int  []padrao = new int[] {3,7,4,5,1,8,2,6,9,0};
	    	vetor.sort(padrao);
	    	for(cont=0; cont<padrao.length; cont++) {
	    		System.out.println(padrao[cont]);
	    	}   		
	    }
		if (caso ==2) {
			//teste por input
			System.out.println("Digite o numero de vetores");
			cont = input.nextInt();
	    	int[] valor = new int [cont];
	    	for(i=0; i<cont; i++) {      
	    		valor[i] = input.nextInt();   
	    	}
	    	vetor.sort(valor);	 	
	        for(i=0 ; i<cont ; i++){
	        	System.out.println(valor[i]);
	        }	     
		}
	}
}