package br.com.generatio.lacowhile;

public class while02 {

	public static void main(String[] args) throws InterruptedException {
		
		int numero = 10;
		
		while(numero >= 0) {
			
			System.out.println("contador: " + numero);
			numero--;
			Thread.sleep(500);
		}

	}

}
