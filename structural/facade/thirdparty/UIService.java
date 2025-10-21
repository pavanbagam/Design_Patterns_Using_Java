package structural.facade.thirdparty;
// Everything added to this package is dummy and simulates the presence
// of a third-party library we want to re-use as mentioned in the video
public class UIService {

    public static String getLoggedInUserId() {
        return "";
    }

    public void logIn(String username, String password) {
        System.out.println("Logging In...");
    }

    public void logout() {
        System.out.println("Logging Out...");
    }

}

