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
    private String beforeNave;
    private String afterNave;
    private boolean colours;
    private boolean coloursNave;
    private MayorActivity activity;


    @Before
    public void iniciar(){
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
    }

    @Test
    public void actualizarColor() {
        colours= areSame(before,after);
        assertTrue(colours);
    }




    @Test
    public void actualizarNave() {
        assertNotNull(activity.getSpaceInvadersJuego().getNave());
        beforeNave= activity.getSpaceInvadersJuego().getNave().getColor();
        activity.getSpaceInvadersJuego().getNave().colorRandomNave();
        afterNave= activity.getSpaceInvadersJuego().getNave().getColor();
    }

    @Test
    public void actualizarColorNave() {
        coloursNave= areSame(beforeNave,afterNave);
        assertTrue(coloursNave);
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

    /*@Test
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

    }*/

    public boolean areSame(String colour1, String colour2){
        return !colour1.equals(colour2);
    }

}
