package com.test;

import java.util.Comparator;

public class RankFactory {
	 public Comparator<Student> getRank(String rankFor){
		 if (rankFor.equals("Principal"))
			 return new PrincipalRankingCriteria();
		 else
			 if (rankFor.equals("MusicTeacher"))
				 return new MusicTeacherRanking();
		//by default we return PrincipalRanking
		 return new PrincipalRankingCriteria();
	 }

}
