package spaceInvaders;

import android.content.Intent;

import org.junit.Test;

import spaceInvaders.Activities.MainActivity;
import spaceInvaders.Activities.MayorActivity;

import static org.junit.Assert.*;

public class ChangeColoursUnitTest {

    private String before;
    private String after;
    private boolean colours;
    MayorActivity activity;


    @Test
    public void changeColoursAlienTest(){
        activity = new MayorActivity();
        colours=false;

        /*Intent mayor = new Intent(new MainActivity(), activity.getClass());
        startActivity(mayor);*/

        before= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();
        activity.getSpaceInvadersJuego().getAliens().get(0).cambiarColorRandom();
        after= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();
        colours= areSame(before,after);


        assertTrue(colours);

    }

    @Test
    public void changeColoursNaveTest(){
        activity = new MayorActivity();
        colours=false;

        /*Intent mayor = new Intent(new MainActivity(), activity.getClass());
        startActivity(mayor);*/

        before= activity.getSpaceInvadersJuego().getNave().getColor();
        activity.getSpaceInvadersJuego().getNave().colorRandomNave();
        after= activity.getSpaceInvadersJuego().getNave().getColor();
        colours= areSame(before,after);

        assertTrue(colours);

    }

    public boolean areSame(String colour1, String colour2){
        return !colour1.equals(colour2);
    }

}
