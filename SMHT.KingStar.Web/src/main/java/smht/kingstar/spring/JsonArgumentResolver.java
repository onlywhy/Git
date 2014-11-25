package smht.kingstar.spring;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import javax.servlet.ServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

public class JsonArgumentResolver implements WebArgumentResolver
{
	public Object resolveArgument(MethodParameter parameter, NativeWebRequest webRequest) throws Exception {
		Object model = null;
	/*	if (parameter.getParameterType().equals(ShitiModel.class)) {
			model = new ShitiModel();
		}else if (parameter.getParameterType().equals(ZhishidianModel.class)) {
			model = new ZhishidianModel();
		}else if (parameter.getParameterType().equals(LianxiXiaotiModel.class)) {
			model = new LianxiXiaotiModel();
		}*/
		
		
        if(model!=null){
			Field[] fields = model.getClass().getDeclaredFields(); 
			ServletRequest req = (ServletRequest) webRequest.getNativeRequest();
			
			
			for(int j=0 ; j<fields.length ; j++){//遍历所有属性
				Field field = fields[j]; 
                String name = field.getName();    //获取属性的名字            
                Type type = field.getGenericType();//获取属性的类型
                String val = req.getParameter(name);
            	if(val != null)
            		val = val.trim();
                if(type.equals(String.class)){
                	PropertyDescriptor pd = new PropertyDescriptor(field.getName(), model.getClass());
                	Method m = pd.getWriteMethod();//获得写方法
                    m.invoke(model,val);
                }else if(type.equals(Long.class) || type.equals(long.class)){ 
                	if(val != null && val != "")
                	{
	                	PropertyDescriptor pd = new PropertyDescriptor(field.getName(), model.getClass());
	                	Method m = pd.getWriteMethod();//获得写方法
	                    m.invoke(model,Long.parseLong(val));
                	}
                }else if(type.equals(Integer.class) || type.equals(int.class)){ 
                	if(val != null && val != "")
                	{
	                	PropertyDescriptor pd = new PropertyDescriptor(field.getName(), model.getClass());
	                	Method m = pd.getWriteMethod();//获得写方法
	                    m.invoke(model,Integer.parseInt(val));
                	}
                }else if(type.equals(Boolean.class) || type.equals(boolean.class)){
                	if(val != null && val != "")
                	{
	                	PropertyDescriptor pd = new PropertyDescriptor(field.getName(), model.getClass());
	                	Method m = pd.getWriteMethod();//获得写方法
	                    m.invoke(model,Boolean.parseBoolean(val));
                	}
                }
            }
		    return model;
        }
		return UNRESOLVED;
	}

}