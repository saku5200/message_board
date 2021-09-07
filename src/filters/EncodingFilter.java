package filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class EncodingFilter
 */
@WebServlet("/*")
public class EncodingFilter extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public EncodingFilter() {
        super();

    }


    public void destroy() {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            chain.doFilter(request,response );
    }

    public void init(FilterConfig fConfig)throws ServletException{

    }

}
