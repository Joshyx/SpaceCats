package joshi.spacecats.main;

public class Update {
    public static int tempUpdate = 0;

    public void update() {
        if (Var.inMenu) {
            if (tempUpdate == 0) {
                Var.btnresume.requestFocus();
                Var.btnoptions.requestFocus();
                Var.btnshop.requestFocus();
                Var.btnexit.requestFocus();
                Var.btncredits.requestFocus();
                tempUpdate++;
            } else if (tempUpdate == 1) {
                Var.jf1.requestFocus();
            }
        }
    }

}
