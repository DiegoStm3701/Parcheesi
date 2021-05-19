import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		//start of program
		JFrame frame = new JFrame("Parcheesi");

		InitialMenu menu = new InitialMenu();
		
		
		menu.choosePlayers();
		menu.createBackground();


		
		menu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		    	
		    	menu.deleteMenu();
		    	int playerNumber = menu.players();
		    	Board game = new Board(playerNumber);
		    }
		});
		
	}
}
