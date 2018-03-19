/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timerdemo3;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Moad
 */
public class TimerDemo3 extends TimerTask {
    
    public int counter ;
    
    // this method performs the task  
    public void run() {
        if ( counter <= 5){
            
            System.out.println("working at fixed rate delay " + counter);      
            counter++;
            
        }
    }   
    
    public static void main(String[] args) {
        
        // creating timer task, timer
        TimerTask tasknew = new TimerDemo3();
        Timer timer = new Timer();
      
        // scheduling the task at fixed rate delay
        timer.scheduleAtFixedRate(tasknew,500,1000);      

        // terminating the timer
        System.out.println("cancelling timer");
        timer.cancel();
    
    }


}
