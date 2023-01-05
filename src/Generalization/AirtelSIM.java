package Generalization;

public class AirtelSIM implements SimCard 
{
public void sms()
{
	System.out.println("SMS:Limited");
}
public void AudioCall()
{
	System.out.println("Audiocall:100");
}
public void Videocall()
{
	System.out.println("Videocall:90");
}
public void Internet()
{
	System.out.println("Internet:1.5GB");
}
	
	
}
