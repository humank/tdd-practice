package solid.kim.persistence;

import org.springframework.data.repository.CrudRepository;
import solid.kim.domains.budgets.Budget;

/**
 * Created by yikai on 2016/12/4.
 */
public interface BudgetRepository extends CrudRepository<BudgetEntity, Long> {

    Budget findByMonth(String month);
}
