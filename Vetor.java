public class Vetor {
    private int [] vet;
    private int tamanho;

    Vetor(){
        this.setTamanho(5);
        vet = new int[this.getTamanho()];
    }
    Vetor(int tamanho){
        this.setTamanho(tamanho);
        vet = new int[this.getTamanho()];
    }

    public int getElemento(int index){
        return this.vet[index];
    }
    public void setElemento(int index, int novoValor){
        this.vet[index] = novoValor;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int novoValor){
        this.tamanho = novoValor;
    }

    public void imprimeVetores(){

        for(int cont = 0; cont < this.getTamanho(); cont++){
            System.out.print(this.getElemento(cont) + " ");
        }
    }

    public void somaVetores(Vetor vet1, Vetor vet2){
        int soma;

        for(int cont = 0; cont < this.getTamanho(); cont++){
            
            soma = vet1.getElemento(cont) + vet2.getElemento(cont);
            this.setElemento(cont, soma);
        }
    }
}
