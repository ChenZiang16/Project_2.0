package com.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.biz.common.Connect;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index extends BaseController{

	
	@Autowired
	private UserService userService;

	@Reference
    private Connect connect;

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "login";
	}
	

    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request,HttpServletResponse response){
    	
    	String name = request.getParameter("username");
    	String password =request.getParameter("password");
    	
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
        		name,password);
        //usernamePasswordToken.setRememberMe(true);
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        
        SavedRequest savedRequest = WebUtils.getSavedRequest(request);
        //默认跳转路径
        String url = "success";
        //跳回原路径
        if(savedRequest !=null){
        	url = "redirect:" +savedRequest.getRequestUrl().substring(11);
        }

        return url;
    }
    
	@RequestMapping(value="/menus",method=RequestMethod.GET)
	public String menus(){
        System.out.println("macos \n request for menus enters ...");
		return "menus";
	}
	
	@RequestMapping(value="/head",method=RequestMethod.GET)
	public String head(){
		return "head";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(){
		return "home";
	}
    
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String error(){
		return "error";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String success(){
		return "success";
	}

	@GetMapping(value = "/dubboTest")
    @ResponseBody
	public String dubboTest(HttpServletRequest request,HttpServletResponse response){
        System.out.println("enter the service ...");
		return connect.sayHello(request.getParameter("name"));
	}

}
