import java.util.Scanner;

/**
 * Escreva uma descrição da classe liguaDoP aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class linguaDoP {
    public static void main (String args[]){
        Boolean programaRodando = true;
        
        while(programaRodando){
            Scanner scanner = new Scanner (System.in);
            System.out.print("Digite 1 para criptografar, 2 para descriptografar e 3 para sair do programa \n ");
            int opcao = scanner.nextInt();
             if(opcao == 1){
                Scanner sc = new Scanner (System.in);
                System.out.print("Digite uma frase para ser impressa na lingua do p: ");
                String frase = sc.nextLine();
                String[] separado = frase.split("(?<=.)");
                String fraseFinal = "";
                for(int i = 0; i < separado.length; i++){
                    if(Character.isWhitespace(frase.charAt(i)) == false){
                        fraseFinal += "p";
                    }
                    fraseFinal += separado[i];
                }
                System.out.println(fraseFinal);    
            }
        
        
            if(opcao == 2){
                
            }
            
            if(opcao == 3){
                programaRodando = false;
            }
        }
    }
}

