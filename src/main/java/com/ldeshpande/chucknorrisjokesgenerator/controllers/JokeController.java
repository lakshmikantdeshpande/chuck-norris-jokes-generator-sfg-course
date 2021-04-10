package com.ldeshpande.chucknorrisjokesgenerator.controllers;

import com.ldeshpande.chucknorrisjokesgenerator.services.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class JokeController {

    private final JokeService jokeService;

    @GetMapping("/")
    public String getJoke(Model model) {
        String randomJoke = jokeService.getRandomJoke();
        model.addAttribute("joke", randomJoke);
        return "index";
    }
}
