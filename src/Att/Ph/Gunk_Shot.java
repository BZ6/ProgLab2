package Att.Ph;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gunk_Shot extends PhysicalMove {
    public Gunk_Shot() {
        super(Type.POISON, 120, 0.8);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.POISON) && !pokemon.hasType(Type.STEEL) && Math.random() < 0.3) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Gunk Shot";
    }
}
