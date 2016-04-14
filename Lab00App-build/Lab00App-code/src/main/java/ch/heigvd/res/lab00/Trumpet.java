/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author kilian
 */
public class Trumpet implements IInstrument {
    
    private String sound;
    private String color;
    private int trumpetVolume;
    
    public Trumpet() {
        this.sound = "pouet";
        this. color = "golden";
        this.trumpetVolume = 10;
    }
    
    public String play() {
        return sound; 
    }
    
    public int getSoundVolume() {
        return trumpetVolume; 
    }
    
    public String getColor() {
        return color; 
    }
    
}
