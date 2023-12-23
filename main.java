import java.util.Scanner;
public class main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        Vetor vet1 = new Vetor();
        Vetor vet2 = new Vetor();
        Vetor vet3 = new Vetor();

        int num1, num2;

        for(int cont = 0; cont < vet1.getTamanho(); cont++){
            num1 = ler.nextInt();
            vet1.setElemento(cont, num1);
        }
        for(int cont = 0; cont < vet2.getTamanho(); cont++){
            num2 = ler.nextInt();
            vet2.setElemento(cont, num2);
        }

        vet3.somaVetores(vet1, vet2);
        vet3.imprimeVetores();
    }
}