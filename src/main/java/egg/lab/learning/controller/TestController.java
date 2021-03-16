package egg.lab.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Basic Controller for testing only
 */
@Controller
public class TestController {

    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }
}
