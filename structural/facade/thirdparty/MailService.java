package structural.facade.thirdparty;
// Everything added to this package is dummy and simulates the presence
// of a third-party library we want to re-use as mentioned in the video
public class MailService {

    public void sendConfirmationMail(User user) {
        System.out.println("Sending mail to " + user.name());
    }

}
