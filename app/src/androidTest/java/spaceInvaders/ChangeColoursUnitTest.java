package spaceInvaders;


import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import android.content.Intent;


import spaceInvaders.Activities.MayorActivity;

import static org.junit.Assert.*;

public class ChangeColoursUnitTest extends AppCompatActivity {

    private String before;
    private String after;
    private boolean colours;
    private MayorActivity activity;


    @Before
    public void Iniciar(){

        activity = new MayorActivity();
        Intent mayor = new Intent(activity, activity.getClass());
        startActivity(mayor);
    }

    @Test
    public void actualizar() {
        assertNotNull(activity.getSpaceInvadersJuego().getAliens());
        before= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();
        activity.getSpaceInvadersJuego().getAliens().get(0).cambiarColorRandom();
        after= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();
        finish();
    }

    @Test
    public void actualizarColor() {
        colours= areSame(before,after);
        assertTrue(colours);
    }

    /*@Test
    public void changeColoursAlienTest(){
        colours=false;

        Intent mayor = new Intent(activity, activity.getClass());
        startActivity(mayor);

        before= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();
        activity.getSpaceInvadersJuego().getAliens().get(0).cambiarColorRandom();
        after= activity.getSpaceInvadersJuego().getAliens().get(0).getColor();

        finish();

        colours= areSame(before,after);


        assertTrue(colours);

    }*/

    @Test
    public void changeColoursNaveTest(){
        activity = new MayorActivity();
        colours=false;

        Intent mayor = new Intent(activity, activity.getClass());
        startActivity(mayor);

        before= activity.getSpaceInvadersJuego().getNave().getColor();
        activity.getSpaceInvadersJuego().getNave().colorRandomNave();
        after= activity.getSpaceInvadersJuego().getNave().getColor();
        colours= areSame(before,after);

        finish();

        assertTrue(colours);

    }

    public boolean areSame(String colour1, String colour2){
        return !colour1.equals(colour2);
    }

}