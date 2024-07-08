package Poc;

import Att.Ph.Leaf_Blade;
import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Gloom {

    public Bellossom() {
        setType(Type.GRASS);
        setStats(75, 80, 95,90,100,50);
        addMove(new Leaf_Blade());
    }
}
