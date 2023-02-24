package com.example.bunker.controllers;

import com.example.bunker.model.Hobby;
import com.example.bunker.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHobby {
    @Autowired
    private final HobbyRepository hobbyRepository;

    public ControllerHobby(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    @GetMapping("/hobby")
    Hobby getHobby(){
        return new Hobby(1L, "Aloha");
    }
}
