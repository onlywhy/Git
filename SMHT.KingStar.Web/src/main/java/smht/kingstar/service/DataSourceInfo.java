package smht.kingstar.service;

import javax.sql.DataSource;

import org.jooq.SQLDialect;

public class DataSourceInfo {
	private DataSource dataSource;
    public final void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public DataSource getDataSource() {
        return this.dataSource;
    }
    
    private SQLDialect sqlDialect;
	public SQLDialect getSqlDialect() {
		return sqlDialect;
	}
	public void setSqlDialect(SQLDialect sqlDialect) {
		this.sqlDialect = sqlDialect;
	}
}
