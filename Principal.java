import ventanaInicio.VInicio;
import ventEstablecerPass.VEstablecerPass;
import ficheros.Lector;

/**
 * 
 * @author Victor Escobar
 * @version 1
 * @
 *
 */

public class Principal {
	
	private static VInicio vIni;
	private static VEstablecerPass vPass;
	
	public static void main(String arg[]){
		Lector lec = new Lector();
		
		if(lec.getContenido()[0].equals("")){
			vPass = new VEstablecerPass();
			vPass.setTitle("Establecer contraseña");
			vPass.setSize(385,220);
			vPass.setLocationRelativeTo(null);
			vPass.setResizable(false);
			vPass.setVisible(true);
			VEstablecerPass.setVentana(vPass);
			
		}
		else{
			vIni = new VInicio();
			vIni.setSize(250,150);
			vIni.setLocationRelativeTo(null);
			vIni.setResizable(false);
			vIni.setVisible(true);
			VInicio.setVentana(vIni);
		}
	}
}
