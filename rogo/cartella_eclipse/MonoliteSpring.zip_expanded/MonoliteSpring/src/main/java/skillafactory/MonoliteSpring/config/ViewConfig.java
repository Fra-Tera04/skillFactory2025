package skillafactory.MonoliteSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ViewConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		
		registry.addViewController("/formProdotti").setViewName("formProdotti");
		registry.addViewController("/tabellaProdotti").setViewName("tabellaProdotti");
		
		registry.addViewController("/formUtenti").setViewName("formUtenti");
		registry.addViewController("/tabellaUtenti").setViewName("tabellaUtenti");
		
		
		// path to page
	}
}
