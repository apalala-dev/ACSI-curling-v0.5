package controler;
import model.*;
import view.*;

public class Ctrl_main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V_accueil ac = new V_accueil();
		ac.setVisible(true);
		ac.setUrl("http://www.microsoft.com");
		ReadFile.checkURL("fichiertexte.txt");
	}
	
	
}
