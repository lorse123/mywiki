package com.example.zaff.controller;

import com.example.zaff.model.WikiPage;
import com.example.zaff.repository.WikiPageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WikiController {

    @Autowired
    private WikiPageRepository wikiPageRepository;

    // public WikiController(WikiPageRepository wikiPageRepository) {
    //     this.wikiPageRepository = wikiPageRepository;
    // }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pages", wikiPageRepository.findAll());
        return "index";
    }

    @GetMapping("/page/{id}")
    public String viewPage(@PathVariable Long id, Model model) {
        WikiPage page = wikiPageRepository.findTop1ById(id);
        model.addAttribute("page", page);
    //jkjjkjkjjkkjk
      return "view";
    }
}