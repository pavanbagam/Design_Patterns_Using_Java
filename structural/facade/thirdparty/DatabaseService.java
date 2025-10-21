package structural.facade.thirdparty;
// Everything added to this package is dummy and simulates the presence
// of a third-party library we want to re-use as mentioned in the video
public class DatabaseService {

    public User getUser(String userId) {
        return new User("A1", "Geekific", 1000, "USD", "123456LNS");
    }

}

