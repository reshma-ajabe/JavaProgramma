package JavaPrograms;

public class PracticeProgram2 {

	public static void main(String[]  args)
    {
//         String s="RASHMIKA";
//         
//         String rev=" ";
//         for(int i=s.length()-1;i>=0;i--) 
//         {
//        	 rev=rev+ s.charAt(i);
//         }
//
//		System.out.print(rev +" is the revesrse string");
//
//
//
//
//
		
		
		String a="BhavnacorpaB";
		char b[]=a.toCharArray();
		for(int i=0;i<=b.length-1;i++)
{ 
			int count =1;
	    for(int j=i+1;j<=b.length-1;j++)
	    {
	    	if(b[i]==b[j])
	    			{
	    		       count++;
	    			}
	    }
	    System.out.println(b[i]+" frequncy is "+count);
      }
		
		
		
		
		
		
		
		
		
		
		
		
		
   }


}
