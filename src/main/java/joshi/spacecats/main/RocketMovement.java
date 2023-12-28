package joshi.spacecats.main;

public class RocketMovement {

    public RocketMovement() {
        int temp = 0, temp2 = 0;

        for (int i = 0; i <= 9; i++) {
            Var.rocketY[i] = 15 + temp;
            Var.rocketX[i] = 2020 + temp2;

            temp += 105;
            temp2 += 220;
        }
    }

    public void execute() {
        if (Var.inGame) {
            for (int i = 0; i <= 9; i++) {

                Var.rocketX[i] -= Var.rocketspeed[i];
                if (Var.rocketX[i] <= -200) {
                    Var.rocketX[i] = 2020;
                }

                Var.pewdsX -= 1;
                if (Var.pewdsX <= -700) {
                    Var.pewdsX = 80000;
                }
            }
        }
    }
}
