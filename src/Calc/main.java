package Calc;

import java.util.Scanner;

class main {
	
	static double firstTrans;
	static double lastTrans;
	static double totalCars;
	static double preferred;
	static double percent;
	static double finalpercent;
	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args){
		setFirst();
		getFirst();
		
		setLast();
		getLast();
		
		setTotalCars();
		getTotalCars();
		
		setPreferred();
		getPreferred();
		
		findPercent();
		removeQualify();
		
		finalbonus();
		}
	
	
	
	
	
	
	
	
	
	
	private static void finalbonus() {
		double temppercent = finalpercent / 100;
		//this math seems off, get the actual math and return to this program.
		double bonus = preferred * temppercent;
		System.out.println(bonus);
		
	}

	private static void removeQualify() {
		double qualify = 16.9;
		finalpercent = qualify/percent;
		finalpercent = finalpercent * 100;
		System.out.println(finalpercent);
		
		
	}

	private static void findPercent() {
		percent = preferred/totalCars;
		percent=percent*100;
		System.out.println("Your preferred percent today was " + percent);
		
	}

	private static void getPreferred() {
		System.out.println("You sold " +preferred+ " today");
		
	}

	private static void setPreferred() {
		preferred = input(" Total preferred slips sold");
		
	}

	public static int input(String trans){
		System.out.println("Please insert your" + trans);
		int input = in.nextInt();
		return input;
	}
	
	public static double setFirst (){
		firstTrans = input(" first transaction.");
		return firstTrans;
	}
	
	public static double getFirst(){
		System.out.println("Your first transaction was " + firstTrans);
		return firstTrans;
	}

	public static double getLast() {
		System.out.println("Your last transaction was " + lastTrans);
		return lastTrans;
	}

	public static void setLast() {
		lastTrans = input(" last transaction.");
	}
	
	public static void setTotalCars(){
		totalCars = lastTrans - firstTrans;
	}
	
	public static void getTotalCars(){
		System.out.println("Your total cars were " + totalCars);
		
	}
}