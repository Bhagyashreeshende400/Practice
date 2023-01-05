package Generalization;

public class IdeaSIM implements SimCard
{
	public void sms()
	{
		System.out.println("SMS:100");
	}
	public void AudioCall()
	{
		System.out.println("Audiocall:150");
	}
	public void Videocall()
	{
		System.out.println("Videocall:30");
	}
	public void Internet()
	{
		System.out.println("Internet:2GB");
	}
}
