/*Ejercicio 2: Divisible 
 */

import javax.swing.JOptionPane;

public class Ejercicio2Practico {
	
	public static void main (String[] args) {
		
		String numero;
		int x;
		
		numero=JOptionPane.showInputDialog("introduzca un numero");
		x=Integer.parseInt(numero);
		
		if(x%2==0 && x%3==0)
		{
			JOptionPane.showMessageDialog(null,"es divisible por 2 tanto por 3");
		}
		else if(x%2==0)
		{
			JOptionPane.showMessageDialog(null,"es divisible entre 2");
		}
		else if(x%3==0)
		{
			JOptionPane.showMessageDialog(null,"es divisible entre 3");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"no es divisible por 2 ni por 3");
		}
	}
}

