<!-- ABOUT THE PROJECT -->
## About The Project

CPU Schedular Simulator: is a Project for Simulating different CPU Techniques to handle Processes in Ready Queue. Techniques Simulated (Shortest Job First, Shortest Remaining Time First, Priority Scheduling and AG)

Summary Describe each Technique.

 SJR(Shortest Job First) : Process which have the shortest burst time are scheduled first.If two processes have the same bust time then FCFS is used to break the tie. It is a non-preemptive scheduling algorithm.

 SRTF(Shortest Remaining Time First) : It is preemptive of SJF algorithm in which we give priorty to the process having shortest burst time remaining.

 Priority Scheduling : In this scheduling, processes are scheduled according to their priorities, i.e., highest priority process is scheduled first. If priorities of two processes match, then schedule according to arrival time. Here starvation of process is possible.
 AG : in this scheduling each Process has Arrival Time, Burst Time and Priority , Quantum and AG Factor. each process excution Time does not exceed it's Quantum. AG Factor = Arrival Time + Burst Time + Priority. It is Non-preemptive Technique. CPU Takes the first Process in the ready queue, after half of Execution Time of the Current Process till end of it. CPU checks the ready if there ia any better Process "better Process means a Process with lower AG Factor". other wise continue excution when finishing, CPU takes first Process in the Ready Queue.
 
<!-- AUTHORS -->
 ## AUTHORS
 
* Mohamed Abd el-fattah - [LinkedIn](https://www.linkedin.com/in/mohamed-abdelfattah-28a283189/) - abdelfattahmohamed968@gmail.com
* Mohamed Ashraf Moussa - [LinkedIn](https://www.linkedin.com/in/mohamed-moussa-baab731a5/) - mohamedmoussa44444@gmail.com
*  Mohamed Ashraf Mohamed - [LinkedIn](https://www.linkedin.com/in/mohamed-el-esaily/) - mohamedelesaily0@gmail.com
* Mahmoud Ashraf - [LinkedIn](https://www.linkedin.com/in/mahmoud-ashraf-51b3321a2/) - mahmoudashraf043@gmail.com
