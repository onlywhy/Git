package smht.kingstar.service.impl;

import javax.sql.DataSource;
import org.jooq.SQLDialect;

import smht.kingstar.service.DataSourceInfo;


public class BaseServiceImpl {

	private DataSourceInfo dataSourceInfo;
	
	public void setDataSourceInfo(DataSourceInfo dataSourceInfo) {
		this.dataSourceInfo = dataSourceInfo;
	}
	
    protected DataSource getDataSource() {
        return this.dataSourceInfo.getDataSource();
    }
    
	public SQLDialect getSqlDialect() {
		return this.dataSourceInfo.getSqlDialect();
	}
}
