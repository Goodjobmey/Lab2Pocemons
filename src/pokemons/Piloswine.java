package pokemons;

import moves.Piloswine.Amnesia;
import moves.Swinub.MudSlap;
import moves.Swinub.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Pokemon {
    public Piloswine(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        setStats(100, 100, 80, 60, 60, 50);

        RockSlide rockSlide = new RockSlide(75, 90);
        MudSlap mudSlap = new MudSlap(20, 100);
        Amnesia amnesia = new Amnesia(0, 0);

        setMove(rockSlide, mudSlap, amnesia);
    }
}