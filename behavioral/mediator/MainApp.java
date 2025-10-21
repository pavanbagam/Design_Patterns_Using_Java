package behavioral.mediator;
public class MainApp {

    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();

    }

}
