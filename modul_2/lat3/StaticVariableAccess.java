/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_2.lat3;

/**
 *
 * @author Eza
 */
public class StaticVariableAccess {
    public static void main(String[] args) {
        StaticVariable.akreditasi = 'B';
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
    } 
}
