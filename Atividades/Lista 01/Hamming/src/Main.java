import java.util.Scanner;
import java.util.ArrayList;
//Import do Scanner para fazermos os dois inputs das fitas de DNA
//+ o import da ArrayList para compararmos as duas fitas

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira fita de DNA: ");
        String dna1 = sc.nextLine();
        //Input da primeira fita de DNA, e armazenando ela no dna1

        ArrayList<Character> dna1Array = new ArrayList<>(); //Criamos uma ArrayList para armazenar a fita de DNA
        for (int i = 0; i < dna1.length(); i++) { //Apor receber a primeira fita, iremos transformar ela em uma ArrayList
            dna1Array.add(dna1.charAt(i)); //Onde será dividido cada letra-> {"A", "T", "G"}
        }

        System.out.println("Digite a segunda fita de DNA: "); //Repetiremos o mesmo processo para a segunda fita de DNA
        String dna2 = sc.nextLine();

        ArrayList<Character> dna2Array = new ArrayList<>();
        for (int i = 0; i < dna2.length(); i++) {
            dna2Array.add(dna2.charAt(i));
        }

        if (dna1Array.size() != dna2Array.size()) { //Irá comparar os tamanhos das duas fitas
            System.out.println("As fitas de DNA devem ter o mesmo tamanho");
            return; //Caso uma fita sejá maior que a outra será apresentado a mensagem a cima ao usuárioS
        }

        int distance = 0; //Atribuimos 0 a distância
        for (int i = 0; i < dna1Array.size(); i++) { //Aqui onde será comparado as duas fitas
            if (!dna1Array.get(i).equals(dna2Array.get(i))) {
                distance++; //Se os caracteres na posição 'i' forém iguais, adiciona +1 na distancia...
                            //E dessa forma é calculada a distância de hamming
            }
        }

        System.out.println("A distância de Hamming é: " + distance); //Onde será impresso ao usuário a distância de Hamming
    }
}