package ExecutorThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> 
{
	int num;
	MyCallable(int num) 
	{
		this.num=num;
	}
	
	public Integer call() throws Exception 
	{
		System.out.println(Thread.currentThread().getName()+" is the current thread name and is calculating sum upto "+num);
		
		int sum = 0;
		for (int i = 1; i <= num; i++) 
		{
			sum = sum+i;
		}
		return sum;
	}

}
