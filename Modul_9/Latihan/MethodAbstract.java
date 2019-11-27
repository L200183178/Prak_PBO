/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Eza
 */
public abstract class MethodAbstract {
    public abstract int luas();
    public abstract int keliling();
    
    public int getLuas(){
        return luas();
    }
    
    public int getKell(){
        return keliling();
    }
}