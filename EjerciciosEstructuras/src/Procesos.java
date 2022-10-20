import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {

	/*
	 * Haga un algoritmo donde se construya un arreglo resultante 
	 * de la suma de 2 arreglos del mismo tamaño, el nuevo arreglo 
	 * mostrará en cada posición el resultado de la suma de las mismas 
	 * posiciones de los otros 2, para el llenado de los 2 arreglos, 
	 * solicite el ingreso al usuario, adicionalmente debe mostrar el 
	 * contenido de los 3 arreglos, tanto los iniciales como el resultante. 
	 */
	
	ArrayList<Integer> listA=new ArrayList<Integer>();
	ArrayList<Integer> listB=new ArrayList<Integer>();
	ArrayList<Integer> listC=new ArrayList<Integer>();
	
	public void iniciar() {
		
		llenarListas();
		
	}

	private void llenarListas() {
		
		int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las listas"));
		
		asignarValores(tam,"Lista1");
		asignarValores(tam,"Lista2");
	
		System.out.println(listA);
		System.out.println(listB);
		
		calcularSumatoria();
	}

	private void asignarValores(int tam, String msj) {
		JOptionPane.showMessageDialog(null, "SE VA A LLENAR LA "+msj);
		int val=0;
		for (int i = 0; i < tam; i++) {
			val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor numerico para la "+msj));
			
			if (msj.equals("Lista1")) {
				listA.add(val);
			}else {
				listB.add(val);
			}
		}
	}

	private void calcularSumatoria() {
		
		for (int i = 0; i < listA.size(); i++) {
			listC.add(listA.get(i)+listB.get(i));
		}
		
		System.out.println(listC);
	}
	
	

	
	
	
	
	
	
	
	
}
