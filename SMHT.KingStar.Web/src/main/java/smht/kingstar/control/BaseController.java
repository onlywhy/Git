package smht.kingstar.control;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import smht.kingstar.context.KingStarWebAppContext;
import smht.kingstar.service.IUserInfoService;

public class BaseController implements ServletContextAware{
	Log logger = LogFactory.getLog(getClass());
	
	protected ServletContext servletContext;
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		this.servletContext = arg0;
	}
	private KingStarWebAppContext kingStarWebAppContext;
	@Autowired
	public void setKingStarWebAppContext(KingStarWebAppContext webContext) {
		this.kingStarWebAppContext = webContext;
	}
	
	public IUserInfoService getUserInfoService(){
		return this.kingStarWebAppContext.getUserInfoService();
	}
	

}
