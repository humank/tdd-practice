import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kim on 2016/11/28.
 */


@ComponentScan("solid.kim.*")
@EnableAutoConfiguration
@RestController
public class TddPracticeRootApplication {

    @RequestMapping("/")
    String home(){
        return " Hello TDD Fans ! ";
    }

    public static void main(String[] args){
        SpringApplication.run(TddPracticeRootApplication.class, args);
    }

}
