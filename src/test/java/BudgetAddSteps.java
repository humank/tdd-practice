import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by yikai on 2016/11/29.
 */
public class BudgetAddSteps {

    @When("^Add budget (\\d+) for \"([^\"]*)\"$")
    public void add_budget_for(int amount, String month) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^exists budget (\\d+) for \"([^\"]*)\"$")
    public void exists_budget_for(int amount, String month) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
