import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
   	 
    	Scanner scan = new Scanner(System.in);
    	System.out.println("CONVERSOR DE BINÁRIO PARA DECIMAL");
    	System.out.println("Digite os dígitos do binário: ");
    	System.out.println("(quando terminar o binário, digite X)");
   	 
    	int bitsAmount = 0;
    	ArrayList<Integer> bitsArray = new ArrayList<>();
    	String input = "";
   	 
    	do{
        	System.out.println("Dígito " + (bitsAmount+1) + ": ");
        	input = scan.nextLine();
        	switch(input){
            	case "0":
                	bitsArray.add(0);
                	bitsAmount++;
            	break;
            	case "1":
                	bitsArray.add(1);
                	bitsAmount++;
            	break;
            	case "X":
                	System.out.println("Calculando número: ");
            	break;
            	default:
                	System.out.println("ERRO: somente 0s, 1s e X são permitidos! ");
            	break;
        	}
    	}while(!input.equals("X"));
   	 
    	int decimalValue = 0;
   	 
    	if(bitsAmount != 0){
        	for(int i = 0; i < bitsAmount; i++){
            	decimalValue += Math.pow(2, i) * bitsArray.get(i);
        	}
    	}
   	 
    	System.out.println("Valor em decimal: " + decimalValue);
	}
}


