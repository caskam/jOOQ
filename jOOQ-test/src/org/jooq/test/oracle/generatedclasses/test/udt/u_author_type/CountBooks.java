/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
public class CountBooks extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1510403668;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord> SELF = createParameter("SELF", org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public CountBooks() {
		super("COUNT_BOOKS", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter to the routine
	 */
	public void setSelf(org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord value) {
		setValue(SELF, value);
	}

	/**
	 * Set the <code>SELF</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSelf(org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord> field) {
		setField(SELF, field);
	}
}
