package lk.springboot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String firstPage(Model model){
model.addAttribute("sample", "Value");
        return "sample/sample";
    }
}
