package com.example.springSample.controller;

import com.example.springSample.model.Show;
import com.example.springSample.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/shows/{userId}/show")
    public List<Show> getAllShow(@PathVariable String userId){
        return showService.getShows(userId);
    }
}
