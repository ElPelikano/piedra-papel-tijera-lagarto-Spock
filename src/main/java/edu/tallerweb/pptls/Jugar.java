package edu.tallerweb.pptls;

public class Jugar{
	
	public static void main(String[] args) {
		
		Mano mano1 = new Mano(4);
		Mano mano2 = new Mano(2);
		
		mano1.jugarCon(mano2);
	}
}