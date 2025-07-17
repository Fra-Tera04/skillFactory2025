package skillfactory.monolite.aerei.AaereiProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ViewConfig implements WebMvcConfigurer{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		
		registry.addViewController("/login").setViewName("login");
		
		registry.addViewController("/formVolo").setViewName("formVolo");
		registry.addViewController("/formAccount").setViewName("formAccount");
		
		registry.addViewController("/tabellaPrenotazioni").setViewName("tabellaPrenotazioni");
		registry.addViewController("/tabellaAccountAzinedali").setViewName("tabellaAccountAzinedali");
		
		//WebMvcConfigurer.super.addViewControllers(registry);
	}
}
