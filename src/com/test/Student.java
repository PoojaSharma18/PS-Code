package com.test;

/**
 * @author PoojaSharma
 *
 */
public class Student {

	private int studentId;
	private int maths;
	private int english;
	private char music;
	private int mathEng;

	public Student(int studentId, int maths, int english, char music) {
		this.studentId = studentId;
		this.maths = maths;
		this.english = english;
		this.music = music;
		this.mathEng = maths + english;
	}
	public void setMathEng(int maths,int english)
	{
		this.mathEng = maths+english;
	}
    public int getMathEng()
    {
    	return mathEng;
    }
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public char getMusic() {
		return music;
	}

	public void setMusic(char music) {
		this.music = music;
	}

	


	    @Override
	    public String toString() {
	        return getStudentId() +","+ getMaths() + "," + getEnglish() +","+ getMusic() +" \n";
	    }

	}

