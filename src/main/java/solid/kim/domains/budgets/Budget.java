package solid.kim.domains.budgets;

import solid.kim.domains.budgets.stereotypes.Event;

import java.util.List;

/**
 * Created by yikai on 2016/12/3.
 */
public class Budget implements Event {

    /**
     * Consider for the domain object, wihch is produced by event occured,
     * that was a fact , so it should be non-modifiable.
     */

    private final int amount;
    private final String month;

    public Budget(String month, int amount) {
        this.month = month;
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    public Budget budgetCreateEvent(String month, int amount){
        return new Budget(month, amount);
    }
}