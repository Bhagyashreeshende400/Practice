package Generalization;

public class TestGeneralization 
{
public static void main(String[] args) 
{
	System.out.println("....Features of JIO Simcard.....");
 jioSIM j=new jioSIM();
j.sms();
j.AudioCall();
j.VideoCall();
j.Internet();

System.out.println("....Features of AirtelSimcard.....");
AirtelSIM a=new AirtelSIM();
a.sms();
a.AudioCall();
a.Videocall();
a.Internet();


System.out.println("....Features of IdeaSimcard.....");
IdeaSIM i=new IdeaSIM();
i.sms();
i.AudioCall();
i.Videocall();
i.Internet();




}
}
