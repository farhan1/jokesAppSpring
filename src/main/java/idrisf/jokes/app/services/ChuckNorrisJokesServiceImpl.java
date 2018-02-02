package idrisf.jokes.app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesServiceImpl implements ChuckNorrisJokesServivce {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String gerRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
