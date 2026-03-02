package exercicios;

public class Multiplos_de_sete {

	public Multiplos_de_sete(String[] args) {
		
		multiplos(100);
		
		}
	public static void multiplos(int x) {
        if (x < 0) {
			System.out.println("ERRO");
		}
        else {
        for (int i = 0; i <= x; i++) {
        	if (i % 7 == 0) {
        		System.out.println(i + ", ");
        	}
        }
        	
        }
	}

}
