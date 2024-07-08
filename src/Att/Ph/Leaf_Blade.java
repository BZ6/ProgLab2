package Att.Ph;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Leaf_Blade extends PhysicalMove {
    public Leaf_Blade() {
        super(Type.GRASS, 90, 1);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon1, Pokemon pokemon2) {
        if (3 * pokemon1.getStat(Stat.SPEED) / 512.0 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "Leaf Blade";
    }
}
