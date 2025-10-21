package behavioral.visitor.models;
import behavioral.visitor.Visitor;
// import lombok.Getter;

// @Getter
public class Restaurant extends Client {

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    public boolean isAvailableAbroad() {
        return availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

