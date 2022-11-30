package mvcdemo.controller;

import mvcdemo.models.Games;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GamesApiController {
    private static final List<Games> game = new ArrayList<Games>();

    public GamesApiController(){
        game.add(new Games("Action", "God of War Ragnarok", "PlayStation 5", 350.00 ));
        game.add(new Games("Racing", "Forza Horizon", "Xbox Series", 250.00 ));
        game.add(new Games("RPG", "Final Fantasy XVI", "PlayStation 5", 350.00 ));
        game.add(new Games("Sports", "Fifa", "Steam", 300.00 ));
        game.add(new Games("Shooter", "Doom Eternal", "Steam", 60.00 ));
        game.add(new Games("Racing", "Mario Kart 8 Deluxe", "Switch", 300.00 ));
        game.add(new Games("Horror", "Resident Evil 2 Remake", "Xbox Series", 100.00 ));
    }

    @GetMapping
    public List<Games> getGame(){
        return game;
    }
}
