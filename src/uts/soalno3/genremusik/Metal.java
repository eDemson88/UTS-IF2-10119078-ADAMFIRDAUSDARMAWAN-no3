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
public class Metal implements HeavyMetal{

    public void genreMetal(String artistName){
        
    }
    
    public void genreGrunge(String artisName){
        
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
         System.out.println(artistName + " adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
}
