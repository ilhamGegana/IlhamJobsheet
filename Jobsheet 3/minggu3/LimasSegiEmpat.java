/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author DELL
 */
public class LimasSegiEmpat {
    public float luasAlas;
    public float tinggi;
    public float sisiTegak;
    
    public double volumeLimas(){
        return 0.3*luasAlas*tinggi;
    }
    public float LuasPerLimas(){
        return luasAlas+(4*sisiTegak);
    }
}
