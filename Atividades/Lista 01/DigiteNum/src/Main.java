
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0; //Criamos um contador para sabermos quantos números forem digitador
        int number, minnumber=0, maxnumber=0, soma=0;
        //Declaramos as variáveis
        //Criamos um looping com while, necessário para receber todos os valores
        while(true) {
            count++;//Somamos +1 no contador ao inicio de todos os loopins
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número ");
            number = scan.nextInt();
            //Input dos números

            if(count==1){     //Quando o contador for == 1, envia valores a todas as variáveis
                maxnumber = number;
                minnumber = number;
                soma = number;
            }
            if(number>maxnumber){     //Quando um número que foi inserido por ultimo, for maior do que os outros que
                maxnumber = number;   //haviam entrado antes, ele substitui, para saber o maior número enviado
            }
            if(number<minnumber){     //O mesmo que acontece com o if de cima, porém desta vez com o menor número
                minnumber = number;
            }
            soma = soma + number;   //Aqui onde acontece todas as somas, para saber a média final de todos os valores
            if(number == -1) { //Quando o usuário enviar -1, irá apresentar os dados abaixo
                float media = soma/count;    //Média de todos os valores enviados
                System.out.println("Foram digitados "+count+" numeros");
                System.out.println("O maior número digitado foi: "+maxnumber);
                System.out.println("O menor número digitado foi: "+minnumber);
                System.out.println("A média dos valores é: "+media);
                //Apresentação dos dados solicitados
                break;  //Break para encerrar o looping
                //OBS: -1 está contando como um número inserido
            }
        }
    }
}