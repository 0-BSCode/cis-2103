/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import myclock.MyClock;
/**
 *
 * @author User
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClock clock = new MyClock(11, 00, 35, false);
        clock.displayTime12();
        clock.displayTime24();
        clock.advanceTime(3600);
        
        clock.displayTime12();
        clock.displayTime24();
        System.out.println(clock);
    }
    
}
