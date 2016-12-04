package solid.kim.persistence;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import solid.kim.domains.budgets.Budget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yikai on 2016/12/4.
 */

@Data
@Entity
public class BudgetEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String month;
    private double amount;

    public BudgetEntity() {
    }

    public BudgetEntity(Budget budget){
        BeanUtils.copyProperties(budget,this);
    }
}
