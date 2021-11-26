package io.app.securitydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration // = define beans in this class
@EnableGlobalMethodSecurity(securedEnabled = true) // turns on Spring's method level security feature (lock down certain requests)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // order: lock down approach, top down. anyRequest must come last, otherwise it overwrites the whole config
        // start by locking down everything, and then adding what you want to allow

        http.authorizeRequests()
                .antMatchers("/post/list").permitAll()      // this is viewable to people NOT logged in too
                .antMatchers("/admin/**").hasRole("ADMIN")  // all admin endpoints require admin role
                .anyRequest().authenticated()                           // any request not like the above MUST be authenticated (any role)
                .and()
                .formLogin() // enables default spring login form
                .and()
                .logout();
    }

    @Autowired
    public void createPlaceholderUsers(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("matt")
                .password("{noop}password")
                .roles("ADMIN")
                .and()
                .withUser("joe")
                .password("{noop}password")
                .roles("USER");
    }

}
