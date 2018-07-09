package cn.boomers.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.boomers.po.Users;

public class LoginInterceptor implements HandlerInterceptor {

	//ִ��Handler���ִ�д˷���
	//Ӧ�ó�����ͳһ�쳣����ͳһ��־����
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	//����Handler����֮�󣬷���modelAndView֮ǰִ��
	//Ӧ�ó�����modelAndView����������˾��ģ�����ݣ�����˵������������ﴫ����ͼ��Ҳ����������ͳһָ����ͼ
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}
	
	//����Handler����֮ǰִ��
	//�������֤��֤�������Ȩ
	//���������֤�������֤��ͨ����ʾ��ǰ�û�û�е�¼����Ҫ�˷����������ز�������ִ��
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		//��ȡ�����url
		
		String url = request.getRequestURI();
		//�ж�url�Ƿ��ǹ�����ַ��ʵ��ʹ��ʱ��������ַ���������ļ��У�
		//���﹫����ַ�ǵ�¼�ύ�ĵ�ַ
		if(url.indexOf("index")>=0){
			//���������ҳ������
			return true;
		}else if(url.indexOf("isLogin")>=0){
			//������е�¼�ύ������
			return true;
		}else if(url.indexOf("insert")>=0){
			//�������ע�ᣬ����
			return true;
		}else if(url.indexOf("login")>=0){
			//��������¼ҳ�棬����
			return true;
		}
		
		/*//�ж�session
		HttpSession session = request.getSession();
		//��session��ȡ���û������Ϣ
		String username = (String) session.getAttribute("username");
		
		if(username!=null && username!=""){
			return true;
		}*/
		//�ж�session
		HttpSession session = request.getSession();
		//��session��ȡ���û������Ϣ
		Users user = (Users) session.getAttribute("user");
		
		if(user!=null){
			if(user.getUsername()!=null && user.getUsername()!=""){
				return true;
			}
		}
		
		//ִ�������ʾ�û������Ҫ��֤����ת��¼ҳ��
		request.getRequestDispatcher("index").forward(request, response);
		return false;
	}

}
