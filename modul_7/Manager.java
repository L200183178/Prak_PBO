/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_7;

/**
 *
 * @author Eza
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    private float gajiManager;

    public float getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }

    public float getGajiManager() {
        return getGaji() * 2;
    }

    public void setGajiManager(float gajiManager) {
        this.gajiManager = gajiManager;
    }
}