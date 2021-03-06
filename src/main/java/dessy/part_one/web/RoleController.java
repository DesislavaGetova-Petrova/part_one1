package dessy.part_one.web;

import dessy.part_one.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/roles")
public class RoleController {
    private final UserService userService;

    public RoleController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public String addRole(Model model){
        model.addAttribute("names",userService.findAllUserNames());
        return "role-add";
    }
    @PostMapping("/add")
    public String addCofirm(@RequestParam String username,
                            @RequestParam String role){
        userService.changeRole(username,role);
        return "redirect:/";
    }

}
