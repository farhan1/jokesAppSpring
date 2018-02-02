package idrisf.jokes.app.controllers;

import idrisf.jokes.app.services.ChuckNorrisJokesServivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokesController {

    ChuckNorrisJokesServivce chuckNorrisJokesServivce;

    @Autowired
    public ChuckNorrisJokesController(ChuckNorrisJokesServivce chuckNorrisJokesServivce) {
        this.chuckNorrisJokesServivce = chuckNorrisJokesServivce;
    }

    @RequestMapping({"/", ""})
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokesServivce.gerRandomQuote());
        return "jokeView";
    }

}
