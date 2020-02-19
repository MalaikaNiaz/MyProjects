#include<stdio.h>
#include<sys/types.h>
#include<stdlib.h>
void main()
{
	int no;
	printf("Select the no from the given algorithm\n");
	printf("1.FIRST COME FIRST SERVE(FCFS)\n");
	printf("2.SHORTEST JOB FIRST(SJF)\n");
	printf("3.PRTY\n");
	printf("4.SRTF\n");
	scanf("%d",&no);
	
	if(no==1){
		int n, AT[10], BT[10], CT[10];
	
		int i;
		printf("enter The total number of Process\t");
		scanf("%d", &n);
		for(i=0;i<n;i++)
		{
			printf("enter arrival and burst time:\t");
			scanf("%d%d",&AT[i],&BT[i]);
		}
		CT[0]=BT[0];
		for(i=1;i<n;i++)
		{
			CT[i]=CT[i-1]+BT[i];
		}
	
		printf("Process:AT:\tBT\tCT\n");
		for(i=0;i<n;i++)
		{
			printf("%d\t%d\t%d\t%d\n",i+1,AT[i],BT[i],CT[i]);
		}
	}
	else if(no==2){
		int bt[20],p[20],wt[20],tat[20],i,j,n,total=0,pos,temp;
    	float avg_wt,avg_tat;
    	printf("Enter number of process:");
    	scanf("%d",&n);
  
    	printf("\nEnter Burst Time:\n");
    	for(i=0;i<n;i++)
    	{
        	printf("p%d:",i+1);
	        scanf("%d",&bt[i]);
	        p[i]=i+1;         
	    }
  
   		//sort kiya brst time se
    	for(i=0;i<n;i++)
    	{
        	pos=i;
        	for(j=i+1;j<n;j++)
        	{
            	if(bt[j]<bt[pos])
                pos=j;
        	}
  
        	temp=bt[i];
        	bt[i]=bt[pos];
        	bt[pos]=temp;
  
        	temp=p[i];
        	p[i]=p[pos];
	        p[pos]=temp;
    	}
   
    	wt[0]=0;            
  
   		for(i=1;i<n;i++)
    	{
        	wt[i]=0;
        	for(j=0;j<i;j++)
            	wt[i]+=bt[j];
  
        	total+=wt[i];
    	}
  
    	avg_wt=(float)total/n;      
    	total=0;
  
    	printf("\nProcesst    Burst Time    \tWaiting Time\tTurnaround Time");
    	for(i=0;i<n;i++)
    	{
        	tat[i]=bt[i]+wt[i];   
        	total+=tat[i];
        	printf("\np%d\t\t  %d\t\t    %d\t\t\t%d",p[i],bt[i],wt[i],tat[i]);
    	}
  
    	avg_tat=(float)total/n;    
    	printf("\nAverage Waiting Time=%f",avg_wt);
    	printf("\nAverage Turnaround Time=%f\n",avg_tat);
	}
	else if(no==3
	){
		int bt[20],p[20],wt[20],tat[20],pr[20],i,j,n,total=0,pos,temp,avg_wt,avg_tat;

    	printf("Enter Total Number of Process:");
    	scanf("%d",&n);
 
	    printf("\nEnter Burst Time and Priority\n");
	    for(i=0;i<n;i++)
    	{
	        printf("\nP[%d]\n",i+1);
    	    printf("Burst Time:");
        	scanf("%d",&bt[i]);
        	printf("Priority:");
        	scanf("%d",&pr[i]);
        	p[i]=i+1;           
    	}
 

    	for(i=0;i<n;i++)
    	{
	        pos=i;
	        for(j=i+1;j<n;j++)
	        {
    	        if(pr[j]<pr[pos])
            	    pos=j;
        	}
 
       		temp=pr[i];
       		pr[i]=pr[pos];
        	pr[pos]=temp;
 
        	temp=bt[i];
        	bt[i]=bt[pos];
        	bt[pos]=temp;
 
        	temp=p[i];
        	p[i]=p[pos];
        	p[pos]=temp;
    	}
 
    	wt[0]=0;
 
   
    	for(i=1;i<n;i++)
    	{
        	wt[i]=0;
        	for(j=0;j<i;j++)
            	wt[i]+=bt[j];
 
        	total+=wt[i];
    	}
 
    	avg_wt=total/n;      
    	total=0;
 
    		printf("\nProcess\t    Burst Time    \tWaiting Time\tTurnaround Time");
    	for(i=0;i<n;i++)
    		{
        		tat[i]=bt[i]+wt[i];     
        		total+=tat[i];
        		printf("\nP[%d]\t\t  %d\t\t    %d\t\t\t%d",p[i],bt[i],wt[i],tat[i]);
    		}
 
    	avg_tat=total/n;    
    	printf("\n\nAverage Waiting Time=%d",avg_wt);
    	printf("\nAverage Turnaround Time=%d\n",avg_tat);
    }else if(no==4){
    	int a[10],b[10],x[10];
 		int waiting[10],turnaround[10],completion[10];
 		int i,j,smallest,count=0,time,n;
 		double avg=0,tt=0,end;
 		printf("\nEnter the number of Processes: ");
 		scanf("%d",&n);
 		for(i=0;i<n;i++)
 		{
   			printf("\nEnter arrival time of process %d : ",i+1);
   			scanf("%d",&a[i]);
 		}
 		for(i=0;i<n;i++)
 		{
   			printf("\nEnter burst time of process %d : ",i+1);
   			scanf("%d",&b[i]);
 		}
 		for(i=0;i<n;i++)
 			x[i]=b[i];

  		b[9]=9999;
 	
 		for(time=0;count!=n;time++)
 		{
   			smallest=9;
  			for(i=0;i<n;i++)
  			{
   				if(a[i]<=time && b[i]<b[smallest] && b[i]>0 )
   				smallest=i;
  			}
  			b[smallest]--;
  
  			if(b[smallest]==0)
  			{
   				count++;
   				end=time+1;
   				completion[smallest] = end;
   				waiting[smallest] = end - a[smallest] - x[smallest];
   				turnaround[smallest] = end - a[smallest];
   
  			}
 		}
 		printf("pid \t burst \t arrival \twaiting \tturnaround \tcompletion");
 		for(i=0;i<n;i++)
 		{
   			printf("\n %d \t   %d \t %d\t\t%d   \t\t%d\t\t%d",i+1,x[i],a[i],waiting[i],turnaround[i],completion[i]);
   			avg = avg + waiting[i];
   			tt = tt + turnaround[i];
 		}
 		printf("\n  %If   %If",avg,tt);
 		printf("\n\nAverage waiting time = %lf\n",avg/n);
 		printf("Average Turnaround time = %lf",tt/n);
 		getch();

	}else
	{
    	printf("Please select 1 to 4");
    	return;
    }

}
