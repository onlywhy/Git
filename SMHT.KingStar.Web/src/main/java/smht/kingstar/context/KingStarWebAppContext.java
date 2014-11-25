package smht.kingstar.context;

import smht.kingstar.service.IUserInfoService;

public class KingStarWebAppContext {
	private IUserInfoService userInfoService;

	public IUserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;

	}
}
