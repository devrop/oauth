package ropandi.oauth.config;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.util.UriComponentsBuilder;
import javax.servlet.http.Cookie;

public class CustomUrlAuthenticationSuccessHandler 
//implements AuthenticationSuccessHandler 
{
/*
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		handle(request, response, authentication);
        clearAuthenticationAttributes(request);
		
	}

	protected void handle(
	        HttpServletRequest request,
	        HttpServletResponse response, 
	        Authentication authentication
	) throws IOException {

	    String targetUrl = determineTargetUrl(authentication);

	    if (response.isCommitted()) {
	        logger.debug(
	                "Response has already been committed. Unable to redirect to "
	                        + targetUrl);
	        return;
	    }

	    redirectStrategy.sendRedirect(request, response, targetUrl);
	}
	
	protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
	    Optional<String> redirectUri = getCookie(request, "redirect_uri").map(Cookie::getValue);
	    /*
	    if(redirectUri.isPresent() && !isAuthorizedRedirectUri(redirectUri.get())) {
	        throw new BadRequestException();
	    }
	    

	    String targetUrl = redirectUri.get();

	    //String token = authentication.

	    return UriComponentsBuilder.fromUriString(targetUrl)
	            .queryParam("token", token)
	            .build().toUriString();
	}
	protected void clearAuthenticationAttributes(HttpServletRequest request) {
	    HttpSession session = request.getSession(false);
	    if (session == null) {
	        return;
	    }
	    session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}
	
	public static Optional<Cookie> getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return Optional.of(cookie);
                }
            }
        }

        return Optional.empty();
    }
*/
}
