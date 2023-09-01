/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclock;

/**
 *
 * @author User
 */
public class MyClock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;
    
    public MyClock(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getMeridian() {
        return meridian? "AM": "PM";
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }
    
    
    public void advanceTime(int seconds) {
        int ctr;
        
        for (ctr = 0; ctr < seconds; ctr++) {
            this.tickBySecond();
        }
    }
    
    public void tickBySecond() {
        if (this.seconds == 59) {
            this.tickByMinute();
            this.setSeconds(-1);
        }
        this.setSeconds(this.seconds + 1);
    }
    
    public void tickByMinute() {
        if (this.minutes == 59) {
            this.tickByHour();
            this.setMinutes(-1);
        }
        this.setMinutes(this.minutes + 1);
    }
    
    public void tickByHour() {
        this.setHours(this.hours + 1);
        if (this.hours == 12) {
            this.setMeridian(!this.meridian);
        }
    }
    
    public void displayTime12() {        
        System.out.printf("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, this.getMeridian());
    }
    
    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n", this.meridian? this.hours - 12: this.hours, this.minutes, this.seconds);
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, this.getMeridian());
    }
}
