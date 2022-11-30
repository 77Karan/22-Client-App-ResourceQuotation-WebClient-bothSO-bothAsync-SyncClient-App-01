package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.response.AsyncResponseService;
import in.ashokit.response.SyncResponseService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	SyncResponseService srs = context.getBean(SyncResponseService.class);
	//srs.getResponseInStrig();
	
	//srs.getResponseInObject();
	
	AsyncResponseService asrs = context.getBean(AsyncResponseService.class);
	//asrs.getResponseInString();
	asrs.getResponseInObject();

	
	}
	
	
	

}
