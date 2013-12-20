package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class V_accueil extends JFrame{

	/**
	 * @param args
	 */
	JLabel url;
	
	public V_accueil(){
		super("Accueil");
		this.setBounds(100, 100, 200, 200);
		url = new JLabel("URL : urlàmettre");
		this.add(url,BorderLayout.CENTER);
		
		JButton fermer = new JButton("Fermer");
		fermer.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		this.add(fermer,BorderLayout.SOUTH);
	}
	
	public void setUrl(String pUrl){
		this.url.setText("Url : " + pUrl); 
	}
}
