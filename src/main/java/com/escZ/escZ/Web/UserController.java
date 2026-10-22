package com.escZ.escZ.Web;

import com.escZ.escZ.Model.Binding.UserRegisterBindingModel;
import com.escZ.escZ.Model.Service.UserServiceModel;
import com.escZ.escZ.Model.View.UserViewModel;
import com.escZ.escZ.Service.UserService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel() {
        return new UserRegisterBindingModel();
    }

    @GetMapping("/register")
    public String register(Model model) {

        return "register";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }



    @PostMapping("/register")
    public String doRegister(@Valid @ModelAttribute ("userRegisterBindingModel")
                                 UserRegisterBindingModel userRegisterBindingModel,
                                BindingResult bindingResult,
                                Model model) {


        // Check whether the username is already taken
        if (userService.usernameExists(userRegisterBindingModel.getUsername())) {
            bindingResult.rejectValue(
                    "username",
                    "username.duplicate",
                    "Username is already occupied"
            );
        }

        // Check whether the email is already registered
        if (userService.emailExists(userRegisterBindingModel.getEmail())) {
            bindingResult.rejectValue(
                    "email",
                    "email.duplicate",
                    "Email is already registered"
            );
        }

        // Check whether the passwords match
        if (!userRegisterBindingModel.getPassword()
                .equals(userRegisterBindingModel.getConfirmPassword())) {
            model.addAttribute("passwordMismatch", true);
        }

        if (bindingResult.hasErrors()
                || !userRegisterBindingModel.getPassword()
                .equals(userRegisterBindingModel.getConfirmPassword())) {
            return "register";
        }

        userService.registerUser(
                modelMapper.map(userRegisterBindingModel, UserServiceModel.class)
        );

        return "redirect:/users/login";
    }


    @GetMapping("/profile/{id}")
    private String profile(@PathVariable Long id, Model model) {

        model.addAttribute("user",
                modelMapper.map(userService.findById(id), UserViewModel.class));

        return "view-profile";
    }









}
