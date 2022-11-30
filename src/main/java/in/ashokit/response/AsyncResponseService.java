package in.ashokit.response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Quotation;
@Service
public class AsyncResponseService 
{
	//Representing JSON RESPONSE in STRING
public void getResponseInString()
{
	WebClient webClient = WebClient.create();
	String url = "https://quoters.apps.pcfone.io/api/random";
	webClient.get()
	.uri(url)
	.accept(MediaType.APPLICATION_JSON)
	.retrieve()
	.bodyToMono(String.class)
	.subscribe(s -> System.out.println(s));
	
	System.out.println("----------Request Sent------");
}


//Representing JSON RESPONSE in STRING
public void getResponseInObject()
{
	WebClient webClient = WebClient.create();
	String url = "https://quoters.apps.pcfone.io/api/random";
	webClient.get()
	.uri(url)
	.accept(MediaType.APPLICATION_JSON)
	.retrieve()
	.bodyToMono(Quotation.class)
	.subscribe(s->System.out.println(s));
	System.out.println("----------Request Sent------");

}



}
