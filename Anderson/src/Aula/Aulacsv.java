package Aula;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//PRECISA CONSERTAR
public class Aulacsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("d:\\anderson\\in.txt");
		Scanner sc = null;
		
		try {
			FileWriter writer = new FileWriter("arquivo.csv");
			 sc = new Scanner(file);
			 while (sc.hasNextLine());
			 System.out.println(sc.nextLine());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			if (sc !=null) {
				sc.close();
			}
		}
		
		

	}

}
