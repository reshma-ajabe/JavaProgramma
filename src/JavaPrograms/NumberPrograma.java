package JavaPrograms;

public class NumberPrograma {

public static void main(String[] args) {
	
//	int a=101;
//	for(int i=1;i<=a/2;i++) {
//		
//   if(i*i==a)                                                             #  check Perfect sqaure
//   {
//	  System.out.println("a is perfect square") ;
//   }
//}
	
	
	
	
//	int a=5;
//	for(int i=1;i<=a*a;i++) {
//		                                                        
//		if(i==a*a) 
//		{
//			System.out.println("a is square root of"+i)  ;
//		}
//	}
//	
//	
	
	
	
	
	
	
//	int a=30;
//	int b=60;
//	int hcf=1;
//	for(int i=1;i<=60;i++) 
//	{
//		                                                    # Highest common factor
//		if(a%i==0 && b%i==0) 
//		{
//			hcf=i;
//		}
//	}
//	
//	System.out.println(hcf);
	
	
	
	
//	int a=20;
//	int b=30;
//	int hcf=1;
//	int lcm;
//	for(int i=1;i<=a;i++)
//	{
//		if(a%i==0 && b%i==0) 
//		{
//			hcf=i;                                          # LCM
//		}
//	}
//	System.out.println(hcf);
//	lcm=a*b/hcf;
//	System.out.println(lcm);
	
	
	
	
	
//	int a=121;
//	int no=a;
//	int rev=0;
//	int rem;
//    while(a!=0) 
// {
//  rem=a%10;
//  rev=(rev*10)+rem;
//  a=a/10;
//	
//  }
//   if(no==rev)
//   {
//	   
//   
//	   System.out.println(rev+" no is palindrone");
//	
//}
//}	
	

	int a=125;
	int no=a;
	int b=0;
	int rem;
	while(a!=0)
	{
		rem=a%10;
		b=b+(rem*rem*rem);
		a=a/10;
		
	}
	if(no==b)
	{
		System.out.println("NO IS ARMSTRONG");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}









