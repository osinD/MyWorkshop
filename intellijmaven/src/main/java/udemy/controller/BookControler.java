package udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import udemy.construct.Book;

@Controller
@RestController
@RequestMapping("/books")
public class BookControler {

    public String hello(){
        return "{hello: World}";
    }

    @RequestMapping("/helloBook")
    @ResponseBody
    public Book helloBook(){

        return	new	Book(1L,"9788324631766","brce","eckel","helion","IT");


    }

    @RequestMapping("/yo")
    @ResponseBody
    public String yo(){
        return "jazda";
    }
}
