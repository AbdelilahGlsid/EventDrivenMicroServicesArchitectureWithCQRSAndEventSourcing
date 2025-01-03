package ma.enset.comptecqrses.common_api.events;

import lombok.Getter;

public class AccountCreatedEven extends BaseEvent<String>{
    @Getter private double initialBalance;
    @Getter private String currency;
    public AccountCreatedEven(String id, double initialBalance, String currency) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }
}
