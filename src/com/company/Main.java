package com.company;

public class Main {

    public static void main(String[] args)
    {
	String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
	String [] grades = {"B", "D", "B", "A"};
	boolean found = false;
	String grade = "";
	for ( int i = 0; i < students.length && !found; i++)
    {
        if (students[i].equals("Charlie"))
        {
            found = true;
            grade = grades[i];
        }
    }
	if (found)
	    System.out.println("grade: "+ grade);
	else
	    System.out.println("not here");
    }
}
