import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class EjecicioNotas {

	HashMap<String, Integer> mapaEdades=new HashMap<String, Integer>();
	String nombre, documento,profesion;
	int edad;
	
	public void iniciar() {
		int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de estudiantes"));
		
		int i=0;
		do {
			llenarDatos();
			i++;
		} while (i<cant);
		
		imprimirEstructuraDeDatos();
		validarInformacion();
		
	}

	private void validarInformacion() {
		int mayores=0, menores=0;
		//cant personas
		System.out.println("Cantidad personas: "+mapaEdades.size());

		
		for (Map.Entry<String, Integer> elemento: mapaEdades.entrySet()) {
			if (elemento.getValue()>=18) {
				mayores++;
			}else {
				menores++;
			}
		}
		
		/*
		Iterator<String> iterador=mapaEdades.keySet().iterator();
		while (iterador.hasNext()) {
			String clave = (String) iterador.next();
			if (mapaEdades.get(clave)>=18) {
				mayores++;
			}else {
				menores++;
			}
		}
		*/
		System.out.println("Mayores: "+mayores);
		System.out.println("Menores: "+menores);
		
	}

	private void imprimirEstructuraDeDatos() {
		System.out.println(mapaEdades);
	}

	private void llenarDatos() {
		nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
		documento=JOptionPane.showInputDialog("Ingrese el Documento");
		profesion=JOptionPane.showInputDialog("Ingrese la Profesion");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
		mapaEdades.put(documento, edad);
		imprirDatos();
	}

	private void imprirDatos() {
		String datos="";
		datos+="Nombre: "+nombre+"\n";
		datos+="Documento: "+documento+"\n";
		datos+="Profesión: "+profesion+"\n";
		datos+="Edad: "+edad+"\n";
		
		System.out.println(datos);
	}
	
	
}
