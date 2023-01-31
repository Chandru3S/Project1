package logic;

public class Demo7 {

	public static void main(String[] args) {
		
		char A1[] = {'A','B','C','D'};
		char A2[] = {'P','Q','A','D'};
		
		int c=0;
		
		for(int i=0;i<A1.length;i++)
		{
			for(int j=0;j<A2.length;j++)
			{
				if(A1[i]==A2[j])
				{
					c++;
					if(c>0)
					{
						System.out.println(A1[i]+"-"+j);
					}
					else
					{
						System.out.println(A1[i]+"-NA");
					}
				}
			}
		}
		
	}

}
