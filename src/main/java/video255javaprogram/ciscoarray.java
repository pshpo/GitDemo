package video255javaprogram;

public class ciscoarray {

	public static void main(String[] args) 
	{
     int a[][]= {{2,4,5},{3,0,7},{1,2,9}};
     int min=a[0][0];
     int mincol=0;
     for (int i=0;i<3;i++)
     {
    	 for (int j=0;j<3;j++)
    	 {
    		 if (a[i][j]<min)
    		 {
    			 min=a[i][j];
    			 mincol=j;
    		 }
    	 }
     }
	System.out.println("Minimum value :"+min);	
	System.out.println("Minimum value col :"+mincol);
	int max=a[0][mincol];
	for (int i=0;i<2;i++)
	{
	    if (a[i][mincol]>max)
	    {
	    	max=a[i][mincol];
	    }
	}
		
	System.out.println("Maximum value :="+max);
	}

}
