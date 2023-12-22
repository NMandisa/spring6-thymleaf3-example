/**
 * 
 */
package za.co.squnga.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import za.co.squnga.repository.ProductRepository;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private final static java.util.logging.Logger LOGGER = Logger.getLogger(SecurityConfiguration.class.getName());
    private ProductRepository productRepository;
    @Bean //we'll work on the security later
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        /*http.csrf(
                csrf -> csrf.disable())
                .authorizeHttpRequests(auth-> {
            auth.requestMatchers(("/")).anonymous().anyRequest().authenticated();
            auth.requestMatchers("/favicon.ico","/error/").anonymous().anyRequest().permitAll();
                });*/
      /*  http.csrf(csrf ->csrf.disable())
                .authorizeRequests().requestMatchers("/").anonymous().anyRequest().authenticated();*/
        return http.build();
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
