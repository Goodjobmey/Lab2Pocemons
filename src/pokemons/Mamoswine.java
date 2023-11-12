package pokemons;

import moves.Mamoswine.Confide;
import moves.Piloswine.Amnesia;
import moves.Swinub.MudSlap;
import moves.Swinub.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Pokemon {
    public Mamoswine(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        setStats(110,130,80,70,60,80);

        RockSlide rockSlide = new RockSlide(75, 90);
        MudSlap mudSlap = new MudSlap(20, 100);
        Amnesia amnesia = new Amnesia(0, 0);
        Confide confide = new Confide(0,0);

        setMove(rockSlide, mudSlap, amnesia, confide);
    }
}

