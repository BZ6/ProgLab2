package Att.Sp;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Water_Gun extends SpecialMove {
    public Water_Gun() {
        super(Type.WATER, 40, 1);
    }

    @Override
    protected String describe() {
        return "Water Gun";
    }
}
