package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HashmatN at 3:11 PM on Sep 13, 2021
 */
@Controller
public class JokerController {

  private final JokeService jokeService;

  public JokerController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {
     model.addAttribute("joke", jokeService.getJoke());

     return "index";
  }
}
