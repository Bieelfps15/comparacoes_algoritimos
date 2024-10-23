import java.io.IOException;
import java.util.Arrays;

public class Algoritimos {
    public static void main(String[] args) throws IOException {

        int quantidade[] = new int[1000000];
        int vetor = quantidade.length-1;
        for (int i = 0; i < quantidade.length; i++) {
			//desmarcar com a opção que deseja
            //crescente
           //quantidade[i] = i;
            //decrescente
       //quantidade[i] = vetor--;
            //random
          //quantidade[i] = (int)(Math.random()*5000);
        }


        long tempoInicial = System.currentTimeMillis();

       //selectionSort(quantidade);
       //insertionSort(quantidade);
       //bubbleSort(quantidade);
       //mergeSort(quantidade,0,quantidade.length-1);
       //quickSort(quantidade,0,quantidade.length-1);
       //arraysSort(quantidade);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }
    
     public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }


    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    private static void bubbleSort(int vetor[]){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    public  static void quickSort (int[] arr, int comeca, int termina ) {
        if(comeca < termina){
            int q = particao(arr, comeca, termina);
            quickSort(arr, comeca, q);
            quickSort(arr, q + 1 , termina);
        }
    }
    public static void troca (int[] arr, int origem, int destino ) {
        int aux = arr[origem];
        arr[origem] = arr[destino];
        arr[destino] = aux;
    }
    public static int particao(int[] arr, int inicio, int termino){
        int pivo = arr[(inicio + termino)/2];
        int i = inicio - 1;
        int aux = termino + 1;
        while( i < aux){
            do{
                aux = aux - 1;
            }
            while (arr[aux] > pivo);
            do{
                i = i + 1;
            }
            while (arr[i] < pivo );
            if(i < aux ) troca (arr , i , aux );
        }
        return aux;
    }
    
    public static void mergeSort(int[] array, int inicio, int termino) {

        if(termino - inicio >=2) {
            int meio = (inicio + termino) / 2;
            mergeSort(array,  inicio, meio);
            mergeSort(array,  meio , termino);
            mergeIntercala(array, inicio, meio, termino);
        }
    }
    private static void mergeIntercala(int arr[], int inicio, int meio, int termino) {
        int tamanhoA = meio;
        int tamanhoB = termino;
        int tamanhoC = termino - inicio;

        int arrayAuxilar[] = new int [tamanhoC];
        int posicaoA = inicio, posicaoB = meio, posicaoC = 0;

        while (posicaoA < tamanhoA && posicaoB < tamanhoB){
            if(arr[posicaoA] < arr [posicaoB]){
                arrayAuxilar[posicaoC++] = arr[posicaoA++];
            }
            else{
                arrayAuxilar[posicaoC++] = arr[posicaoB++];
            }
        }
        while(posicaoA < tamanhoA){
            arrayAuxilar[posicaoC++] = arr[posicaoA++];
        }
        while(posicaoB < tamanhoB){
            arrayAuxilar[posicaoC++] = arr[posicaoB++];
        }
        for ( int atual = 0 ; atual < arrayAuxilar.length ; atual++ ) {

            arr[atual + inicio] = arrayAuxilar[atual];
        }
    }

    static void imprime(int[] lista){
        System.out.println(Arrays.toString(lista));
    }

    static void arraysSort(int[] a){
        Arrays.sort(a);
    }
}

