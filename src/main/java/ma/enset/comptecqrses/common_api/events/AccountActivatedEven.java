package ma.enset.comptecqrses.common_api.events;

import lombok.Getter;
import ma.enset.comptecqrses.common_api.enums.AccountStatus;

public class AccountActivatedEven extends BaseEvent<String>{
    @Getter private AccountStatus status;
    public AccountActivatedEven(String id, AccountStatus accountStatus) {
        super(id);
        this.status = accountStatus;
    }
}
