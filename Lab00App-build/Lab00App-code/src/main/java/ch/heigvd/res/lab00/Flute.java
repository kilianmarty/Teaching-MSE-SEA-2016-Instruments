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
public class Flute implements IInstrument{
    
    private int fluteVolume;
    private String sound;
    private String color;
    
    
    public Flute() {
        this.fluteVolume = 5;
        this.sound = "pouet";
        this. color = "golden";
    }
    
    @Override
    public String play() {
        return sound; 
    }
    
    @Override
    public int getSoundVolume() {
        return fluteVolume; 
    }
    
    @Override
    public String getColor() {
        return color; 
    }
    
}
