package util;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Mamoswine mamoswine = new Mamoswine("Rosia", 1);
        Cobalion cobalion = new Cobalion("Troi", 1);
        Joltik joltik = new Joltik("Leo", 1);
        Galvantula galvantula = new Galvantula("Khina", 1);
        Swinub swinub = new Swinub("Nat", 1);
        Piloswine piloswine = new Piloswine("Zen", 1);

        b.addAlly(mamoswine);
        b.addAlly(cobalion);
        b.addAlly(swinub);

        b.addFoe(joltik);
        b.addFoe(galvantula);
        b.addFoe(piloswine);

        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}