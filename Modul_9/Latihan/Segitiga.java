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
public class Segitiga extends MethodAbstract {
    int a = 6;
    int b = 5;
    int t = 4;
    
    public int luas(){
        return a*t/2;
    }
    
    public int keliling(){
        return a+b+b;
    }
    
}