/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.soalno3.genremusik;

/**
 *
 * @author ryzen
 */
public class HardRock implements PopRock,ProgressiveRock,PsychedelicRock{
    

    public void genreHardRock(String artistName){
    }
    
    @Override
    public void genrePopRock(String artistName){
        System.out.println(artistName + " adalah musisi Pop Rock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName){
        System.out.println(artistName + " adalah musisi Progressive Rock");
    }
    
    @Override
    public void genrePsychedelicRock(String artistName){
        System.out.println(artistName + " adalah musisi Psychedelic Rock");
    }
}
