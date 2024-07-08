package Att.Sp;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Mega_Drain extends SpecialMove {
    public Mega_Drain() {
        super(Type.GRASS, 40, 1);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) -(damage / 2));
    }

    @Override
    protected String describe() {
        return "Mega Drain";
    }
}
