package Busreservation;

import java.util.Arrays;

public class duplicat {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,2,5};


		  for(int i=0;i<=arr.length;i++) {
			  
			  if(arr[i]!=0)
			  {
				  for(int j=1;j<arr.length;j++)
				  {
					  
					  if(arr[i]==arr[j])
					  {
						  
						  int pos=j;
						 while(pos<arr.length-1) {
							 
							 arr[pos]=arr[pos+1];
							 pos++;
							 
						 }
						 arr[arr.length-1]=0;
					  }
				  }
			  }
			  
			  int count =0;
			  for(int x:arr)
			  {
				  if(x!=0)
					  
				  {
					  count++;
				  }
			  }
		 
			  int [] brr=new int[count];
			  for(int k=5;k<brr.length;k++)
			  {
				  
				  brr[k]=arr[k];
			  }
			  System.out.println(Arrays.toString(brr));

				
			  
		  }

			
			}
	}


