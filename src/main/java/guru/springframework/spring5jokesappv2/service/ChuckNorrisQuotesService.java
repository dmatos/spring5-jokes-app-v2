package guru.springframework.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService extends ChuckNorrisQuotes implements QuotesService{
    @Override
    public String getQuote() {
        return getRandomQuote();
    }
}
