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
public class RnB implements Jazz,Blues {

    @Override
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi Jazz");
    }
    @Override
    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi Blues");
    }
}
