package joshi.spacecats.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import joshi.spacecats.main.ActionHandler;
import joshi.spacecats.main.KeyHandler;
import joshi.spacecats.main.Var;

public class Gui {
	
	public Gui() {
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setVisible(true);
		Var.jf1.setLayout(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.setTitle("Space Cats");
		Var.jf1.setResizable(false);
		Var.jf1.requestFocus();
		
		Var.lbl1 = new Label();
		Var.lbl1.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1);
		
		Var.btnresume = new JButton();
		Var.btnresume.setText("Resume");
		Var.btnresume.setBounds(550, 200, 725, 50);
		Var.btnresume.setVisible(false);
		Var.btnresume.addActionListener(new ActionHandler());
		Var.btnresume.setBackground(Color.BLACK);
		Var.btnresume.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnresume.setForeground(Color.WHITE);
		Var.btnresume.setBorder(null);
		Var.btnresume.setFocusPainted(false);
		Var.btnresume.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnresume.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnresume.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnresume);
		
		
		Var.btnshop = new JButton();
		Var.btnshop.setText("Shop");
		Var.btnshop.setBounds(550, 350, 725, 50);
		Var.btnshop.setVisible(false);
		Var.btnshop.addActionListener(new ActionHandler());
		Var.btnshop.setBackground(Color.BLACK);
		Var.btnshop.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnshop.setForeground(Color.WHITE);
		Var.btnshop.setBorder(null);
		Var.btnshop.setFocusPainted(false);
		Var.btnshop.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnshop.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnshop.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnshop);
		
		
		Var.btnexit = new JButton();
		Var.btnexit.setText("Exit");
		Var.btnexit.setBounds(550, 650, 725, 50);
		Var.btnexit.setVisible(false);
		Var.btnexit.addActionListener(new ActionHandler());
		Var.btnexit.setBackground(Color.BLACK);
		Var.btnexit.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnexit.setForeground(Color.WHITE);
		Var.btnexit.setBorder(null);
		Var.btnexit.setFocusPainted(false);
		Var.btnexit.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnexit.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnexit.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnexit);
		
		
		Var.btnoptions = new JButton();
		Var.btnoptions.setText("Options");
		Var.btnoptions.setBounds(550, 500, 725, 50);
		Var.btnoptions.setVisible(false);
		Var.btnoptions.addActionListener(new ActionHandler());
		Var.btnoptions.setBackground(Color.BLACK);
		Var.btnoptions.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnoptions.setForeground(Color.WHITE);
		Var.btnoptions.setBorder(null);
		Var.btnoptions.setFocusPainted(false);
		Var.btnoptions.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnoptions.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnoptions.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnoptions);
		
		
		Var.btnback = new JButton();
		Var.btnback.setText("<= Back");
		Var.btnback.setBounds(300, 700, 250, 50);
		Var.btnback.setVisible(false);
		Var.btnback.addActionListener(new ActionHandler());
		Var.btnback.setBackground(Color.BLACK);
		Var.btnback.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnback.setForeground(Color.WHITE);
		Var.btnback.setBorder(null);
		Var.btnback.setFocusPainted(false);
		Var.btnback.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnback.setForeground(new Color(205, 000, 000));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnback.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnback);
		
		
		Var.btncredits = new JButton();
		Var.btncredits.setText("Credits :)");
		Var.btncredits.setBounds(1500, 70, 200, 50);
		Var.btncredits.setVisible(false);
		Var.btncredits.addActionListener(new ActionHandler());
		Var.btncredits.setBackground(Color.BLACK);
		Var.btncredits.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btncredits.setForeground(Color.YELLOW);
		Var.btncredits.setBorder(null);
		Var.btncredits.setFocusPainted(false);
		Var.btncredits.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btncredits.setForeground(new Color(255, 140, 000));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btncredits.setForeground(Color.YELLOW);
			}
		});
		Var.jf1.add(Var.btncredits);
		
		
		Var.btnhealth = new JButton();
		Var.btnhealth.setText("Health +1");
		Var.btnhealth.setBounds(550, 500, 725, 50);
		Var.btnhealth.setVisible(false);
		Var.btnhealth.addActionListener(new ActionHandler());
		Var.btnhealth.setBackground(Color.BLACK);
		Var.btnhealth.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnhealth.setForeground(Color.WHITE);
		Var.btnhealth.setBorder(null);
		Var.btnhealth.setFocusPainted(false);
		Var.btnhealth.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnhealth.setForeground(new Color(034, 139, 034));
				
				if (Var.health == Var.maxhealth || Var.food < 10) {
					Var.btnhealth.setForeground(new Color(205, 000, 000));
					Var.btnhealth.setText("X");
				}
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnhealth.setForeground(Color.WHITE);
				
				Var.btnhealth.setText("Health +1");
			}
		});
		Var.jf1.add(Var.btnhealth);
		
		
		Var.btnskin = new JButton();
		Var.btnskin.setText("Change Skin");
		Var.btnskin.setBounds(550, 500, 725, 50);
		Var.btnskin.setVisible(false);
		Var.btnskin.addActionListener(new ActionHandler());
		Var.btnskin.setBackground(Color.BLACK);
		Var.btnskin.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btnskin.setForeground(Color.WHITE);
		Var.btnskin.setBorder(null);
		Var.btnskin.setFocusPainted(false);
		Var.btnskin.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnskin.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btnskin.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btnskin);
		
		
		Var.btntextures = new JButton();
		Var.btntextures.setText("View Textures");
		Var.btntextures.setBounds(550, 350, 725, 50);
		Var.btntextures.setVisible(false);
		Var.btntextures.addActionListener(new ActionHandler());
		Var.btntextures.setBackground(Color.BLACK);
		Var.btntextures.setFont(new Font("Arial", Font.BOLD, 40));
		Var.btntextures.setForeground(Color.WHITE);
		Var.btntextures.setBorder(null);
		Var.btntextures.setFocusPainted(false);
		Var.btntextures.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btntextures.setForeground(new Color(034, 139, 034));
			}
			
			public void mouseExited(MouseEvent evt) {
				Var.btntextures.setForeground(Color.WHITE);
			}
		});
		Var.jf1.add(Var.btntextures);
		
	}
	
}
