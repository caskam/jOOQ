/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1003218271;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("in1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> OUT1 = createParameter("out1", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> OUT2 = createParameter("out2", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("p_unused", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>in1</code> parameter to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(IN1, value);
	}

	/**
	 * Set the <code>out2</code> parameter to the routine
	 */
	public void setOut2(java.lang.Boolean value) {
		setValue(OUT2, value);
	}

	public java.lang.Boolean getOut1() {
		return getValue(OUT1);
	}

	public java.lang.Boolean getOut2() {
		return getValue(OUT2);
	}
}
