package org.medical.prescription;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        List<String> a = Arrays.asList(new String[]{"Authorization", "Cache-Control", "Content-Type"});
        corsConfiguration.setAllowedHeaders(a);
        List<String> b = Arrays.asList(new String[]{"allowedOriginPatterns"});
        corsConfiguration.setAllowedOrigins(b);
        List<String> c = Arrays.asList(new String[]{"GET", "POST", "PUT", "DELETE", "PUT","OPTIONS","PATCH", "DELETE"});
        corsConfiguration.setAllowedMethods(c);
        corsConfiguration.setAllowCredentials(true);
        List<String> d = Arrays.asList(new String[]{"Authorization"});
        corsConfiguration.setExposedHeaders(d);

        // You can customize the following part based on your project, it's only a sample
        http.authorizeRequests().antMatchers("/**").permitAll().anyRequest()
                .authenticated().and().csrf().disable().cors().configurationSource(request -> corsConfiguration);

    }

    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowCredentials(true);
    }*/
    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        List<String> a = Arrays.asList(new String[]{"Authorization", "Cache-Control", "Content-Type"});
        corsConfiguration.setAllowedHeaders(a);
        List<String> b = Arrays.asList(new String[]{"allowedOriginPatterns"});
        corsConfiguration.setAllowedOrigins(b);
        List<String> c = Arrays.asList(new String[]{"GET", "POST", "PUT", "DELETE", "PUT","OPTIONS","PATCH", "DELETE"});
        corsConfiguration.setAllowedMethods(c);
        corsConfiguration.setAllowCredentials(true);
        List<String> d = Arrays.asList(new String[]{"Authorization"});
        corsConfiguration.setExposedHeaders(d);

        // You can customize the following part based on your project, it's only a sample
        http.authorizeRequests().antMatchers("/**").permitAll().anyRequest()
                .authenticated().and().csrf().disable().cors().configurationSource(request -> corsConfiguration);

    }*/
   /* @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        //регистрация конфигов
        webCtx.setServletContext(servletContext);

        addEncodingFilter(servletContext);
        addCORSFilter(servletContext);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webCtx);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
        servlet.setLoadOnStartup(1);
    }

    */
    /*private void addCORSFilter(ServletContext servletContext) {
        FilterRegistration.Dynamic registrationCORS = servletContext.addFilter("CORS", CORSFilter.class);
        registrationCORS.setInitParameter("cors.allowOrigin", "*");
        registrationCORS.setInitParameter("cors.supportsCredentials", "false");
        registrationCORS.setInitParameter("cors.supportedHeaders", "*");
        registrationCORS.setInitParameter("cors.exposedHeaders", "Authentication");
        registrationCORS.setInitParameter("cors.supportedMethods", "GET, POST, HEAD, PUT, DELETE, OPTIONS");
        registrationCORS.addMappingForUrlPatterns(null, true, "/*");
    }

    protected void addEncodingFilter(ServletContext servletContext) {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        FilterRegistration.Dynamic registrationEncoding = servletContext.addFilter("EncodingFilter", encodingFilter);
        registrationEncoding.addMappingForUrlPatterns(null, true, "/*");
    }*/

}
