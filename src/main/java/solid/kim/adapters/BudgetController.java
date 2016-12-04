package solid.kim.adapters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yikai on 2016/12/4.
 */

@RestController
public class BudgetController {

    @RequestMapping("/")
    public String home(){
        return "hello , newbie ! ";
    }
}
