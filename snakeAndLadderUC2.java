package com.bridgelabz.day4_snakeandladder;
public class snakeAndLadderUC2 
{
	  static final int START_POSITION = 0;

	    public static void main(String[] args)
	    {
	        System.out.println("Welcome to snake ladder game");
	        System.out.println("Player will start from zero position.");

	        int dieRolling = (int) Math.floor(Math.random() * 10) % 7;
	        if (dieRolling == 0)
	        {
	            dieRolling = dieRolling + 1;
	        }
	        System.out.println("Number on die is: " + dieRolling);
	    }
}
