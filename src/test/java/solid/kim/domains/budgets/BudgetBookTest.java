package solid.kim.domains.budgets;

import org.junit.Before;
import org.junit.Test;
import solid.kim.persistence.BudgetRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by yikai on 2016/12/4.
 */
public class BudgetBookTest {

    @Test
    public void add_budget() throws Exception {

        //TODO
        /**
         * please re-think, that what am i testing ?
         * shell i do know the domain object translate to persistent technolology process (method calling) ?
         * which concern point was i focused ?
         */

        //Arrange
        Budget budget = new Budget("2016-12",2000);

        BudgetBook budgetBook = new BudgetBook();

        BudgetRepository repository = mock(BudgetRepository.class);

        //Action
        budgetBook.planningIncome(budget);
        //Assert
        assertEquals(2000,budgetBook.lookupBudget("2016-02").getAmount());
    }

    @Test
    public void lookupBudget() throws Exception {

    }

}