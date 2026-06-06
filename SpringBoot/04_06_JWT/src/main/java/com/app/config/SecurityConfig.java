package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
//	@Bean
//	SecurityFilterChain sfc(HttpSecurity http) {
//		return http.build();
//	}
//	@Bean
//	UserDetailsService userDetailService() {
//		
//		UserDetails user1= User.withDefaultPasswordEncoder().username("ishwar").password("ISHWAR").roles("USER","ADMIN").build();
//		UserDetails user2= User.withDefaultPasswordEncoder().username("ashish").password("ASHISH").roles("USER").build();
//		return new InMemoryUserDetailsManager(user1,user2);
//	}
	@Bean
	SecurityFilterChain csf(HttpSecurity http) {
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(
				request -> request.requestMatchers("/register").permitAll().anyRequest().authenticated());
		// http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
//	@Bean
//	SecurityFilterChain csf(HttpSecurity http) throws Exception {
//	    http.csrf(csrf -> csrf.disable());
//
//	    http.authorizeHttpRequests(request ->
//	        request
//	            .requestMatchers("/register", "/login").permitAll()
//	            .anyRequest().authenticated()
//	    );
//
//	    http.httpBasic(Customizer.withDefaults());
//
//	    http.sessionManagement(
//	        session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//	    );
//
//	    return http.build();
//	}

	@Bean
	AuthenticationProvider authenticatePrivider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailService);
		// provider.setUserDetailsPasswordService(userDetailService);
		// provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		System.out.println("Provider : " + provider);
		return provider;
	}

	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}

	@Autowired
	private UserDetailsService userDetailService;

	@Autowired
	private JwtFilter jwtFilter;

	public SecurityConfig(JwtFilter jwtFilter) {
		super();
		this.jwtFilter=jwtFilter;
	}

}
