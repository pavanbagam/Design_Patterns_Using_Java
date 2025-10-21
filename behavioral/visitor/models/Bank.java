package behavioral.visitor.models;
// import lombok.Getter;

import behavioral.visitor.Visitor;

// @Getter
public class Bank extends Client {

    private final int branchesInsured;

    public int getBranchesInsured() {
        return branchesInsured;
    }


    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

