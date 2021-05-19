import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class InitialMenu extends JFrame{
	
	
	public void choosePlayers() {
		
		
		
		JPanel playerQuestion = new JPanel();
		
		playerQuestion.setLocation(400,300);
		playerQuestion.setSize(600,50);
		playerQuestion.setBackground(backgroundColor);
		JLabel howMany = new JLabel("Please choose a number of players");
		howMany.setFont(new Font("Calibri",Font.PLAIN,40));
		
		playerQuestion.add(howMany);
		background.add(playerQuestion);
		
		JPanel imagePanel = new JPanel();
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./Images/background2.png"));
			
			JLabel imageLable = new JLabel(new ImageIcon(image));
			imageLable.setSize(200, 200);
			imageLable.setLocation(0, 0);
			imagePanel.add(imageLable);
			imagePanel.setLocation(600, 100);
			imagePanel.setSize(200,200);
			imagePanel.setBackground(backgroundColor);
			background.add(imagePanel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(550,400);
		buttonPanel.setSize(300,50);
		buttonPanel.setBackground(backgroundColor);
		
		
		JLabel numberLabel = new JLabel(""+playerNumber);
		numberLabel.setFont(new Font("Calibri",Font.PLAIN,25));
		numberLabel.setSize(30,50);
		numberLabel.setLocation(140,0);
		buttonPanel.add(numberLabel);
		background.add(buttonPanel);
		
		JButton removePlayer = new JButton("-");
		removePlayer.setFont(new Font("Calibri",Font.BOLD,25));
		removePlayer.setLocation(70,0);
		removePlayer.setSize(50,50);
		removePlayer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				playerNumber--;
				if(playerNumber < 2) {
					playerNumber = 2;
				}
				numberLabel.setText(""+playerNumber);
			}
		});
		buttonPanel.add(removePlayer);
		
		JButton addPlayer = new JButton("+");
		addPlayer.setFont(new Font("Calibri",Font.BOLD,25));
		addPlayer.setLocation(170,0);
		addPlayer.setSize(50,50);
		addPlayer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				playerNumber++;
				if(playerNumber > 4) {
					playerNumber = 4;
				}
				numberLabel.setText(""+playerNumber);
				
			}
		});
		buttonPanel.add(addPlayer);
		
		
		
		JPanel startPanel = new JPanel();
		startPanel.setLayout(null);
		startPanel.setLocation(550,500);
		startPanel.setSize(300,200);
		startPanel.setBackground(Color.white);
		background.add(startPanel);
		
		startButton.setFont(new Font("Calibri",Font.PLAIN,35));
		startButton.setSize(300,200);
		startButton.setLocation(0,0);
		
		startPanel.add(startButton);
		
		

		
	}
	
	public void createBackground() {
		background.setLayout(null);
		background.setBackground(backgroundColor);
		creators();
		
		setTitle("Menu");
		setSize(1400,800);
		add(background);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void creators() {
		JPanel creatorPanel = new JPanel();
		creatorPanel.setSize(400,210);
		creatorPanel.setLocation(1000, 0);
		creatorPanel.setBackground(backgroundColor);
		creatorPanel.setBorder(border);
		
		JLabel creatorLabel = new JLabel("<html>Created By:<br/> Diego De Saint Malo <br/> Raul Rodriguez <br/> Ricardo Lasso </html?");
		creatorLabel.setSize(creatorPanel.getSize());
		creatorLabel.setLocation(0,0);
		creatorLabel.setFont(new Font("Calibri",Font.PLAIN,40));
		
		
		creatorPanel.add(creatorLabel);
		
		background.add(creatorPanel);
	}
	
    public void addActionListener(ActionListener listener) {
        startButton.addActionListener(listener);
    }  
	
    public void deleteMenu() {
    	setVisible(false);
    	
    }
    public int players() {
    	return playerNumber;
    	
    }
    
    
    static Border border = new LineBorder(Color.BLACK, 2, true);
    private JButton startButton = new JButton("START GAME!");
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	private int playerNumber = 2;
	
	
}



