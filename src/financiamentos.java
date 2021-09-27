//Atividade prática com objetivo de revisar conceitos vistos em java.
import java.util.Scanner;

public class financiamentos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';
        //estrutura onde imprime o menu e solicita que a pessoa escolha uma opcao
        do{
            System.out.println("*-----------------BRADESCO FINANCIAMENTOS---------------*");
            System.out.println("*-----------------------Bem vindo-----------------------*");
            System.out.println("\n 1-Crédito Pessoal \n 2-Crédito Especial \n 3-Crédito Imobiliário \n 4-Crédito Empresarial \n 5-Crédito Consignado");
            System.out.print(" Escolha uma opção: ");
            opcao = Byte.parseByte(sc.nextLine());

            switch(opcao){
                case 1:
                System.out.println("*-----------------Crédito Pessoal-----------------*");
                break;
                case 2:
                System.out.println("*-----------------Crédito Especial-----------------*");
                break;
                case 3:
                System.out.println("*-----------------Crédito Imobiliário-----------------*");
                break;
                case 4: 
                System.out.println("*-----------------Crédito Pessoal-----------------*");
                break;
                case 5:
                System.out.println("*-----------------Crédito Consignado-----------------*");
                break;
                default:
                System.out.println("O número digitado não é válido");
                break;
           }

           if(opcao > 0 && opcao < 6){ // Estrutura que permite a escolha de sair ou voltar pro menu
            do{
                System.out.println("Se você deseja sair aperte S e se deixar voltar para o menu aperte V");
                continua = sc.nextLine().toUpperCase().charAt(0);
            }while(continua != 'V' && continua !='S'); 
         } 
        }while(continua < 1 || opcao > 6 || continua == 'V'); // condicao para que o do while aconteça

    }
}