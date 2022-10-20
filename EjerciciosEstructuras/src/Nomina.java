import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Nomina {

	public void iniciar() {
		
		ArrayList<Double> listaDescuentos=new ArrayList<Double>();
		HashMap<String, Double> mapaDescuentos=new HashMap<String, Double>();
		
		double descuento,sueldoActual,porDescuento;
		int estrato;	
		
		String menu="MENU DESCUENTOS\n";
		menu+="1 - 2 : 2%\n";
		menu+="3 - 4 : 4%\n";
		menu+="5 : 8%\n";
		menu+="6 : 10%\n";
		menu+="Ingrese su estrato\n";
		
		String preg="";
		String codigo="";
		int emp=0;
		do {
			emp++;
			codigo="empleado"+emp;
			sueldoActual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo actual"));
			estrato=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (estrato) {
			case 1:
			case 2: porDescuento=0.02;	break;
			case 3:
			case 4: porDescuento=0.04;	break;
			case 5: porDescuento=0.08;	break;
			case 6: porDescuento=0.1;	break;
			default:System.out.println("No es un estrato valido");
					porDescuento=0;		
				break;
			}
			
			descuento=sueldoActual*porDescuento;
			listaDescuentos.add(descuento);
			
			
			System.out.println();
			System.out.println("El total de descuentos es: ");
			for (int i = 0; i < listaDescuentos.size(); i++) {
				System.out.println(listaDescuentos.get(i));
			}
			
			
			mapaDescuentos.put(codigo, descuento);
			
			
			
			System.out.println("\nMAPA");
			System.out.println(mapaDescuentos);
			System.out.println(mapaDescuentos.values());
			
			Iterator<String> iterador=mapaDescuentos.keySet().iterator();
			System.out.println();
			while (iterador.hasNext()) {
				String clave = (String) iterador.next();
				System.out.println(mapaDescuentos.get(clave));
			}
			
			
			
			preg=JOptionPane.showInputDialog("Ingrese si para continuar");
			
		} while (preg.equalsIgnoreCase("si"));
		
		

		
		
		
		
	}
	
	
}
