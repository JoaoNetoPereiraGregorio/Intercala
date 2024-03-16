package Intercala;

import java.util.Arrays;

public class Intercala {

	public static void main(String[] args) {
		Nota[] a = {
				new Nota("Andre", 4),
				new Nota("Mariana", 5),
				new Nota("Carlos", 8.5),
				new Nota("Paulo", 9)
		};
		Nota[] b = {
				new Nota("Jonas", 3),
				new Nota("Juliana", 6.7),
				new Nota("Guilherme", 7),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 10)
		};
		
		
		int tamanhoA = a.length;
		int tamanhoB = b.length;
		Nota[] resultante = new Nota[tamanhoA + tamanhoB];

		int i = 0,j=0,k=0;
		

		while (i < tamanhoA && j < tamanhoB) {
			if (a[i].getValor() < b[j].getValor()) {
				resultante[k] = a[i];
				i++;
			} else {
				resultante[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < tamanhoA) {
			resultante[k] = a[i];
			i++;
			k++;
		}

		while (j < tamanhoB) {
			resultante[k] = b[j];
			j++;
			k++;
		}

		for(Nota nota: resultante) {
			System.out.println(nota.getNome() + "  " + nota.getValor());
		}

	}

}
