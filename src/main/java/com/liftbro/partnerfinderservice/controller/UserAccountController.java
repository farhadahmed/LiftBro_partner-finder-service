package com.liftbro.partnerfinderservice.controller;

import com.liftbro.partnerfinderservice.repositories.UserAccountRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAccountController {
    private final UserAccountRepository userAccountRepository;

    public UserAccountController(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @RequestMapping("/users")
    public String getUserAccounts(Model model) {
        model.addAttribute("users", userAccountRepository.findAll());
        return "users/list";
    }
}
