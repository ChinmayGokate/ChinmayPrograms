package com.ni.ex;
//Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
// 1,2,3
// 4,5,6
// 7,8,9
      // 1+5+9=15
	  // 3+5+7=15
		//15-15=0
public class DiagonalDifference 
{
	public void diagonalDifference(int arr[][])
	{
	int sum1=0,sum2=0;
    int total;
    for(int i=0;i<arr.length;i++)
    {
        sum1=arr[i][i]+sum1;
       
    }
    for(int i=0,j=1;i<arr.length;i++,j++) 
    {   
        sum2=arr[i][arr.length-j]+sum2;
       
    }   
        total=sum1-sum2;
        if(total<0)
        {
            total=-+total;
        }
        System.out.println(total);
	}
    public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		DiagonalDifference dd=new DiagonalDifference();
		dd.diagonalDifference(arr);
	}

}
