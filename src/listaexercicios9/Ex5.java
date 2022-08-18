package listaexercicios9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			int[] numeros = new int [2];
			
			System.out.println("Digite o  1° número inteiro: ");
			numeros[0] = ler.nextInt();
			
			System.out.println("Digite o  2° número inteiro: ");
			numeros[1] = ler.nextInt();
			
			
			System.out.println(numeros [0] / numeros[1]);	
		} catch (ArithmeticException e ) {
			System.out.println("Erro de divisão por zero");
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Erro de entrada capturado");
			System.out.println(e.getMessage());
		}catch (RuntimeException e){
			System.out.println("Erro de runtime capturado");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Erro capturado!!!");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Fechando o Scanner...");
			ler.close();
		}
		
	}

}


