package listaexercicios9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) throws FileNotFoundException {

		File arquivo = new File("c:\\temp\\arquivo.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {

				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!\n" + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
