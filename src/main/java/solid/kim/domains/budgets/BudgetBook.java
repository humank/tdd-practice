package solid.kim.domains.budgets;

import org.springframework.beans.factory.annotation.Autowired;
import solid.kim.persistence.BudgetEntity;
import solid.kim.persistence.BudgetRepository;

/**
 * Created by yikai on 2016/12/3.
 */
public class BudgetBook {

    @Autowired
    private BudgetRepository repository;

    public Budget lookupBudget(String month) {

        Budget lookuped = repository.findByMonth(month);

        return lookuped;

    }

    public void acceptBudgetPlan(Budget budget){

    }

    public void planningIncome(Budget budget) {

        repository.save(new BudgetEntity(budget));
    }
}
