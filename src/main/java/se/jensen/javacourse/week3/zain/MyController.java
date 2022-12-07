package se.jensen.javacourse.week3.zain;


import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {


    @GetMapping("/author/name")
    public String getname(){
        return "Zain";
    }


  @GetMapping("/person")
  public Person getPerson(){
      Person person = new Person(2, "Zain", "b")    ;
      return person;
  }

  @GetMapping ("/square-number/3")
    public int gg(){
        int a = 3;
        int b = 3;
        int c = a * b;
        return c;

  }
    }









