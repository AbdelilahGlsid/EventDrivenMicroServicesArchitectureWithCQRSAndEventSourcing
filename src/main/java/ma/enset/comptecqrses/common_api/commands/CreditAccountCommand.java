package ma.enset.comptecqrses.common_api.commands;

public class CreditAccountCommand extends BaseCommand<String>{
    private double amout;
    private String currency;
    public CreditAccountCommand(String id, double amout, String currency) {
        super(id);
        this.amout = amout;
        this.currency = currency;
    }
}
