package Intercala;

public class Intercala4Quicksort {

	public static void main(String[] args) {
		Nota[] notas = { new Nota("Carlos", 4), new Nota("Andre", 8), new Nota("Lucia", 10), new Nota("Mariana", 3),
				new Nota("Paulo", 6), new Nota("Ana", 9), new Nota("Jonas", 9.5), new Nota("Guilherme", 5),
				new Nota("Juliana", 7) };

		imprime(notas);
		System.out.println("\n-----------------------------------------\n");
		quick(notas, 0, 8);
		imprime(notas);

	}

	public static void imprime(Nota[] notas) {
		for (Nota nota : notas) {
			System.out.println(nota.getNome() + "  " + nota.getValor());
		}

	}

	public static int particiona(Nota[] notas, int inicio, int termino) {
		int menoresAteAgora = (inicio);
		Nota pivo = notas[termino];
		Nota aux;
		for (int analisandoAgora = inicio; analisandoAgora <= termino; analisandoAgora++) {
			if (notas[analisandoAgora].getValor() < pivo.getValor()) {
				troca(notas, analisandoAgora, menoresAteAgora);
				menoresAteAgora++;
			}

			if (analisandoAgora == termino) {
				troca(notas, termino, menoresAteAgora);

			}

		}
		return menoresAteAgora;
	}

	public static void troca(Nota[] notas, int a, int b) {
		Nota aux;

		aux = notas[a];
		notas[a] = notas[b];
		notas[b] = aux;
	}

	public static void quick(Nota[] notas, int inicio, int termino) {

		if (inicio < termino) {
			int pivo = particiona(notas, inicio, termino);

			quick(notas, inicio, pivo - 1);
			quick(notas, pivo + 1, termino);
		}
	}

}
