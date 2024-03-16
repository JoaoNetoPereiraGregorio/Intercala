package Intercala;

public class intercala2 {

	public static void main(String[] args) {
		Nota[] notas = { new Nota("Andre", 4), new Nota("Mariana", 5), new Nota("Carlos", 8.5), new Nota("Paulo", 9),

				new Nota("Jonas", 3), new Nota("Juliana", 6.7), new Nota("Guilherme", 7), new Nota("Lucia", 9.3),
				new Nota("Ana", 10) };

		

		int miolo = 4;
		
		Nota[] resultante=intercala(miolo,notas);;

		imprime(resultante);

	}

	public static Nota[] intercala(int miolo, Nota[] notas) {
		int i = 0, j = miolo, k = 0;
		Nota[] resultante = new Nota[notas.length];

		while (i < miolo && j < notas.length) {
			if (notas[i].getValor() < notas[j].getValor()) {
				resultante[k] = notas[i];
				i++;
			} else {
				resultante[k] = notas[j];
				j++;
			}
			k++;
		}

		while (i < miolo) {
			resultante[k] = notas[i];
			i++;
			k++;
		}

		while (j < notas.length) {
			resultante[k] = notas[j];
			j++;
			k++;
		}
		return resultante;
	}
	
	public static void imprime(Nota[] notas) {
		for (Nota nota : notas) {
			System.out.println(nota.getNome() + "  " + nota.getValor());
		}
		
	}
	


}
