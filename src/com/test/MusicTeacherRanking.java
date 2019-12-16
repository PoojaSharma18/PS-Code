package com.test;
/**
 * @author PoojaSharma
 * Ranking Students for Music Teacher
 */
import java.util.Comparator;

public class MusicTeacherRanking  implements Comparator<Student>{
    
		
		@Override
		public int compare(Student s1, Student s2) {
			//sort on Music grades
       	 if(s1.getMusic()  < s2.getMusic()) {
                   return -1;
               } else if (s1.getMusic()  > s2.getMusic()) {
                   return 1;
               } 
       	 //use student Id for tie breaker
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
