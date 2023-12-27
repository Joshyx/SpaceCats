package joshi.spacecats.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class KeyHandler implements KeyListener{

	static int tempKeyHandler = 0;
	private int temp1 = 0, temp2 = 0;
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;
		}		//moveing up while holding "w"
		
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = true;
		}		//moveing left while holding "a"
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = true;
		}		//moveing down while holding "s"
		
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = true;
		}		//moveing right while holding "d"
		
		if (tempKeyHandler == 0) {
			
			//menu
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				Var.inGame = false;
				Var.inMenu = true;
				Var.inOptions = false;
				Var.inShop = false;
				Var.inCredits = false;
				
				Var.btnresume.setVisible(true);
				Var.btnoptions.setVisible(true);
				Var.btnshop.setVisible(true);
				Var.btnexit.setVisible(true);
				Var.btnback.setVisible(false);
				Var.btnhealth.setVisible(false);
				Var.btnskin.setVisible(false);
				Var.btncredits.setVisible(true);
				
				Var.btnresume.requestFocus();
				Var.btnoptions.requestFocus();
				Var.btnshop.requestFocus();
				Var.btnexit.requestFocus();
				Var.btncredits.requestFocus();
				
				tempKeyHandler++;
			} 
		} else if (tempKeyHandler == 1) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE && !Var.inDeathScreen) {
				Var.inGame = true;
				Var.inMenu = false;
				Var.inOptions = false;
				Var.inShop = false;
				Var.inCredits = false;
				Var.inTextures = false;
				
				Var.btnresume.setVisible(false);
				Var.btnoptions.setVisible(false);
				Var.btnshop.setVisible(false);
				Var.btnexit.setVisible(false);
				Var.btnback.setVisible(false);
				Var.btncredits.setVisible(false);
				
				tempKeyHandler--;
				Update.tempUpdate = 0;
				
			}
				
		}
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER && Var.inDeathScreen) {
			
			Var.inGame = false;
			Var.inMenu = true;
			Var.inOptions = false;
			Var.inShop = false;
			Var.inCredits = false;
			Var.inDeathScreen = false;
			
			Var.btnresume.setVisible(true);
			Var.btnoptions.setVisible(true);
			Var.btnshop.setVisible(true);
			Var.btnexit.setVisible(true);
			Var.btnback.setVisible(false);
			Var.btnhealth.setVisible(false);
			Var.btnskin.setVisible(false);
			Var.btncredits.setVisible(true);
			
			tempKeyHandler++;
			
			//Highscore
			try {
				
				OutputStream write = new FileOutputStream( HighScoreFile.highscoreFile );
				
				String tempHighscore = Integer.toString( Var.highscorenew );
				
				try {
					write.write( tempHighscore.getBytes() );
					
					write.close();
				} catch (IOException r) {
					r.printStackTrace();
				}
				
				
			} catch (FileNotFoundException s) {
				s.printStackTrace();
			}
			
			//Placement of food
			for (int i = 0; i <= 4; i++) {
				Var.mouseY[i] = 20 + temp1;
				Var.mouseX[i] = 2020 + temp1;
				
				temp1 += 160;
			}
			
			temp1 = 0;
			
			Var.ratY[0] = 330;
			Var.ratY[1] = 660;
			Var.ratX[0] = 2920;
			Var.ratX[1] = 3420;
			
			Var.squirrelX = 7920;
			Var.squirrelY = 375;
			
			//Placement of rockets
			
			for (int i = 0; i <= 4; i++) {
				
				Var.rocketX[i] = 0;
				
			}
			
			for (int i = 0; i <= 9; i++) {
				Var.rocketX[i] = 2020 + temp2;
				
				temp2 += 105;
			}
			temp2 = 0;
			
			
			Var.food = 0;
			Var.health = Var.maxhealth;
			Var.loosed = false;
			Var.lvl = 1;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = false;
		}
		
	}
	
}
