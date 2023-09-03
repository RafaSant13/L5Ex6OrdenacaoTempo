package view;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;
import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal {
	
	public static void main(String arqs[]) {
		BubbleSort bs = new BubbleSort();
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		int tamanho = 1500;
		int [] vetor = new int [tamanho];
		
		for (int i = 0;i<tamanho;i++) {
			vetor [i] = (tamanho - 1)-i;
		}
		int []vetorBubble = new int [tamanho];
		int []vetorMerge = new int [tamanho];
		int []vetorQuick = new int [tamanho];
		
		double tempoInicial = System.nanoTime();
		vetorBubble = bs.bubbleSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo BubbleSort = "+tempoTotal + "s");
		
		tempoInicial = System.nanoTime();
		vetorMerge = ms.mergeSort(vetor, 0, tamanho-1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo MergeSort = "+tempoTotal + "s");
		
		tempoInicial = System.nanoTime();
		vetorQuick = qs.quickSort(vetor, 0, tamanho-1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo QuickSort = "+tempoTotal + "s");
	}
	
	
}
