/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author user
 */
public class Rumus {
    double celcius;
    double reamur;
    double kelvin;
    double fahrenheit;
    
    Rumus(int celcius){
        this.celcius=celcius;
        this.reamur=this.rumusReamur();
        this.kelvin=this.rumusKelvin();
        this.fahrenheit=this.rumusFahrenheit();
        
    }
    
    public double rumusReamur(){
        return (double)(celcius*4/5);
    }
    
    public double rumusKelvin(){
        return (double)(celcius+273.15);
    }
     
    public double rumusFahrenheit(){
        return (double)((celcius*9/5)+32);
    }
    
    public void cetak(){
        System.out.println(" ");
        System.out.println("Suhu Dalam Celsius : " + this.celcius + "°C"); 
        System.out.println("Dalam Fahrenheit  : " + this.fahrenheit + "°F"); 
        System.out.println("Dalam Reamur      : " + this.reamur+ "°R");    
        System.out.println("Dalam Kelvin      : " + this.kelvin + "°K");
    
        if (celcius<1){
            System.out.println("Kondisi Air Beku"); //perulangan untuk mendapatkan kondisi air (Beku)
        }
        else if (celcius>0 && celcius <100){
            System.out.println("Kondisi Air Normal"); // Kondisi air normal
        }       
        else if (celcius>=100){
            System.out.println("Kondisi Air Mendidih"); 
        }
    }
}