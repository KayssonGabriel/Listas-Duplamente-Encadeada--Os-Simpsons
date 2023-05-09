package listaDupla;

public class ProjetoListaDuplamenteEncadeada {
	public static void main(String[] args) {
		ListaDupla listaDupla = new ListaDupla();

		TheSimpsons homer = new TheSimpsons("Homer");
		TheSimpsons marge = new TheSimpsons("Marge");
		TheSimpsons bart = new TheSimpsons("Bart");
		TheSimpsons moll = new TheSimpsons("Moll");
		TheSimpsons lisa = new TheSimpsons("Lisa");
		TheSimpsons maggie = new TheSimpsons("Maggie");
		TheSimpsons flanders = new TheSimpsons("Ned Flanders");
		TheSimpsons burns = new TheSimpsons("Sr. Burns");

		// 1
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNoFinal(marge);
		System.out.println(listaDupla.imprimir());
		System.out.println();

		// 2
		listaDupla.esvaziaLista();
		System.out.println(listaDupla.imprimir());
		System.out.println();


		// 3
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNaPos(0, bart);
		listaDupla.adicionaNaPos(1, moll);
		System.out.println(listaDupla.imprimir());
		System.out.println();


		// 4
		listaDupla.esvaziaLista();


		// 5
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNoFinal(bart);
		listaDupla.adicionaNoComeco(lisa);
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 6
		listaDupla.esvaziaLista();
		System.out.println(listaDupla.imprimir());
		System.out.println();


		// 7
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNoFinal(maggie);
		listaDupla.adicionaNaPos(0, bart);
		listaDupla.adicionaNaPos(1, marge);
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.contemUltimoParaPrimeiro(lisa));
		System.out.println();
		
		
		// 8
		listaDupla.esvaziaLista();

		
		// 9
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNoFinal(bart);
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 10
		System.out.println(listaDupla.contemPrimeiroParaUltimo(marge));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(homer));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(maggie));
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 11
		listaDupla.esvaziaLista();
		

		// 12
		listaDupla.adicionaNoComeco(homer);
		listaDupla.adicionaNoFinal(bart);
		listaDupla.adicionaNoFinal(marge);
		listaDupla.adicionaNaPos(1, maggie);
		listaDupla.adicionaNoComeco(flanders);
		listaDupla.adicionaNoFinal(burns);
		System.out.println(listaDupla.imprimir());
		System.out.println();


		// 13
		listaDupla.removeDoFim();
		System.out.println(listaDupla.imprimir());
		System.out.println();


		// 14
		listaDupla.removePos(1);
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 15
		System.out.println(listaDupla.contemPrimeiroParaUltimo(marge));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(homer));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(bart));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(maggie));
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 16
		listaDupla.removeDoComeco();
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 17
		System.out.println(listaDupla.contemPrimeiroParaUltimo(marge));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(homer));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(bart));
		System.out.println(listaDupla.contemPrimeiroParaUltimo(maggie));
		System.out.println(listaDupla.imprimir());
		System.out.println(listaDupla.tamanho());
		System.out.println();


		// 18
		listaDupla.esvaziaLista();
		System.out.println(listaDupla.imprimir());

	}
}
