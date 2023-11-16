/**
 * 
 */
package za.co.squnga.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
/**
 * @author Noxolo.Mkhungo
 *
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private final static Logger LOGGER = LoggerFactory.getLogger(SecurityConfiguration.class);
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth-> {
            auth.requestMatchers(("/")).anonymous().anyRequest().authenticated();
            auth.anyRequest().authenticated();
        });
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
      /*  http.csrf(csrf ->csrf.disable())
                .authorizeRequests().requestMatchers("/").anonymous().anyRequest().authenticated();*/

        return http.build();
    }

}
