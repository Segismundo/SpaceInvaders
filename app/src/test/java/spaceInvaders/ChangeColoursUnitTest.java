package spaceInvaders;

import android.content.Intent;

import org.junit.Test;

import spaceInvaders.Activities.MainActivity;
import spaceInvaders.Activities.MayorActivity;

import static org.junit.Assert.*;

public class ChangeColoursUnitTest {
    @Test
    public void changeColoursTest(){
        MayorActivity activity = new MayorActivity();

        /*Intent mayor = new Intent(new MainActivity(), activity.getClass());
        startActivity(mayor);*/

        String before= activity.getSpaceInvadersJuego().getAliens().get(1).getColor();
        activity.getSpaceInvadersJuego().getAliens().get(1).cambiarColorRandom();
        String after= activity.getSpaceInvadersJuego().getAliens().get(1).getColor();
        boolean colours= areSame(before,after);

        assertTrue(colours);

    }

    public boolean areSame(String colour1, String colour2){
        return !colour1.equals(colour2);
    }

}
