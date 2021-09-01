package com.example.springSample.service;

import com.example.springSample.model.Show;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShowService {

    public List<Show> getShows(String userId){
        List<Show> userShows = new ArrayList<>();
        Show show1 = new Show("Brooklyn 99", "TV Series", 3, 2);
        Show show2 = new Show("Addicted", "TV Series", 1, 5);
        Show show3 = new Show("Gumball", "TV Series", 4, 20);

        userShows.add(show1);
        userShows.add(show2);
        userShows.add(show3);
        return userShows;
    }
}
