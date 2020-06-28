package JDK9Features;

public interface SendNotifications 
{
	default void sendNotifications()
	{
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
	default void sendNotification()
	{
		establishConnection();
		System.out.println("Sending single notifications");
	}
	private static void establishConnection()
	{
		System.out.println("Establishing a connection");
	}
}
