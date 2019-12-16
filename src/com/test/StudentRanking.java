package com.test;
/**
 * @author PoojaSharma
 * 
 * This is the Driver Class
 *
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class StudentRanking {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		
		StudentRanking st = new StudentRanking();  
		CSVReader csv = new CSVReader();
		//putting a default option
		int i =10;
		
		//Reading test.csv file, The file is located at the project location
		List<Student> students = csv.readCSV("test.csv");
		String header=csv.getHeader("test.csv"); 
		//Getting the header of the file
		String[] headers = header.split(","); 
		
		//Loop till user decides to exit 
		while( i != 0){
			System.out.println("Select your option:\n 1.feed CSV file \n 2. print students for principal. \n 3. print students for music teacher\n 0.quit");			
			Scanner sc = new Scanner(System.in); 
			i = sc.nextInt();
		switch(i)
		{
			case 1: 
			{
				System.out.println("The file is read from: test.csv");				
				break;
			}
			case 2:
			{
				
				Collections.sort(students, new PrincipalRankingCriteria());
				System.out.println(headers[0]+","+headers[1]+","+headers[2]+","+headers[3]);
				for(Student stud : students) {
		            System.out.println(stud);
		        }
				
				break;
		         
			}
			case 3:
			{
				Collections.sort(students, new MusicTeacherRanking());
				System.out.println(headers[0]+","+headers[1]+","+headers[2]+","+headers[3]);
				for(Student stud : students) {
		            System.out.println(stud);
		        }
				break;
			}
			case 0:
			{
				System.out.println("Exiting...");
				break;
			}
			default:
			{
				System.out.println("Please pick 1,2 or 3 or 0 for quit as option");
				break;
			}
			
		}
	}
		
		
		
		
	}

}
