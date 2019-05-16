package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@@RequestMapping("/dev")
public class DevUserController {
    @RequestMapping("toLogin")
    public String index(){
      return "dev/login";
    }

}
