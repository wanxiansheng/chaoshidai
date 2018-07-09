package cn.boomers.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//handler���Ǵ�����������Ҫִ��Handler����ֻ��method��
		
		//�������쳣����
		//������쳣������ϵͳ�Զ�����쳣��ֱ��ȡ���쳣��Ϣ���ڴ���ҳ��չ��
//		String message = null;
//		if(ex instanceof CustomException){
//			message = ((CustomException)ex).getMessage();
//		}else{
//			//������쳣���Ͳ���ϵͳ�Զ�����쳣������һ���Զ�����쳣���ͣ���ϢΪ��δ֪���󡱣�
//			message="δ֪����";
//		}
		//�ϱߵĴ����Ϊ
		CustomException customException = null;
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			customException=new CustomException("δ֪����");
		}
		
		//������Ϣ
		String message = customException.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		
		//��������Ϣ����ҳ��
		modelAndView.addObject("message", message);
		
		//ָ�����ҳ��
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}
