package mycontroller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class TemplateController {
@GetMapping("/ExampleTwo")
    public String template(Model model){
    String message = "Top 5 CLoud Service Providers";

    List<String> list = new ArrayList<>();
    list.add("Amazon web services");
    list.add("Microsoft Axure");
    list.add("Google CLoud");
    list.add("Alibaba Cloud");
    list.add("IBM CLoud");

    model.addAttribute("message", message);
    model.addAttribute("cloudProvider", list);

    return "DemoPage";
}
}
