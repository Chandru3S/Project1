package logic;

public class Demo9 {

	public static void main(String[] args) {
		
		int sum=9,rem,l,a,b,c;
		
		{
			for(int i=0;i<200;i++)
			{
				l=sum+i;	//135
				rem=l%10;	//5
				a=l/10;		//13
				b=a%10;		//3
				c=a/10;		//1
				
//				if(c<=b && b<=rem)
//				{
//					if(c+b+rem==sum)
//					{
//						System.out.println(l);
//					}
//					
//				}
				//System.out.println("Reverse ");
				if(c>=b || b>=rem)
				{
					if(c+b+rem==sum)
					{
						System.out.println(l);
					}
					
				}
				
			}
		}

	}

}
