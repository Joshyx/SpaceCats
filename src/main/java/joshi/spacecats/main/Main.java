package joshi.spacecats.main;

import joshi.spacecats.gui.Gui;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static String skin;

    static String skinInput;

    static File skinFile = new File("src/main/resources/skin.txt");

    public static void main(String[] args) throws IOException {

        PlaySound sound = new PlaySound();
        sound.load();

        if (!skinFile.exists()) {
            skinFile.createNewFile();

            skinInput = javax.swing.JOptionPane.showInputDialog("Bitte nenne deinen Skin:");

            switch (skinInput.toUpperCase()) {
                case "T-REX":
                    skin = "src/main/resources/trex.png";
                    break;
                case "LOCKE":
                    skin = "src/main/resources/locke.png";
                    break;
                case "FOGL":
                    skin = "src/main/resources/fogl.png";
                    break;
                case "LUCY":
                    skin = "src/main/resources/lucy.png";
                    break;
                default:
                    skin = "src/main/resources/lucy.png";
                    System.out.println("Es gibt keinen Skin '" + skinInput + "'. Bitte benutze einen anderen.");
                    System.out.println("Möglich sind:");
                    System.out.println("Locke, T-Rex, Lilli, Leni, Lucy");
                    break;
            }

            OutputStream write = Files.newOutputStream(skinFile.toPath());

            write.write(skin.getBytes());
            write.close();
        }

        Scanner sc = new Scanner(skinFile);
        skin = sc.next();
        sc.close();

        sound.play(PlaySound.start);

        new Gui();
        new Var();
        Background background = new Background();
        PlayerMovement playerMovement = new PlayerMovement();
        RocketMovement rocketMovement = new RocketMovement();
        FoodMovement foodMovement = new FoodMovement();
        RocketCollision rocketCollision = new RocketCollision();
        FoodCollision foodCollision = new FoodCollision();
        Update update = new Update();
        Difficulty difficulty = new Difficulty();
        new Music();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                background.execute();
                playerMovement.execute();
                rocketMovement.execute();
                foodMovement.execute();
                rocketCollision.execute();
                foodCollision.execute();
                update.update();
                difficulty.updateDifficulty();
            }
        }, 0, 10);
    }
}
