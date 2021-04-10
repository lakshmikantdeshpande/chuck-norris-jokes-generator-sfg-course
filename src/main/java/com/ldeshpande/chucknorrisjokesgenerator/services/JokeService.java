package com.ldeshpande.chucknorrisjokesgenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public String getRandomJoke() {
        log.info("Fetching a random joke");
        return chuckNorrisQuotes.getRandomQuote();
    }
}
