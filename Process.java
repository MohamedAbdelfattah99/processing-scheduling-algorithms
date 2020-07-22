/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os3;

/**
 *
 * 
 */
public class Process {
    String name,check="*";
    int arrivalTime;
    int Bursttime;
    int PriorityNumber;
    int waitingTime;
    int turnaroundTime;
    

    public Process() {
        name="";
        arrivalTime=0;
        Bursttime=0;
        PriorityNumber=0;
        check="";
        //first = false;
    }

    public Process(String name, int arrivalTime, int Bursttime, int PriorityNumber, int waitingTime, int turnaroundTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.Bursttime = Bursttime;
        this.PriorityNumber = PriorityNumber;
        this.waitingTime = waitingTime;
        this.turnaroundTime = turnaroundTime;
    }

    
  
}

