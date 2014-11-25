package smht.kingstar.service.impl;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import smht.kingstar.entities.tables.records.UserInfoRecord;
import smht.kingstar.service.IUserInfoService;
import static smht.kingstar.entities.Tables.USER_INFO;

@Repository
public class UserInfoServiceImpl extends BaseServiceImpl implements IUserInfoService{

	@Override
	public boolean checkUser(UserInfoRecord userInfoRecord) {
		// TODO Auto-generated method stub
		DSLContext create = DSL.using(this.getDataSource(),this.getSqlDialect());
		int ret = create.insertInto(USER_INFO)
						.set(USER_INFO.USER_CD,userInfoRecord.getUserCd())
						.set(USER_INFO.USER_NM,userInfoRecord.getUserNm())
						.set(USER_INFO.USER_MM,userInfoRecord.getUserMm()).execute();
		if(ret > 0){
			List<UserInfoRecord> ret2 =create.selectFrom(USER_INFO).fetchInto(UserInfoRecord.class);
			if(ret2 != null){
				System.out.println(ret2);
			}
		}
		return false;
	}

}
