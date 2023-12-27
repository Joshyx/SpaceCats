package joshi.spacecats.main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import joshi.spacecats.gui.Label;

public class Var {

	public static JFrame jf1;
	public static int screenwidth = 1920, screenheight = 1080;
	public static int backgroundX1 = 0, backgroundX2 = 1920, backgroundspeed = 4;
	public static int x = 860, y = 700;
	public static int speedup = 3, speeddown = 3, speedleft = 2, speedright =3;
	public static int food = 0, health = 2, maxhealth = 2;
	
	public static JButton btnresume, btnshop, btnoptions, btnexit, btnback, btncredits, btnhealth, btnskin, btntextures;
	
	public static int rocketX[] = new int[10], rocketY[] = new int[10];
	public static int pewdsX = 80000;
	public static int rocketspeed[] = new int[10];
	public static int mouseX[] = new int[5], mouseY[] = new int[5];
	public static int ratX[] = new int[5], ratY[] = new int[5];
	public static int squirrelX, squirrelY;
	public static int mouseSpeed[] = new int[5], ratSpeed[] = new int[2], squirrelSpeed;
	public static int lvl = 1, highscoreold, highscorenew;
	
	public static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	public static boolean collisioned = false, loosed = false, muted = false;
	public static boolean inGame = true, inMenu = false, inOptions = false, inShop = false, inCredits = false, inTextures = false, inDeathScreen = false;
	
	public static Label lbl1;
	
	public static Image ib1;
	public static Image ib2;
	public static Image icat;
	public static Image irocket;
	public static Image imouse, irat, isquirrel;
	public static Image iheart, ifood;

	Timer skin;
	
	public Var() {

		skin = new Timer();
		
		try {
			//background
			ImageIcon ib1 = new ImageIcon((getClass().getResource("sky1.png")));
			ib1.getImage();
			
			ImageIcon ib2 = new ImageIcon((getClass().getResource("sky1.png")));
			ib2.getImage();
			
			
			//cat
			skin.scheduleAtFixedRate(new TimerTask() {
				
				@Override
				public void run() {
					try {
						ImageIcon icat = new ImageIcon((getClass().getResource(Main.skin)));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}, 0, 15);
			
			
			//rocket
			ImageIcon irocket = new ImageIcon((getClass().getResource("rocked.png")));
			irocket.getImage();
			
			//food
			ImageIcon imouse = new ImageIcon((getClass().getResource("mouse.png")));
			imouse.getImage();
			
			ImageIcon irat = new ImageIcon((getClass().getResource("rat.png")));
			irat.getImage();
			
			ImageIcon isquirrel = new ImageIcon((getClass().getResource("squirrel.png")));
			isquirrel.getImage();
			
			//heart
			ImageIcon ihealt = new ImageIcon((getClass().getResource("health.png")));
			ihealt.getImage();
			
			//food
			ImageIcon ifood = new ImageIcon((getClass().getResource("food.png")));
			ifood.getImage();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Bilder konnten nicht geladen werden.");
		}
		
		Var.rocketspeed[0] = Var.lvl + 5;
		Var.rocketspeed[1] = Var.lvl + 3;
		Var.rocketspeed[2] = Var.lvl + 4;
		Var.rocketspeed[3] = Var.lvl + 3;
		Var.rocketspeed[4] = Var.lvl + 4;
		Var.rocketspeed[5] = Var.lvl + 5;
		Var.rocketspeed[6] = Var.lvl + 3;
		Var.rocketspeed[7] = Var.lvl + 5;
		Var.rocketspeed[8] = Var.lvl + 4;
		Var.rocketspeed[9] = Var.lvl + 5;
		
		Var.mouseSpeed[0] = 2;
		Var.mouseSpeed[1] = 3;
		Var.mouseSpeed[2] = 2;
		Var.mouseSpeed[3] = 4;
		Var.mouseSpeed[4] = 3;
		
		Var.ratSpeed[0] = 4;
		Var.ratSpeed[1] = 5;
		
		Var.squirrelSpeed = 6;

	}

}
