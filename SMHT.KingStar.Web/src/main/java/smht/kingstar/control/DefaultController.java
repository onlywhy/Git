package smht.kingstar.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smht.kingstar.entities.tables.records.UserInfoRecord;

@Controller
public class DefaultController extends BaseController {

	@RequestMapping("/index.html")
	public ModelAndView index(){
		
		UserInfoRecord userInfoRecord = new UserInfoRecord();
		userInfoRecord.setUserCd("000000001");
		userInfoRecord.setUserMm("111111111");
		userInfoRecord.setUserNm("уек╪2");		
		boolean bool = this.getUserInfoService().checkUser(userInfoRecord);
		logger.debug(bool);	
		return new ModelAndView("index");
	}
}
