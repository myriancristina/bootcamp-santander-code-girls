package desafios_basicos_java;

import java.io.IOException;
import java.util.Scanner;

public class IndiceDoVetor { 
	  
            public static void main(String[] args) throws IOException {
 
            @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
            String[] nomes = new String[5];
            for (int i = 0; i < nomes.length; i++)
            {

                nomes[i] = input.nextLine();
            }
 
            int pos = input.nextInt();
            System.out.println(nomes[pos]);
    }
}