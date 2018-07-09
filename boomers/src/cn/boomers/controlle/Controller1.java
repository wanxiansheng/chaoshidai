package cn.boomers.controlle;




import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;






import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.boomers.exception.CustomException;
import cn.boomers.po.Users;
import cn.boomers.service.UserService;


@Controller
public class Controller1
{
	@Autowired
	private UserService userService;
	
	//登录页面
	@RequestMapping("/login")
	public String login() throws Exception{
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() throws Exception{
		return "index";
	}
	
	
	
	//查询商品信息，输出json
	///itemsView/{id}里面的{id}表示将这个位置的参数传到@PathVariable指定名称中。
	/*@RequestMapping("/itemsView/{id}")
	public @ResponseBody ItemsCustom itemsView(@PathVariable("id") Integer id)throws Exception{
		//调用service查询商品信息
		ItemsCustom itemsCustom = userService.findItemsById(id);
		
		return itemsCustom;
	}*/
	
}

