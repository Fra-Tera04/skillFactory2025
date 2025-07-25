package skillfactory.monolite.aerei.AaereiProject.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import skillfactory.monolite.aerei.AaereiProject.model.AccountAziendale;
import skillfactory.monolite.aerei.AaereiProject.repository.IRepoAccount;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
 
    @Autowired
    IRepoAccount repoA;
 
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/","home").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin((form) -> form
                .loginPage("/login")
                .permitAll()
            )
            .logout((logout) -> logout.permitAll());
 
        return http.build();
    }
 
    @SuppressWarnings("deprecation")
    @Bean
    UserDetailsService userDetailsService() {
        List<UserDetails> usersAuth = new ArrayList<UserDetails>();
        List<AccountAziendale> users =repoA.findAll();
        for(AccountAziendale u:users) {
            //Vengono caricati tutti gli utenti registrati per
            //autorizzarli all'accesso
            UserDetails user = User.withDefaultPasswordEncoder()
                    .username(u.getUsername())
                    .password(u.getPassword())
                    .build();
            usersAuth.add(user);
        }
 
        return new InMemoryUserDetailsManager(usersAuth);
    }  
}