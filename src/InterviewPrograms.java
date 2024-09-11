import java.util.HashMap;
import java.util.Map;

public class InterviewPrograms {
	
	public static void main(String[] args)
	{
		String a="reshmaagdhsjaaxxNNNN";
		char b[]=a.toCharArray();
		
		Map<Character,Integer>charmap=new HashMap<>();
		for(char keys:b) {
			if(charmap.containsKey(keys))
			{
				charmap.put(keys,  charmap.get(keys)+1);
			}
			else
			{
				charmap.put(keys,1);
			}
		}
		System.out.println(charmap);
		
		
		
	}
	
	
	

}
