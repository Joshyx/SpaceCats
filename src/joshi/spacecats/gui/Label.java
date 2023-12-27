package joshi.spacecats.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import joshi.spacecats.main.Difficulty;
import joshi.spacecats.main.Main;
import joshi.spacecats.main.RocketCollision;
import joshi.spacecats.main.Var;

public class Label extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (Var.inGame) {
			
			JLabel label = new JLabel();
	        label.setBounds(Var.backgroundX1, 0, 1920, 1080);
	        label.setIcon(new ImageIcon((getClass().getResource("sky1.png"))));
	        label.setVisible(true);
	        Var.jf1.add(label);
	        
	        JLabel label2 = new JLabel();
	        label2.setBounds(Var.backgroundX2, 0, 1920, 1080);
	        label2.setIcon(new ImageIcon((getClass().getResource("sky1.png"))));
	        label2.setVisible(true);
	        Var.jf1.add(label2);
	        
	        JLabel label3 = new JLabel();
	        label3.setBounds(Var.x, Var.y, 200, 130);
	        label3.setIcon(new ImageIcon((getClass().getResource(Main.skin))));
	        label3.setVisible(true);
	        Var.jf1.add(label3);
	        
			g.drawImage(Var.icat, Var.x, Var.y, 200, 130, null);

			for (int i = 0; i <= 9; i++) {
				g.drawImage(Var.irocket, Var.rocketX[i], Var.rocketY[i], 170, 45, null);
			}

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.imouse, Var.mouseX[i], Var.mouseY[i], 50, 50, null);
			}

			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.irat, Var.ratX[i], Var.ratY[i], 50, 50, null);
			}

			g.drawImage(Var.isquirrel, Var.squirrelX, Var.squirrelY, 50, 50, null);

			g.drawImage(Var.ifood, 1650, 960, 55, 55, null);
			g.setColor(new Color(003, 003, 003));
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString(" = " + Var.food, 1700, 1000);

			g.drawImage(Var.iheart, 1650, 900, 50, 50, null);
			g.setColor(new Color(003, 003, 003));
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString(" = " + Var.health, 1700, 940);

			g.setColor(Color.BLACK);
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString("Level: " + Var.lvl, 50, 50);
			
			g.drawString("Sub to PewDiePie", Var.pewdsX, 50);

			if (RocketCollision.hit) {

				g.setColor(new Color(205, 000, 000, 80));
				g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			}

			if (Difficulty.lvlup) {

				if (Var.lvl == Var.highscorenew + 1) {
					
					g.setColor(new Color(255, 105, 180, 80));
					g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
					
				} else {
				
					g.setColor(new Color(050, 205, 050, 80));
					g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
				
				}

			}

			repaint();
		} else if (Var.inMenu || Var.inOptions || Var.inShop || Var.inCredits || Var.inTextures) {

			g.drawImage(Var.ib1, Var.backgroundX1, 0, 1920, 1080, null);
			g.drawImage(Var.ib2, Var.backgroundX2, 0, 1920, 1080, null);

			g.drawImage(Var.icat, Var.x, Var.y, 200, 130, null);

			for (int i = 0; i <= 9; i++) {
				g.drawImage(Var.irocket, Var.rocketX[i], Var.rocketY[i], 170, 45, null);
			}

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.imouse, Var.mouseX[i], Var.mouseY[i], 50, 50, null);
			}

			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.irat, Var.ratX[i], Var.ratY[i], 50, 50, null);
			}

			g.drawImage(Var.isquirrel, Var.squirrelX, Var.squirrelY, 50, 50, null);

			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.ITALIC, 75));
			g.drawString("Space Cats", 700, 150);

			if (!Var.inCredits && !Var.inOptions && !Var.inTextures && !Var.inDeathScreen) {
				
				g.setColor(Color.BLACK);
				g.fillRoundRect(1000, 865, 230, 45, 10, 10);
				g.setColor(new Color(000, 191, 255));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Best Score: " + Var.highscorenew, 1005, 900);
				
				g.setColor(Color.BLACK);
				g.fillRoundRect(845, 765, 150, 45, 10, 10);
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Food: " + Var.food, 850, 800);

				g.setColor(Color.BLACK);
				g.fillRoundRect(845, 815, 150, 45, 10, 10);
				g.setColor(new Color(205, 000, 000));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Health: " + Var.health, 850, 850);

				g.setColor(Color.BLACK);
				g.fillRoundRect(845, 865, 150, 45, 10, 10);
				g.setColor(new Color(255, 000, 255));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Level: " + Var.lvl, 850, 900);

			} 
			
			if (Var.inCredits) {

				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("Credits", 700, 300);
				g.setFont(new Font("Arial", Font.PLAIN, 35));
				g.drawString("Programmierer:", 480, 400);
				g.drawString("Joshi", 880, 400);
				g.drawString("Grafik:", 480, 450);
				g.drawString("Benas, Oli, Yassin, Mama, Papa, Davi", 880, 450);
				g.drawString("Soundesign:", 480, 500);
				g.drawString("Laurens", 880, 500);
				g.drawString("Maskottchen:", 480, 550);
				g.drawString("Lucy, Lilli, Leni, Locke, Tiger", 880, 550);

			} 
			
			if (Var.inOptions) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial", Font.BOLD, 50));
				g.drawString("Options", 800, 250);
			} 
			
			if (Var.inShop) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial", Font.BOLD, 50));
				g.drawString("Shop", 800, 250);
			} 
			
			if (Var.inTextures) {

				g.setColor(Color.BLACK);
				g.fillRect(290, 190, 1340, 700);
				g.setColor(new Color(000, 191, 255));
				g.fillRect(300, 200, 1320, 680);
				
				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial", Font.BOLD, 50));
				g.drawString("Textures", 800, 250);

				g.drawImage(Var.icat, 800, 300, 200, 130, null);
				g.drawImage(Var.irocket, 800, 550, 170, 45, null);
				g.drawImage(Var.imouse, 630, 700, 100, 100, null);
				g.drawImage(Var.irat, 930, 700, 100, 100, null);
				g.drawImage(Var.isquirrel, 1350, 700, 100, 100, null);
				
				repaint();
				
			}

		} else if (Var.inDeathScreen) {

			g.drawImage(Var.ib1, Var.backgroundX1, 0, 1920, 1080, null);
			g.drawImage(Var.ib2, Var.backgroundX2, 0, 1920, 1080, null);

			g.drawImage(Var.icat, Var.x, Var.y, 200, 130, null);

			for (int i = 0; i <= 9; i++) {
				g.drawImage(Var.irocket, Var.rocketX[i], Var.rocketY[i], 170, 45, null);
			}

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.imouse, Var.mouseX[i], Var.mouseY[i], 50, 50, null);
			}

			for (int i = 0; i <= 1; i++) {
				g.drawImage(Var.irat, Var.ratX[i], Var.ratY[i], 50, 50, null);
			}

			g.drawImage(Var.isquirrel, Var.squirrelX, Var.squirrelY, 50, 50, null);

			g.setColor(new Color(205, 000, 000, 80));
			g.fillRect(0, 0, Var.screenwidth, Var.screenheight);

			g.setColor(Color.BLACK);
			g.fillRoundRect(510, 205, 880, 60, 10, 10);
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.BOLD, 50));
			g.drawString("Touching a rocket isn't a good idea.", 520, 250);

			g.setColor(Color.BLACK);
			g.fillRoundRect(845, 300, 150, 45, 10, 10);
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Food: " + Var.food, 850, 335);

			g.setColor(Color.BLACK);
			g.fillRoundRect(845, 437, 150, 45, 10, 10);
			g.setColor(new Color(255, 000, 255));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Level: " + Var.lvl, 850, 472);

			g.setColor(Color.BLACK);
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Press <ENTER> to continue", 750, 700);
			
			if (Var.lvl > Var.highscoreold) {
				
				g.setColor(Color.BLACK);
				g.fillRoundRect(780, 580, 350, 45, 10, 10);
				g.setColor(new Color(255, 105, 180));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("NEW HIGHSCORE: " + Var.highscorenew, 785, 615);

			} else if (Var.lvl <= Var.highscoreold) {
				
				g.setColor(Color.BLACK);
				g.fillRoundRect(815, 580, 250, 45, 10, 10);
				g.setColor(new Color(255, 105, 180));
				g.setFont(new Font("Arial", Font.BOLD, 35));
				g.drawString("High Score: " + Var.highscorenew, 820, 615);

			}
			
			repaint();
		}

	}
	
}