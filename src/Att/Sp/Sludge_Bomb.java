package Att.Sp;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() {
        super(Type.POISON, 90, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.POISON) && !pokemon.hasType(Type.STEEL) && Math.random() < 0.3) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Sludge Bomb";
    }
}
