package com.test;
/**
 * @author PoojaSharma
 * Ranking Students for Principal
 */
import java.util.Comparator;

public class PrincipalRankingCriteria  implements Comparator<Student>{
    
		
		@Override
		public int compare(Student s1, Student s2) {
			
		        	//get the total of English and Maths and compare
		        	int s1EngMath = s1.getEnglish() + s1.getMaths();
		        	int s2EngMath = s2.getEnglish() + s2.getMaths();

		        	        	
		        	
		        	//Sorting on Eng and Maths Marks
		            if(s1EngMath > s2EngMath) {
		                return -1;
		            } else if (s1EngMath < s2EngMath) {
		                return 1;
		            } 
		            //If English and Maths marks are equal, use music as tie breaker
		            else if(s1.getMusic()  < s2.getMusic()) {
		                return -1;
		            } else if (s1.getMusic()  > s2.getMusic()) {
		                return 1;
		            } 
		            //If English and Maths marks are equal and Music grades are also same use Student Id and Tie Breaker
		            else if (s1.getStudentId() < s2.getStudentId()){
		                return -1;
		           }
		          else if (s1.getStudentId()  > s2.getStudentId()) {
		              return 1;
		          }else {
		            	
		                return 0;
		            }
		        }
		} 


