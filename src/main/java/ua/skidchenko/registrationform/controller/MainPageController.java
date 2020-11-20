package ua.skidchenko.registrationform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.skidchenko.registrationform.dto.UserDTO;
import ua.skidchenko.registrationform.services.UserServiceImpl;

@Controller
@RequestMapping("/")
public class MainPageController {

    final
    UserServiceImpl userService;

    public MainPageController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String main() {
        return "mainPage";
    }

    @GetMapping("/new-user")
    public String userRegister() {
        return "userRegisterPage";
    }

    @PostMapping("/new-user-create")
    public String userRegistered(UserDTO userDTO) {
             userService.printUserDTO(userDTO);
        return "userRegisterPage";
    }
}
