package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.common.APIResponse;
import com.db.grad.javaapi.common.JwtUtils;
import com.db.grad.javaapi.dto.LoginRequestDTO;
import com.db.grad.javaapi.dto.SignUpRequestDTO;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/signUp")
    public APIResponse signUp(SignUpRequestDTO signUpRequestDTO) {
        APIResponse apiResponse = new APIResponse();

        // validation

        // dto to entity
        User userEntity = new User();
        userEntity.setName(signUpRequestDTO.getName());
        userEntity.setEmail(signUpRequestDTO.getEmailId());

        // store entity
        userEntity = userRepository.save(userEntity);

        // generate jwt
        String token = jwtUtils.generateJwt(userEntity);

        Map<String, Object> data = new HashMap<>();
        data.put("accessToken", token);

        apiResponse.setData(data);

        // return
        return apiResponse;
    }
    @PostMapping("/login")
    public APIResponse login(LoginRequestDTO loginRequestDTO) {

        APIResponse apiResponse = new APIResponse();

        // validation

        // verify user exist with given email and password
        User user = userRepository.findOneByEmailIgnoreCase(loginRequestDTO.getEmailId());

        // response
        if (user == null) {
            apiResponse.setData("User login failed");
            return apiResponse;
        }

        // generate jwt
        String token = jwtUtils.generateJwt(user);

        Map<String, Object> data = new HashMap<>();
        data.put("accessToken", token);

        apiResponse.setData(data);

        return apiResponse;
    }
}