package Intercala;

public class Intercala3MergeSort {

	public static void main(String[] args) {
		Nota[] notas = { new Nota("Carlos", 8.5), new Nota("Andre", 4), new Nota("Lucia", 9.3), new Nota("Mariana", 5),
				new Nota("Paulo", 9), new Nota("Ana", 10), new Nota("Jonas", 3), new Nota("Guilherme", 7),
				new Nota("Juliana", 6.7) };

		imprime(notas);

		ordena(notas, 0, notas.length);
		System.out.println("\n-----------------------------------------\n");

		imprime(notas);

	}

	public static void intercala(Nota[] notas, int inicio, int miolo, int termino) {
		int indexA = inicio, indexB = miolo, indexResultado = 0;
		Nota[] resultado = new Nota[termino - inicio];

		while (indexA < miolo && indexB < termino) {
			if (notas[indexA].getValor() < notas[indexB].getValor()) {// para inverter a ordem e colocar em ordem decrescente basta alterar o sinal para maior
				resultado[indexResultado] = notas[indexA];
				indexA++;
			} else {
				resultado[indexResultado] = notas[indexB];
				indexB++;
			}
			indexResultado++;
		}

		while (indexA < miolo) {
			resultado[indexResultado] = notas[indexA];
			indexA++;
			indexResultado++;
		}

		while (indexB < termino) {
			resultado[indexResultado] = notas[indexB];
			indexB++;
			indexResultado++;
		}

		for (int i = 0; i < indexResultado; i++) {
			notas[inicio + i] = resultado[i];
		}

	}

	public static void imprime(Nota[] notas) {
		for (Nota nota : notas) {
			System.out.println(nota.getNome() + "  " + nota.getValor());
		}

	}

	public static void ordena(Nota[] notas, int inicio, int termino) {

		int quantidade = termino - inicio;

		if (quantidade > 1) {
			int meio = (inicio + termino) / 2;
			ordena(notas, inicio, meio);
			ordena(notas, meio, termino);
			intercala(notas, inicio, meio, termino);
		}

	}

}
