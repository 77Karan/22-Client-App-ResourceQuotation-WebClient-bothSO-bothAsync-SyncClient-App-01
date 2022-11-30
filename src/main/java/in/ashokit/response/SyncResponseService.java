package in.ashokit.response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Quotation;

@Service
public class SyncResponseService 
{
	
	//Representing JSON RESPONSE in STRING
	public void getResponseInStrig()
	{
		String url ="https://quoters.apps.pcfone.io/api/random";
		WebClient webClient = WebClient.create();
		String block = webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		System.out.println(block);

	}
	
	
	//REPRESENTING JSON RESPONSE IN Object
	public void getResponseInObject()
	{
		WebClient webClient = WebClient.create();
		String url ="https://quoters.apps.pcfone.io/api/random";
		Quotation quotation = webClient.get()
				              .uri(url)
				              .accept(MediaType.APPLICATION_JSON)
				              .retrieve()
				              .bodyToMono(Quotation.class)
				              .block();
		System.out.println(quotation);
	}

}
