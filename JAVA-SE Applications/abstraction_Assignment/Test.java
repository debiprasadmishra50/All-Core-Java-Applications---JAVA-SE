package abstraction_Assignment;

public class Test 
{
	public static void main(String[] args) 
	{
		HPNotebook h = new HPNotebook();
		h.click();
		h.scroll();
		DellNotebook d = new DellNotebook();
		d.click();
		d.scroll();
		
	}
}
