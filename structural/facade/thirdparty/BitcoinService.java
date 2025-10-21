package structural.facade.thirdparty;
// Everything added to this package is dummy and simulates the presence
// of a third-party library we want to re-use as mentioned in the video
public class BitcoinService extends CryptoService {

    @Override
    public void buyCurrency(User user, double amount) {
        System.out.println("Buying " + amount + " of Bitcoin...");
    }

}

