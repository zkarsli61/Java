package day28exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {
	
	/*
	 	We learned how to read a text file character by character.
	 	We will learn how to read a text file line by line.
	 */

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src/day27exceptions/TextFile01"));
			
			String line = br.readLine();
			
			while(line!= null) {
				
				System.out.println(line);
				
				line = br.readLine();
				
			}
					
		} catch (FileNotFoundException e) {
			
			System.out.println("There is an issue about path or accessing file...");
			
		} catch (IOException e) {
			
			System.out.println("There is an issue in reading file...");
			
		}

	}

}











