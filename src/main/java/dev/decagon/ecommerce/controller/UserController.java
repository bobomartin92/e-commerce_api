package dev.decagon.ecommerce.controller;

import dev.decagon.ecommerce.dto.SignInDto;
import dev.decagon.ecommerce.dto.SignInResponseDto;
import dev.decagon.ecommerce.dto.SignUpResponseDto;
import dev.decagon.ecommerce.dto.SignupDto;
import dev.decagon.ecommerce.exceptions.AuthenticationFailException;
import dev.decagon.ecommerce.exceptions.CustomException;
import dev.decagon.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto SignUp(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signin")
    public SignInResponseDto SignIn(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }
}
