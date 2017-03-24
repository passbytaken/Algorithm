package me.ele.napos.filter;

/**
 * Created by jakoo on 23/03/2017.
 */
public class AccessControlFilter {
    String referer = request.getHeader("Referer");
    if((refere != null)&&(referer.trim().startsWith("git.elenet"))) {
        chain.doFilter(request,referer);
    }
    else {
        request.getRequestDispacher("404.html").forward(request.response);
    }
}
