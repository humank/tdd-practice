import org.junit.Test;
import solid.kim.adapter.BudgetRepository;
import solid.kim.domain.Budget;

import static org.junit.Assert.assertEquals;

/**
 * Created by kim on 2016/11/25.
 */
public class BudgetTest {


    @Test
    public void add_budget_test(){
        Budget budget = new Budget();
        budget.add();
        BudgetRepository repo = new BudgetRepository();
        assertEquals( 1,repo.counts());


    }
}
