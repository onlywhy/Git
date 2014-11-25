package smht.kingstar.service;

import java.io.Serializable;

public class ServiceException extends Exception {
	private String _code = null;
	
	public ServiceException(String code, String msg)
	{
		super(msg);
		this._code = code;
	}
	
	public ServiceException(String msg)
	{
		super(msg);
	}
	public ServiceException(Exception e){
		super(e);
	}
	public void setCode(String _code) {
		this._code = _code;
	}

	public String getCode() {
		return _code;
	}
	
	public static final String EXCEPTION_NOT_PERMISSIONS_CODE =  "000001"; // 权限不够
	public static final String EXCEPTION_NOT_A_SHIJUAN_CODE =  "000002"; // 该试卷不是A卷
	public static final String EXCEPTION_EXIST_B_SHIJUAN_CODE =  "000003"; // 该试卷已存在B卷
	public static final String EXCEPTION_NOT_NULL_PAGE_CODE =  "000004"; // 分页信息不能为空
	public static final String EXCEPTION_CHENGJI_IMPORT_NONUMBER =  "000004"; // 成绩导入学号为空
	public static final String EXCEPTION_SHITI_NO_XUANXIANG =  "000005"; // 试题没有选项
	public static final String EXCEPTION_SHITI_NO_TINGXING =  "000006"; // 试题没有题型
}
