package structural.facade.thirdparty;
// Everything added to this package is dummy and simulates the presence
// of a third-party library we want to re-use as mentioned in the video
public abstract class CryptoService {

    private DatabaseService databaseService;
    private SomeComplexStuff complexStuff;

    public abstract void buyCurrency(User user, double amount);

    public static class SomeComplexStuff { }

}

