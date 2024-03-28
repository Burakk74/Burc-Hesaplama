package burç;

import java.util.Scanner;

public class burc {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("kaçıncı ayada doğdunuz :");
		int ay = input.nextInt();
		
		System.out.print("Ayın kaçıncı gününde doğdunuz :");
		int gün = input.nextInt();
		
		if((ay >= 1 && ay <= 12) && (gün >= 1 && gün <= 31)) {
		
		if((ay ==1 && gün >=22) || (ay == 2 && gün <= 19)){
			System.out.print("burcunuz : Kova !");
		
		if((ay == 2 && gün >= 20) || (ay == 3 && gün <= 20 )) {
			System.out.print("Burcunuz : Balık !");
		}
		else if((ay == 3 && gün >= 21) || (ay == 4 && gün <=20)) {
			System.out.print("Burcunuz : Koç !");
		}
		else if((ay == 4 && gün >= 21) || (ay == 5 && gün <= 21)) {
			System.out.print("Burcunuz : Boğa !");
		}
		else if((ay == 5 && gün >= 22) || (ay == 6 && gün <= 22)) {
			System.out.print("Burcunuz : İkizler !");
		}
		else if((ay == 6 && gün >= 23) || (ay == 7 && gün <= 22)) {
			System.out.print("Burcunuz : Yengeç !");
		}
		else if((ay == 7 && gün >= 23) || (ay == 8 && gün <= 22)) {
			System.out.print("Burcunuz : Aslan !");
		}
		else if((ay == 8 && gün >= 23) || ( ay == 9 && gün <= 22)) {
			System.out.print("Burcunuz : Başak !");
		}
		else if((ay == 9 && gün >= 23) || ( ay == 10 && gün >= 22)){
			System.out.print("Burcunuz : Terazi !");
		}
		else if((ay == 10 && gün >= 23) || (ay == 11 && gün <= 21)) {
			System.out.print("Burcunuz : Akrep !");
		}
		else if((ay == 11 && gün >= 22) || (ay == 12 && gün <=21)) {
			System.out.print("Burcunuz : Yay !");
		}
		else if((ay == 12 && gün >= 22) || (ay == 1 && gün <= 21)) {
			System.out.print("Burcunuz : Oğlak !");
		}
		else if((ay == 1 && gün >= 22) || ( ay == 2 && gün <= 19)) {
			System.out.print("Burcunuz : Kova !");
		}
		}
		else if((ay == 2 && gün >= 20) || (ay == 3 && gün <= 20)) {
			System.out.print("Burcunuz : Balık !");
		}
		
		}
		else {
			System.out.print("Doğum tarihinizi yanlış girdiniz !");
		}
	}

}
