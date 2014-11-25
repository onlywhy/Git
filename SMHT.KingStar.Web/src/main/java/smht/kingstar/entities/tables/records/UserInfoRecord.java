/**
 * This class is generated by jOOQ
 */
package smht.kingstar.entities.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoRecord extends org.jooq.impl.UpdatableRecordImpl<smht.kingstar.entities.tables.records.UserInfoRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -448020734;

	/**
	 * Setter for <code>smht.user_info.user_id</code>.
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>smht.user_info.user_id</code>.
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>smht.user_info.user_nm</code>.
	 */
	public void setUserNm(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>smht.user_info.user_nm</code>.
	 */
	public java.lang.String getUserNm() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>smht.user_info.user_cd</code>.
	 */
	public void setUserCd(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>smht.user_info.user_cd</code>.
	 */
	public java.lang.String getUserCd() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>smht.user_info.user_mm</code>.
	 */
	public void setUserMm(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>smht.user_info.user_mm</code>.
	 */
	public java.lang.String getUserMm() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return smht.kingstar.entities.tables.UserInfo.USER_INFO.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return smht.kingstar.entities.tables.UserInfo.USER_INFO.USER_NM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return smht.kingstar.entities.tables.UserInfo.USER_INFO.USER_CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return smht.kingstar.entities.tables.UserInfo.USER_INFO.USER_MM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUserNm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUserCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getUserMm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRecord value1(java.lang.Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRecord value2(java.lang.String value) {
		setUserNm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRecord value3(java.lang.String value) {
		setUserCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRecord value4(java.lang.String value) {
		setUserMm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfoRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserInfoRecord
	 */
	public UserInfoRecord() {
		super(smht.kingstar.entities.tables.UserInfo.USER_INFO);
	}

	/**
	 * Create a detached, initialised UserInfoRecord
	 */
	public UserInfoRecord(java.lang.Integer userId, java.lang.String userNm, java.lang.String userCd, java.lang.String userMm) {
		super(smht.kingstar.entities.tables.UserInfo.USER_INFO);

		setValue(0, userId);
		setValue(1, userNm);
		setValue(2, userCd);
		setValue(3, userMm);
	}
}
