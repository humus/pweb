package sidep.pweb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import sidep.pweb.mvc.MVCConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import sidep.pweb.globalconf.PWebConfiguration;

public class PWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        /*
        //ServletRegistration.Dynamic = servletContext.addServlet("myservletname", "MyServletClass");
        //registration.setLoadOnStartup(int);
        //registration.addMapping("/mymapping")
        */
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MVCConfig.class };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { PWebConfiguration.class };
    }

    @Override
    protected String[]  getServletMappings() {
        return new String[] { "/" };
    }
    
}
