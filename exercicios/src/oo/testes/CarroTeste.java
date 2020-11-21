package oo.testes;

import oo.hierarquia.desafio.Carro;
import oo.hierarquia.desafio.Civic;
import oo.hierarquia.desafio.Uno;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro uno1 = new Uno();		
		Carro civic = new Civic();
		
		uno1.velocidadeAtual = 150;
		civic.velocidadeAtual = 250;
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.acelerar();
		civic.acelerar();
	
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.acelerar();
		civic.acelerar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
	}

}