/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author DELL
 */
public class Tabung {
    public float jari2;
    public float tinggi;
    
    public double hitungVolumeTabung(){
        return 3.14*jari2*jari2*tinggi;
    }
    public double hitungLuasPerTabung(){
        return 2*3.14*jari2*(jari2+tinggi);
    }
}
