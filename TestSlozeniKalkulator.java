package com.vezba1;

public class TestSlozeniKalkulator {

	public static void main(String[] args) {
		SlozeniKalkulator s1=new SlozeniKalkulator();
//		int sum=s1.podeli(50, 10);
//		System.out.println(sum);
//		s1.ispisi50Puta(45);
		int s=SlozeniKalkulator.suma(115);
		System.out.println(s);
		double p=SlozeniKalkulator.stepenX(2.2,3);
		System.out.println(p);
	}
	

}
