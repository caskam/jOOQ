/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.routines;

/**
 * This class is generated by jOOQ.
 */
public class Uspupdateemployeepersonalinfo extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2090327500;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> EMPLOYEEID = createParameter("EmployeeID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> NATIONALIDNUMBER = createParameter("NationalIDNumber", org.jooq.impl.SQLDataType.NVARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> BIRTHDATE = createParameter("BirthDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> MARITALSTATUS = createParameter("MaritalStatus", org.jooq.impl.SQLDataType.NCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> GENDER = createParameter("Gender", org.jooq.impl.SQLDataType.NCHAR);

	/**
	 * Create a new routine call instance
	 */
	public Uspupdateemployeepersonalinfo() {
		super("uspUpdateEmployeePersonalInfo", org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES);

		addInParameter(EMPLOYEEID);
		addInParameter(NATIONALIDNUMBER);
		addInParameter(BIRTHDATE);
		addInParameter(MARITALSTATUS);
		addInParameter(GENDER);
	}

	/**
	 * Set the <code>EmployeeID</code> parameter to the routine
	 */
	public void setEmployeeid(java.lang.Integer value) {
		setValue(EMPLOYEEID, value);
	}

	/**
	 * Set the <code>NationalIDNumber</code> parameter to the routine
	 */
	public void setNationalidnumber(java.lang.String value) {
		setValue(NATIONALIDNUMBER, value);
	}

	/**
	 * Set the <code>BirthDate</code> parameter to the routine
	 */
	public void setBirthdate(java.sql.Timestamp value) {
		setValue(BIRTHDATE, value);
	}

	/**
	 * Set the <code>MaritalStatus</code> parameter to the routine
	 */
	public void setMaritalstatus(java.lang.String value) {
		setValue(MARITALSTATUS, value);
	}

	/**
	 * Set the <code>Gender</code> parameter to the routine
	 */
	public void setGender(java.lang.String value) {
		setValue(GENDER, value);
	}
}
