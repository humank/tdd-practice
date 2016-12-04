package solid.kim.steps.budgets;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import solid.kim.domains.budgets.Budget;
import solid.kim.domains.budgets.BudgetBook;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by yikai on 2016/12/3.
 */
public class BudgetAddStepDefs {

    Budget budget;
    BudgetBook book = new BudgetBook();

    @When("^Add budget (\\d+) for \"([^\"]*)\"$")
    public void add_budget_for(int amount, String month) throws Throwable {

        budget = book.planningIncome(month,amount);
    }

    @Then("^exists budget (\\d+) for \"([^\"]*)\"$")
    public void exists_budget_for(int amount, String month) throws Throwable {

        Budget budgeted = book.lookupBudget(month);
        assertEquals(amount, budget.getAmount());
    }

}
