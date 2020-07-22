/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os3;

/**
 *

 */
;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;



public class OS3 {

    public static Vector<Process> Processes = new Vector();
    public static Vector<Process> ProcessesFinal = new Vector();
    public static Vector<Process> waitingList = new Vector();
    public static Vector<Process> done = new Vector();
    public static int contextSwitch = 0;
    public static Scanner input = new Scanner(System.in);

    public static void Getinput() {
        System.out.println("Enter num of processes :");
        int numofprocesses = input.nextInt();
        //System.out.println("Enter RoundRobin time:");
        //int RoundRobintime=input.nextInt();
        //System.out.println("Enter Context Switching Time :");
        //contextSwitch=input.nextInt();
        for (int i = 0; i < numofprocesses; i++) {
            Process p = new Process();
            Process p2 = new Process();
            String name;
            int arrTime, burst, priorty;

            System.out.println("Enter process Name:");
            name = input.next();
            p.name = name;
            p2.name = name;

            System.out.println("Enter process Arrival Time:");
            arrTime = input.nextInt();
            p.arrivalTime = arrTime;
            p2.arrivalTime = arrTime;

            System.out.println("Enter process Burst Time:");
            burst = input.nextInt();
            p.Bursttime = burst;
            p2.Bursttime = burst;

            System.out.println("Enter priorty Time:");
            priorty = input.nextInt();
            p.PriorityNumber = priorty;
            p2.PriorityNumber = priorty;

            Processes.add(p);
            ProcessesFinal.add(p2);
        }
    }

    static Vector<Process> Sortarrivaltime1(Vector<Process> arr) {//sort myChars alphabetically

        int i, j;
        for (i = 0; i < arr.size() - 1; i++) {//bubble sort
            for (j = 0; j < arr.size() - i - 1; j++) {
                if (arr.elementAt(j).Bursttime == arr.elementAt(j + 1).Bursttime && arr.elementAt(j).waitingTime < arr.elementAt(j + 1).waitingTime) {

                } else if (arr.elementAt(j).arrivalTime > arr.elementAt(j + 1).arrivalTime) {

                    String name;
                    int arrivalTime;
                    int Bursttime;
                    int PriorityNumber;
                    int waitingTime;
                    int turnaroundTime;

                    name = arr.elementAt(j).name;
                    arr.elementAt(j).name = arr.elementAt(j + 1).name;
                    arr.elementAt(j + 1).name = name;

                    arrivalTime = arr.elementAt(j).arrivalTime;
                    arr.elementAt(j).arrivalTime = arr.elementAt(j + 1).arrivalTime;
                    arr.elementAt(j + 1).arrivalTime = arrivalTime;

                    Bursttime = arr.elementAt(j).Bursttime;
                    arr.elementAt(j).Bursttime = arr.elementAt(j + 1).Bursttime;
                    arr.elementAt(j + 1).Bursttime = Bursttime;

                    PriorityNumber = arr.elementAt(j).PriorityNumber;
                    arr.elementAt(j).PriorityNumber = arr.elementAt(j + 1).PriorityNumber;
                    arr.elementAt(j + 1).PriorityNumber = PriorityNumber;

                    waitingTime = arr.elementAt(j).waitingTime;
                    arr.elementAt(j).waitingTime = arr.elementAt(j + 1).waitingTime;
                    arr.elementAt(j + 1).waitingTime = waitingTime;

                    turnaroundTime = arr.elementAt(j).turnaroundTime;
                    arr.elementAt(j).turnaroundTime = arr.elementAt(j + 1).turnaroundTime;
                    arr.elementAt(j + 1).turnaroundTime = turnaroundTime;

                }

            }
        }
        return arr;
    }

    static Vector<Process> Sortarrivaltime(Vector<Process> arr) {//sort myChars alphabetically

        int i, j;
        for (i = 0; i < arr.size() - 1; i++) {//bubble sort
            for (j = 0; j < arr.size() - i - 1; j++) {
                if (arr.elementAt(j).Bursttime == arr.elementAt(j + 1).Bursttime && arr.elementAt(j).waitingTime < arr.elementAt(j + 1).waitingTime) {

                } else if (arr.elementAt(j).Bursttime > arr.elementAt(j + 1).Bursttime) {

                    String name;
                    int arrivalTime;
                    int Bursttime;
                    int PriorityNumber;
                    int waitingTime;
                    int turnaroundTime;

                    name = arr.elementAt(j).name;
                    arr.elementAt(j).name = arr.elementAt(j + 1).name;
                    arr.elementAt(j + 1).name = name;

                    arrivalTime = arr.elementAt(j).arrivalTime;
                    arr.elementAt(j).arrivalTime = arr.elementAt(j + 1).arrivalTime;
                    arr.elementAt(j + 1).arrivalTime = arrivalTime;

                    Bursttime = arr.elementAt(j).Bursttime;
                    arr.elementAt(j).Bursttime = arr.elementAt(j + 1).Bursttime;
                    arr.elementAt(j + 1).Bursttime = Bursttime;

                    PriorityNumber = arr.elementAt(j).PriorityNumber;
                    arr.elementAt(j).PriorityNumber = arr.elementAt(j + 1).PriorityNumber;
                    arr.elementAt(j + 1).PriorityNumber = PriorityNumber;

                    waitingTime = arr.elementAt(j).waitingTime;
                    arr.elementAt(j).waitingTime = arr.elementAt(j + 1).waitingTime;
                    arr.elementAt(j + 1).waitingTime = waitingTime;

                    turnaroundTime = arr.elementAt(j).turnaroundTime;
                    arr.elementAt(j).turnaroundTime = arr.elementAt(j + 1).turnaroundTime;
                    arr.elementAt(j + 1).turnaroundTime = turnaroundTime;

                }

            }
        }
        return arr;
    }

    static Vector<Process> SortPrioritytime(Vector<Process> arr) {//sort myChars alphabetically

        int i, j;
        for (i = 0; i < arr.size() - 1; i++) {//bubble sort
            for (j = 0; j < arr.size() - i - 1; j++) {
                /*if(arr.elementAt(j).Bursttime == arr.elementAt(j+1).Bursttime && arr.elementAt(j).PriorityNumber > arr.elementAt(j+1).PriorityNumber){
                    
                }*/
                if (arr.elementAt(j).PriorityNumber > arr.elementAt(j + 1).PriorityNumber) {

                    String name;
                    int arrivalTime;
                    int Bursttime;
                    int PriorityNumber;
                    int waitingTime;
                    int turnaroundTime;

                    name = arr.elementAt(j).name;
                    arr.elementAt(j).name = arr.elementAt(j + 1).name;
                    arr.elementAt(j + 1).name = name;

                    arrivalTime = arr.elementAt(j).arrivalTime;
                    arr.elementAt(j).arrivalTime = arr.elementAt(j + 1).arrivalTime;
                    arr.elementAt(j + 1).arrivalTime = arrivalTime;

                    Bursttime = arr.elementAt(j).Bursttime;
                    arr.elementAt(j).Bursttime = arr.elementAt(j + 1).Bursttime;
                    arr.elementAt(j + 1).Bursttime = Bursttime;

                    PriorityNumber = arr.elementAt(j).PriorityNumber;
                    arr.elementAt(j).PriorityNumber = arr.elementAt(j + 1).PriorityNumber;
                    arr.elementAt(j + 1).PriorityNumber = PriorityNumber;

                    waitingTime = arr.elementAt(j).waitingTime;
                    arr.elementAt(j).waitingTime = arr.elementAt(j + 1).waitingTime;
                    arr.elementAt(j + 1).waitingTime = waitingTime;

                    turnaroundTime = arr.elementAt(j).turnaroundTime;
                    arr.elementAt(j).turnaroundTime = arr.elementAt(j + 1).turnaroundTime;
                    arr.elementAt(j + 1).turnaroundTime = turnaroundTime;

                }

            }
        }
        return arr;
    }

    static void print(Vector<Process> arr) {
        float avgwait = 0;
        float avgturn = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("name : " + arr.elementAt(i).name);
            System.out.println("burst time : " + arr.elementAt(i).Bursttime);
            System.out.println("arrival time : " + arr.elementAt(i).arrivalTime);
            System.out.println("waiting time : " + arr.elementAt(i).waitingTime);
            System.out.println("turnarround time : " + arr.elementAt(i).turnaroundTime);
            System.out.println("");
            //avgwait += arr.elementAt(i).waitingTime;
            //avgturn += arr.elementAt(i).turnaroundTime;
        }
        System.out.println("average waiting time : " + avgwait / arr.size());
        System.out.println("average turn arround time : " + avgturn / arr.size());

    }

    public static void SJF(Vector<Process> p) {
        //p = Sort(p);
        //print(p);
        int i = 0;

        int size = p.size();
        while (done.size() < size) {
            int j = 0;
            boolean removed = false;
            while (j < p.size()) {
                if (i >= p.elementAt(j).arrivalTime) {
                    waitingList.add(p.elementAt(j));
                    p.remove(j);
                    removed = true;
                    //j = 0;
                }
                if (removed) {
                    j = 0;
                    removed = false;
                } else {
                    j++;
                }
            }

            waitingList = Sortarrivaltime(waitingList);

            done.add(waitingList.elementAt(0));
            waitingList.remove(0);

            done.elementAt(done.size() - 1).waitingTime = i - done.elementAt(done.size() - 1).arrivalTime;
            done.elementAt(done.size() - 1).turnaroundTime = done.elementAt(done.size() - 1).waitingTime + done.elementAt(done.size() - 1).Bursttime;

            i += done.elementAt(done.size() - 1).Bursttime;

        }
    }
    public static boolean found = false;

    public static void serach(Vector<Process> first, Vector<Process> secand) {
        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < secand.size(); j++) {
                if (first.get(i).name.equals(secand.get(j).name)) {
                    found = true;
                }
            }
        }

    }

    public static Vector<String> SRTF(Vector<Process> arr, int context) {
        int size = 0;
        Vector<Process> fixed = new Vector();
        Vector<String> names = new Vector<>();
        Vector<Integer> bursts = new Vector<>();

        for (int i = 0; i < arr.size(); i++) {
            fixed.add(arr.elementAt(i));
            bursts.add(arr.elementAt(i).Bursttime);
        }
        String con = "Switch";

        for (int i = 0; i < arr.size(); i++) {
            size += arr.elementAt(i).Bursttime;
        }
        int time = 0;
        while (time < size) {

            boolean found = false;
            for (int i = 0; i < arr.size(); i++) {//loop in the array if the condition is true and it's not already in the waiting list add it
                if (time >= arr.elementAt(i).arrivalTime) {//chech if apply
                    for (int j = 0; j < waitingList.size(); j++) {
                        if (arr.elementAt(i).name.equals(waitingList.elementAt(j).name)) {//if the process is already in the waiting list
                            found = true;
                            break;
                        }
                    }
                    if (found == false) {//if it's false then it wasn't in the waiting list then add it
                        waitingList.add(arr.elementAt(i));
                    }

                }
                found = false;
            }
            waitingList = Sortarrivaltime(waitingList);
            waitingList.elementAt(0).Bursttime--;//minus the burst time in the waiting list

            if (time != 0) {
                if (!waitingList.elementAt(0).name.equals(names.elementAt(names.size() - 1))) {
                    time += context;
                    names.add(con);
                    size++;
                }
            }

            done.add(waitingList.elementAt(0));
            names.add(done.elementAt(done.size() - 1).name);

            if (waitingList.elementAt(0).Bursttime <= 0) {//if the procces finished delete it from the arr and the waiting list
                for (int i = 0; i < arr.size(); i++) {
                    //System.out.println("1-time before remove : " +arr.elementAt(i).name + "  "+ time);
                    if (arr.elementAt(i).name.equals(waitingList.elementAt(0).name)) {
                        //System.out.println("-------2---------");
                        for (int j = 0; j < fixed.size(); j++) {//find the element in the fixed
                            if (arr.elementAt(i).name.equals(fixed.elementAt(j).name)) {
                                System.out.println("time before remove : " + arr.elementAt(i).name + "  " + time);

                                fixed.elementAt(j).turnaroundTime = (time + 1) - fixed.elementAt(j).arrivalTime;
                                for (int k = 0; k < ProcessesFinal.size(); k++) {
                                    if (fixed.elementAt(j).name.equals(ProcessesFinal.elementAt(k).name)) {
                                        fixed.elementAt(j).waitingTime = fixed.elementAt(j).turnaroundTime - ProcessesFinal.elementAt(k).Bursttime;
                                        break;
                                    }
                                }
                                //fixed.elementAt(j).waitingTime = fixed.elementAt(j).turnaroundTime - ProcessesFinal.elementAt(j).Bursttime;

                                break;
                            }
                        }
                        arr.remove(i);
                        break;
                    }
                }
                waitingList.remove(0);
            }

            time++;
        }
        print(fixed);
        return names;
    }

    public static void PriorityScheduling(Vector<Process> arr) {
        int time = 0;
        while (arr.size() > 0) {
            arr = Sortarrivaltime1(arr);
            for (int i = 0; i < arr.size(); i++) {
                if ((time >= arr.get(i).arrivalTime)) {
                    waitingList.add(arr.get(i));
                }
            }
            waitingList = SortPrioritytime(waitingList);
            //print(waitingList);
            time += waitingList.get(0).Bursttime;
            done.add(waitingList.get(0));
           

            //System.out.println("wait" + " " + waitingList.get(0).name + " " + waitingList.get(0).arrivalTime);
            for (int i = 0; i < arr.size(); i++) {
                if (waitingList.get(0).name.equals(arr.get(i).name)) {
                    //System.out.println(arr.get(i).name+" "+"size"+arr.size());
                    arr.remove(i);
                    break;

                }

            }
            /*
         System.out.println("befor remove");
           for(int i=0;i<waitingList.size();i++){
           System.out.println(waitingList.get(i).name);
       }
       
             */
             System.out.println(waitingList.get(0).name);
             System.out.println("wating");
            waitingList.remove(0);
            /* 
           System.out.println("after");
           for(int i=0;i<arr.size();i++){
           System.out.println(arr.get(i).name);
       }
             */

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).arrivalTime > 1) {
                    arr.get(i).PriorityNumber--;
                }
            }

            //7
            /*for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i).name);
            }
            //System.out.println("end");
            //print(arr);
*/
        }
        //print(done);
    }

    public static void main(String[] args) {
        Getinput();
        //Vector<String> names = new Vector();
        //SJF(Processes);

        System.out.println("-------------------------");
        //names = SRTF(Processes,contextSwitch);
        //SortPrioritytime(Processes);
        //PriorityScheduling(Processes);
        //print(Processes);
        /*
        for(int i = 0 ; i < Processes.size() ; i++){
            System.out.println(" Prioty: " + Processes.get(i).PriorityNumber);
        }
         */
        Sortarrivaltime1(Processes);
         print(Processes);
        //print(Processes);
        //System.out.println("---------------");

    }
}
