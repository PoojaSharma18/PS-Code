package com.test;
/**
 * Reads the CSV and creates the Student object ArrayList 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	
public List<Student> readCSV(String dataFile) throws FileNotFoundException, IOException {
    	
    	List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(dataFile));  
        
       
        String line=br.readLine(); // Ignoring Reading header
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] fields = line.split(",");   
            
            
            Student student = new Student(Integer.parseInt(fields[0]), 
	                 Integer.parseInt(fields[1]),
	                 Integer.parseInt(fields[2]),
	                 fields[3].charAt(0));
            students.add(student);
            
        }
        br.close();
        return students;
    }

public String getHeader(String dataFile) throws IOException
{
	 
	return new BufferedReader(new FileReader(dataFile)).readLine();
}


}
