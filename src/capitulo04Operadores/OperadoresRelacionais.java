package capitulo04Operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 >  2 ? = " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 <  2 ? = " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 >  3 ? = " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgual = 3 >= 3;
		System.out.println("3 >= 3 ? = " + tresMaiorOuIgual);
		
		Boolean tresMenorOuIgual = 3 >= 3;
		System.out.println("3 <= 3 ? = " + tresMenorOuIgual);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2 ? = " + doisIgualADois);

		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2 ? = " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro = " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIqualQueQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro = " + quatroMaiorOuIqualQueQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco) ? = " + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis) ? = " + cincoIgualASeis);
		
		Integer centoEVinteOito = 128;
		Integer centoEVinteOito02 = 128;
		Boolean centoEVinteOitoIgualcentoEVinteOito = centoEVinteOito.equals(centoEVinteOito02);
		System.out.println("centoEVinteOito.equals(centoEVinteOito02) ? = " + centoEVinteOitoIgualcentoEVinteOito);
		
		
		Boolean centoEVinteOitoIgualcentoEVinteOito02 = centoEVinteOito == centoEVinteOito02;
		System.out.println("centoEVinteOito.equals(centoEVinteOito02) ? = " + centoEVinteOitoIgualcentoEVinteOito02);
		
		
		
	}

}
