/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escontatore;

/**
 *
 * @author informatica
 */
public class EsContatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Integer c = 10;
       
        Runnable r1=new mThread(c);
       Runnable r2=new mThreadC(c);
       Thread y1= new Thread(r1);
       Thread y2=new Thread(r2);
       
       y1.start();
       y2.start();
    }
    
}
