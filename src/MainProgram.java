import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProgram {

	public static void main(String[] args) {
		
		List <String> names = Arrays.asList("  Robson  ", "  Bartolomeu  ", "  Francisco  ", "  Magali  ", "  Cecílio  ", "  Felício  ", "  Filomena  ", "  Peppa  ", "  Augusto  ", "  Eduardo  ", "  Boris  ", "  Doris  ");
		
		List <String> names2 = names.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		
		names2.sort((p,q) -> p.compareTo(q));
		
		int counter = 0;
		
		println("||======Lista de Chamada=====||");
		println("");
		
		
		for (String x : names2) {
			counter++;
			
			if (x.charAt(x.length()-3) == 'A' || x.charAt(x.length()-3) == 'I') {
				styleprintln("(" + counter + "ª)" + " - [" + x + "]");
			}
			
			else {
				styleprintln("(" + counter + "º)" + " - [" + x + "]");
			}
		}

	}
	
	public static void styleprintln (String s) {
		System.out.println("||===========================||");
		System.out.println(s);
		System.out.println("||===========================||");
	}
	public static void println (String s) {
		System.out.println(s);
	}

}
