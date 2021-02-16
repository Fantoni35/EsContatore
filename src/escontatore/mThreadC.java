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
public class mThreadC implements Runnable {
  private Integer c;
    public mThreadC(int c){
        this.c=c;
    }
    public void run(){
        while(1==1){
        if(c<100){
            c++;
        }
        System.out.println("il numero è:"+c);
        
    }
}
}