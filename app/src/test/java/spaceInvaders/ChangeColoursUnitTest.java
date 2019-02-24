package spaceInvaders;

import android.content.Intent;

import org.junit.Test;

import spaceInvaders.Activities.MainActivity;
import spaceInvaders.Activities.MayorActivity;

import static org.junit.Assert.*;

public class ChangeColoursUnitTest {
    @Test
    public void changeColoursAlienTest(){
        MayorActivity activity = new MayorActivity();

        /*Intent mayor = new Intent(new MainActivity(), activity.getClass());
        startActivity(mayor);*/

        String beforeAlien= activity.getSpaceInvadersJuego().getAliens().get(1).getColor();
        activity.getSpaceInvadersJuego().getAliens().get(1).cambiarColorRandom();
        String afterAlien= activity.getSpaceInvadersJuego().getAliens().get(1).getColor();
        boolean coloursAlien= areSame(beforeAlien,afterAlien);


        assertTrue(coloursAlien);

    }

    @Test
    public void changeColoursNaveTest(){
        MayorActivity activity = new MayorActivity();

        /*Intent mayor = new Intent(new MainActivity(), activity.getClass());
        startActivity(mayor);*/

        String beforeNave= activity.getSpaceInvadersJuego().getNave().getColor();
        activity.getSpaceInvadersJuego().getNave().colorRandomNave();
        String afterNave= activity.getSpaceInvadersJuego().getNave().getColor();
        boolean coloursNave= areSame(beforeNave,afterNave);

        assertTrue(coloursNave);

    }

    public boolean areSame(String colour1, String colour2){
        return !colour1.equals(colour2);
    }

}
