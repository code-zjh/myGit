package com.dami.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieUtils {
	public static void addCookie(String search, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		String str = getCookie(request);
		
		if (str == ""||str==null) {
			str = search;
		} else {
			if (!str.contains(search)) {
				String[] split = str.split("#");
				if(split.length == 3) {
					str = split[1] + "#" + split[2];
				}
				
				str += "#" + search;
			}
			
		}
		System.out.println("添加cookie"+str);
		Cookie coo = new Cookie("search", URLEncoder.encode(str,"UTF-8"));
		coo.setMaxAge(60 * 60);
		coo.setPath("/");
		response.addCookie(coo);
	}

	public static String getCookie(HttpServletRequest request) throws UnsupportedEncodingException {
		String str = "";
		Cookie[] cook = request.getCookies();
		if (!(cook == null || cook.length == 0)) {
			for (Cookie co : cook) {
				if (co.getName().equals("search")) {
					str = URLDecoder.decode(co.getValue(),"UTF-8");
				}
			}
		}
		System.out.println("str=="+str);
		return str;

	}
}
