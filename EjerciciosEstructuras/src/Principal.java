import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String menu="MENU EJERCICIOS\n";
		menu+="1. Ejercicio1: Edades estudiantes\n";
		menu+="2. Ejercicio 2 :Suma de Listas\n";
		menu+="3. Ejercicio 3 :Descuentos\n";
		menu+="Que ejercicio desea correr?";
		
		String resp="";
		do {
		

			int opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				new EjecicioNotas().iniciar();
				break;
			case 2:
				new Procesos().iniciar();
			
				break;
			case 3:
				new Nomina().iniciar();
				break;

			default:System.out.println("No es un ejercicio valido");
				break;
			}
			
			resp=JOptionPane.showInputDialog("Ingrese si para continuar probando ejercicios");
			
		} while (resp.equalsIgnoreCase("si"));
		
	}

}
