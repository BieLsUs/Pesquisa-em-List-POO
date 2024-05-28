
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class SomaNumeros {
	
//	Atributos
	private List<Integer> numeroList;
	
	public SomaNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
//	Métodos
	 public void adicionarNumero(int numero) {
		 this.numeroList.add(numero);
	 }
	 
	 public int calcularSoma() {
		 int soma = 0;
		 if(!numeroList.isEmpty()) {
			 for(int numero : numeroList) {
				 soma += numero;
			 }
			 
		 } else {
			 throw new RuntimeException("Lista vazia!");
			 }
		 
		 return soma;
	 }
	 
	 
	 public int encontrarMaiorNumero() {
		 int maiorNumero = Integer.MIN_VALUE;
		 
		 if(!numeroList.isEmpty()) {
			 for(int numero : numeroList) {
				 if(numero >= maiorNumero) {
					 maiorNumero = numero;
				 }
			 }
		 }else {
			 throw new RuntimeException("Lista vazia!");
			 }
		 
		 return maiorNumero;
	 }
	 
	 
	 public int encontrarMenorNumero() {
		 int menorNumero = Integer.MAX_VALUE;
		 
		 if(!numeroList.isEmpty()) {
			 for(int numero : numeroList) {
				 if(numero <= menorNumero) {
					 menorNumero = numero;
				 }
			 }
		 }else {
			 throw new RuntimeException("Lista vazia!");
			 }
		 return menorNumero;
	 }
	 
	 public void exibirNumeros() {
		 if(!numeroList.isEmpty()) {
			 System.out.println(numeroList);
		 }else System.out.println("A lista está vazia!");
	 }
	 
	 
	 
	 
	 public static void main(String[] args) {
		SomaNumeros somaNumero = new SomaNumeros();
		
		
		somaNumero.adicionarNumero(5);
		somaNumero.adicionarNumero(-3);
		somaNumero.adicionarNumero(-10);
		somaNumero.adicionarNumero(7);
		somaNumero.adicionarNumero(80);
		
		System.out.println("Números adicionados!");
		somaNumero.exibirNumeros();
		
		System.out.println("Soma dos números adicionados: " + somaNumero.calcularSoma());
		System.out.println("Este é o maior número: " + somaNumero.encontrarMaiorNumero());
		System.out.println("Este é o menor número: " + somaNumero.encontrarMenorNumero());
		 
	}

}
