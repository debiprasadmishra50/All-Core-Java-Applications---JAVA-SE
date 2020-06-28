package JDK9Features;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class ImmutableClassEx 
{
	public static void main(String[] args) 
	{
		List<String> list = List.of("abc", "xyz" , "123");
		System.out.println(list);
//		list.add("HRH");
//		list.add(null);

//		Set<String> set = Set.of("abc", "xyz", "abc"); //cant add duplicate element
		Set<String> set = Set.of("abc", "XYZ", "123");
		System.out.println(set);
		
//		Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
//		Map.ofEntries(entries);
		
	}
}
