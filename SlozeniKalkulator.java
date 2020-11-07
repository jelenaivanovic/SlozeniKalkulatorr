package com.vezba1;

public class SlozeniKalkulator {
	
	public double podeli(double a, double b) {
		double suma= a/b;
		return suma;
		
	}
	public int podeli(int a, int b) {
		int suma= a/b;
		return suma;

	}
	public int podeliMod(int a, int b) {
		int suma= a%b;
		return suma;
    }
	public void ispisi50Puta(int a) {
		
		for(int i=0; i<50; i++) {
			System.out.println(a);
		}
			
	}

	public void ispisi1Do100() {
		for(int i=1; i<101; i++) {
			System.out.println(i);
		}
		
	}
	//6. Statičku metodu *suma* koja kao parametar dobija ceo broj N 
   //	i računa i vraća sumu S(N) = 1+2+3+4+5+...+(N-1)+N
	
	public static int suma(int n) {
		int suma=0;
		for(int i=0; i<n; i++) {
			suma=suma+i;
		}
		suma=suma+n;
		return suma;
		
	
	}
	//7. Statičku metodu *stepenX* koja kao parametre dobija realan broj X i ceo broj N i 
   //	računa i vraća X na N-ti stepen (pri čemu N nije negativan broj).
	
    public static double stepenX(double x, int n) {
    	if(n<0) {
    		return 0;
    	}else {
    		return Math.pow(x, n);
    	}	
    }
   // 8. Statičku metodu *minStepenDva* koja kao parametar dobija ceo broj N i
  //    izračunava i vraća najmanje 2 na n-ti stepen koje je veće od zadatog broja.
 //    Zadati broj se daje u vidu ulaznog argumenta. Primer: ako je zadat broj 6, 
//    metoda vraća 8 (2 na treći stepen) jer je to najmanje 2 na n koje je veće od 6.
    
    
}
