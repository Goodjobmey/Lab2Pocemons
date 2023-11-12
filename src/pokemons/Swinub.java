package pokemons;

import moves.Swinub.MudSlap;
import moves.Swinub.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        setStats(50, 50, 40, 30, 30, 50);

        RockSlide rockSlide = new RockSlide(75, 90);
        MudSlap mudSlap = new MudSlap(20, 100);

        setMove(rockSlide, mudSlap);
    }
}