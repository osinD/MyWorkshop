package osinski.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	//Controller
    @RequestMapping("/")
    public String helloWorld(){
        return "index";
    }

}
