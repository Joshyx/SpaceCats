package joshi.spacecats.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ActionHandler implements ActionListener {

    private PlaySound sound;

    static File skinFile = new File("src/main/resources/skin.txt");

    @Override
    public void actionPerformed(ActionEvent e) {

        sound = new PlaySound();
        sound.load();

        if (e.getSource() == Var.btnresume) {

            sound.play(PlaySound.click);

            Var.inGame = true;
            Var.inMenu = false;
            Var.inShop = false;
            Var.inOptions = false;

            Var.btnresume.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnoptions.setVisible(false);
            Var.btnexit.setVisible(false);
            Var.btnback.setVisible(false);
            Var.btncredits.setVisible(false);
            KeyHandler.tempKeyHandler = 0;
            Update.tempUpdate = 0;

            Var.jf1.requestFocus();

        } else if (e.getSource() == Var.btnshop) {

            sound.play(PlaySound.click);

            Var.inGame = false;
            Var.inMenu = false;
            Var.inShop = true;
            Var.inOptions = false;

            Var.btnresume.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnoptions.setVisible(false);
            Var.btnexit.setVisible(false);
            Var.btnback.setVisible(true);
            Var.btnhealth.setVisible(true);
            Var.btncredits.setVisible(false);

            Var.btnback.requestFocus();
            Var.btnhealth.requestFocus();

            KeyHandler.tempKeyHandler = 1;

        } else if (e.getSource() == Var.btnexit) {
            sound.play(PlaySound.stop);

            System.exit(0);
        } else if (e.getSource() == Var.btnoptions) {

            sound.play(PlaySound.click);

            Var.inGame = false;
            Var.inMenu = false;
            Var.inShop = false;
            Var.inOptions = true;

            Var.btnresume.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnoptions.setVisible(false);
            Var.btnexit.setVisible(false);
            Var.btnback.setVisible(true);
            Var.btnskin.setVisible(true);
            Var.btncredits.setVisible(false);
            Var.btntextures.setVisible(true);

            Var.btnback.requestFocus();
            Var.btnskin.requestFocus();
            Var.btntextures.requestFocus();

            KeyHandler.tempKeyHandler = 1;

        } else if (e.getSource() == Var.btnback) {

            sound.play(PlaySound.click);

            Var.inGame = false;
            Var.inMenu = true;
            Var.inShop = false;
            Var.inOptions = false;
            Var.inCredits = false;
            Var.inTextures = false;

            Var.btnresume.setVisible(true);
            Var.btnshop.setVisible(true);
            Var.btnoptions.setVisible(true);
            Var.btnexit.setVisible(true);
            Var.btnback.setVisible(false);
            Var.btnhealth.setVisible(false);
            Var.btnskin.setVisible(false);
            Var.btncredits.setVisible(true);
            Var.btntextures.setVisible(false);

            Var.btnoptions.requestFocus();
            Var.btnshop.requestFocus();
            Var.btnexit.requestFocus();
            Var.btnresume.requestFocus();
            Var.btncredits.requestFocus();

            KeyHandler.tempKeyHandler = 1;

        } else if (e.getSource() == Var.btnhealth) {

            if (Var.health < Var.maxhealth && Var.food >= 10) {

                Var.health++;
                Var.food -= 10;

            } else {
                Var.btnhealth.setText(":-(");
            }

        } else if (e.getSource() == Var.btnskin) {

            try {

                String skinInput = javax.swing.JOptionPane.showInputDialog("Bitte nenne deinen Skin:");

                switch (skinInput.toUpperCase()) {
                    case "T-REX":
                        Main.skin = "src/main/resources/trex.png";
                        break;
                    case "LOCKE":
                        Main.skin = "src/main/resources/locke.png";
                        break;
                    case "FOGL":
                        Main.skin = "src/main/resources/fogl.png";
                        break;
                    case "LUCY":
                        Main.skin = "src/main/resources/lucy.png";
                        break;
                    default:
                        Main.skin = "src/main/resources/lucy.png";
                        System.out.println("Es gibt keinen Skin '" + skinInput + "'. Bitte benutze einen anderen.");
                        System.out.println("Möglich sind:");
                        System.out.println("Locke, T-Rex, Lilli, Leni, Lucy");
                        break;
                }

                OutputStream write = new FileOutputStream(skinFile);

                try {
                    write.write(Main.skin.getBytes());

                    write.close();
                } catch (IOException r) {
                    r.printStackTrace();
                }


            } catch (FileNotFoundException s) {
                s.printStackTrace();
            }

            Var.jf1.requestFocus();
            Var.lbl1.requestFocus();

        } else if (e.getSource() == Var.btncredits) {

            sound.play(PlaySound.click);

            Var.inGame = false;
            Var.inMenu = false;
            Var.inShop = false;
            Var.inOptions = false;
            Var.inCredits = true;

            Var.btnresume.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnoptions.setVisible(false);
            Var.btnexit.setVisible(false);
            Var.btnback.setVisible(true);
            Var.btnhealth.setVisible(false);
            Var.btnskin.setVisible(false);
            Var.btncredits.setVisible(false);

            Var.btnback.requestFocus();

            KeyHandler.tempKeyHandler = 1;

        } else if (e.getSource() == Var.btntextures) {

            sound.play(PlaySound.click);

            Var.inGame = false;
            Var.inMenu = false;
            Var.inShop = false;
            Var.inOptions = false;
            Var.inCredits = false;
            Var.inTextures = true;

            Var.btnresume.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnoptions.setVisible(false);
            Var.btnexit.setVisible(false);
            Var.btnhealth.setVisible(false);
            Var.btnskin.setVisible(false);
            Var.btncredits.setVisible(false);
            Var.btntextures.setVisible(false);

            KeyHandler.tempKeyHandler = 1;

        }

    }

}
