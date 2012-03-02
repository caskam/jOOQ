/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Uspgetwhereusedproductid extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1346701541;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> STARTPRODUCTID = createParameter("StartProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> CHECKDATE = createParameter("CheckDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public Uspgetwhereusedproductid() {
		super("uspGetWhereUsedProductID", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO);

		addInParameter(STARTPRODUCTID);
		addInParameter(CHECKDATE);
	}

	/**
	 * Set the <code>StartProductID</code> parameter to the routine
	 */
	public void setStartproductid(java.lang.Integer value) {
		setValue(STARTPRODUCTID, value);
	}

	/**
	 * Set the <code>CheckDate</code> parameter to the routine
	 */
	public void setCheckdate(java.sql.Timestamp value) {
		setValue(CHECKDATE, value);
	}
}
