package com.codegym.casestudy.appconfig;

import com.codegym.casestudy.service.login.MyUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /*Cài đặt cách lấy thông tin UserDetail, cơ chế mã hoá password*/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService)
                .passwordEncoder(passwordEncoder());
    }

    /*Cấu hình xác thực/phân quyền theo cơ chế HTTP basic*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin()
                  .loginPage("/page")
                  .defaultSuccessUrl("/").permitAll()
                .and()
                    .authorizeRequests()
                    .antMatchers("/","/login.css").permitAll() /*Không cần xác thực*/
                    .antMatchers("/employee").hasAnyRole("USER","ADMIN")
                    .antMatchers("/employee/create").hasAnyRole("ADMIN")
//                    .antMatchers("/employee/**").hasAnyRole("ADMIN")
                        /*Tất cả request gọi lên đều phải xác thực*/
                .anyRequest().authenticated();
        /*Cấu hình remeber me*/
        http.authorizeRequests().and().rememberMe()
                .tokenRepository(persistentTokenRepository())
                .tokenValiditySeconds(60*60*24);
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl inMemoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return inMemoryTokenRepository;
    }
}
