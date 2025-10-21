package behavioral.mediator;
public class MainApp {

    /*
     * Video Reference: https://youtu.be/35D5cBosD4c
     */
    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();

    }

}
