package cn.boomers.controlle;



import java.util.List;





import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.boomers.po.Users;
import cn.boomers.service.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	
	/*@RequestMapping("/isLogin")
	public String isLogin(Users users,Model model,HttpSession session) throws Exception{
		Users user = userService.isLogin(users);
		if(user!=null){
			session.setAttribute("user", user);
			return "redirect:/index";
		}else{
			return "redirect:/index";
		}
	}*/
	@RequestMapping("/isLogin")
	public String isLogin(Users users,Model model,HttpSession session) throws Exception{
			session.setAttribute("user", users);
			if(userService.isLogin(users)!=null) {
			   Users b = userService.isLogin(users);
			   return "redirect:/index";
			}
			return "error";
	}
	
	@RequestMapping("/insert")
	public String insert(Users users,Model model,HttpSession session) throws Exception{
		      System.out.println("Á¢¼´×¢²á");
			   if(users.getUsername()!=null && users.getUsername()!="" && users.getUserpassword()!=null && users.getUserpassword()!="") {
			      userService.insert(users);
			      return "redirect:/index";
			   }
			   return "error";
	}
	
	//ÍË³ö
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception
	{
		//Çå³ýsession
		session.invalidate();
		return "redirect:/index";
	}
	
}

