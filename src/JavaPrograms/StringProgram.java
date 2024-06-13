package JavaPrograms;

public class StringProgram {

   public static void main(String[] args) {
	   
//	     String a="Reshma";
//	     String rev=" ";
//	     for(int i=a.length()-1;i>=0;i--) 
//	     {
//	    	 rev=rev+a.charAt(i);
//	    	 
//	     }
//	     System.out.println(rev);
//	   
	   
//	   
//	   String a="Bhavna";
//	   String rev="";
//	   for(int i=a.length()-1;i>=0;i--) 
//	   {
//		   
//		   rev=rev+a.charAt(i);
//	   }
//	   System.out.println(rev);
	   
	   
//	   String a="efrgsthajjaefkkqssRR";
//	   int count=0;
//	   for(int i=0;i<=a.length()-1;i++)
//	   {
//		   for(int j=i+1;j<=a.length()-1;j++)                               Duplicate characters
//		   {
//			   if(a.charAt(i)==a.charAt(j)) 
//			   {
//				   System.out.print(a.charAt(j));
//				   count++;
//				   break;
//			   }
//		   }
//	   }
	   
	
//	   
//	   String a="RESHMAJAABE";
//	   for(int i=0;i<=a.length()-1;i++)
//	   {
//		   System.out.println(a.charAt(i));
//	   }
//	  
	   
	   
//	   String a="RESHMAJAABE";
//	   
//	   for(int i=0;i<=a.length()-1;i++)
//	   {                                                                  @only even numbers index charcaters
//		   if(i%2==0)
//		   {
//			   System.out.println(a.charAt(i));
//		   }
//	   }
	   
	   
	   
//	    String a="rehsgfsrtwyhhnjjjj";
//	    
//	    
//	     for( int i=0;i<=a.length()-1;i++)
//	     { 
//	    	 int count=1;
//	    	 
//	    	 for(int j=i+1;j<=a.length()-1;j++)                   Not runned program
//	    	 {
//	    		 if(a.charAt(i)==a.charAt(j))
//	    		 {
//	    			 count++;
//	    			 System.out.println(a.charAt(i)+ count);
//	    			 
//	    			                                              
//	    		 }
//	    		
//	    	 }
//	    	
//    	 System.out.println(count);
//	    	 
//	     }
	     
     
	   
	   
//	  String a=" R S H M A  ";
//	  int count=0;
//	  for(int i=0;i<=a.length()-1;i++)
//	  {
//		  if(a.charAt(i)==' ')
//		  { 
//			  count++;
//		  }                                                    # count of blank space
//	  }
//	  System.out.println(count);
//	   
	   
	   
	   
   
	   
//	   String a="kolhapur";
//	    int count=0;                                                   
//	                                                             SWAR
//	    for(int i=0;i<=a.length()-1;i++)
//	    {
//	    	if(a.charAt(i)!='a'&& a.charAt(i)!='e'&& a.charAt(i)!='i'&& a.charAt(i)!='o'&&a.charAt(i)!='u')
//	    	{
//	    		 System.out.println(a.charAt(i));
//	    		count++;
//	    	}
//	    }                                         
//	    System.out.println(count);
//	    
//	   
   
   
	   
	   
//	   String a="bhavnafamily";
//	   int count=0;
//	   for(int i=0;i<=a.length()-1;i++)
//	   {
//		   if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
//			 
//		   {
//			   count++;
//			   System.out.println(a.charAt(i)+" is the Vowel");
//			   
//	     }
//		   
//		   
//	   }
//	   
//	   System.out.println(count);
//   
//   
   
	   
	    String s="bjavna";
	    int count=1;
	    for(int i=0;i<=s.length()-1;i++)
	    {
	    	for(int j=i+1;j<=s.length()-1;j++)
	    	{
	    		if(s.charAt(i)==s.charAt(j))
	    		{
	    			count++;
	    			
	    		}
	    		
	    	}
	    	if(count==1) 
	    	{
	    		System.out.print(s.charAt(i));
	    	}
	    	else {
	    		count=0;
	    	}
	    	
	       
	    	
	    }
	 
	   
	   
	   
	   
   
   
   
   
   
   
   
   }
















}
