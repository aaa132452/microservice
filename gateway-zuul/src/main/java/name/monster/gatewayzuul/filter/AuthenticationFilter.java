package name.monster.gatewayzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName: AuthenticationFilter
 * @Description: 认证过滤器
 * @Author miaopeng
 * @Date 2019-08-23 17:13:48
 **/

@Component
public class AuthenticationFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        // Bearer + token（中间有空格）
        String authorization = request.getHeader("Authorization");
        if (authorization==null||authorization.isEmpty()){
            requestContext.setResponseStatusCode(401);
            requestContext.setSendZuulResponse(false);
            try {
                requestContext.getResponse().getWriter().write("Authorization is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
