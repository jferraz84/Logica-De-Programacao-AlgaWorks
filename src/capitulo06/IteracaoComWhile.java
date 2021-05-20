package capitulo06;

public class IteracaoComWhile {

	public static void main(String[] args) {
		
//		int i = 0;
//		while (i < 10) {
//			System.out.println("Imprimindo varias vezes");
//			i++;
//		}

//		int i = 0;
//		while (i < 10) {
//			if (i == 5) {
//				System.out.println("Vai parar !");
//				break;
//			}
//			System.out.println("Imprimindo varias vezes");
//			i++;
//		}
		
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				System.out.println("NÂO Vai parar mais !");
				i++;
				continue;
			}
			System.out.println(i +": Imprimindo varias vezes");
			i++;
		}
	}

}
