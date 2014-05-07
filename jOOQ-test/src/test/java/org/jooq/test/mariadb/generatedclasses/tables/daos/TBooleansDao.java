/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleansDao extends org.jooq.impl.DAOImpl<org.jooq.test.mariadb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans, java.lang.Integer> {

	/**
	 * Create a new TBooleansDao without any configuration
	 */
	public TBooleansDao() {
		super(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans.class);
	}

	/**
	 * Create a new TBooleansDao with an attached configuration
	 */
	public TBooleansDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.ID, value);
	}

	/**
	 * Fetch records that have <code>one_zero IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByOneZero(org.jooq.test.all.converters.Boolean_10... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.ONE_ZERO, values);
	}

	/**
	 * Fetch records that have <code>true_false_lc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByTrueFalseLc(org.jooq.test.all.converters.Boolean_TF_LC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.TRUE_FALSE_LC, values);
	}

	/**
	 * Fetch records that have <code>true_false_uc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByTrueFalseUc(org.jooq.test.all.converters.Boolean_TF_UC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.TRUE_FALSE_UC, values);
	}

	/**
	 * Fetch records that have <code>yes_no_lc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByYesNoLc(org.jooq.test.all.converters.Boolean_YES_NO_LC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.YES_NO_LC, values);
	}

	/**
	 * Fetch records that have <code>yes_no_uc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByYesNoUc(org.jooq.test.all.converters.Boolean_YES_NO_UC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.YES_NO_UC, values);
	}

	/**
	 * Fetch records that have <code>y_n_lc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByYNLc(org.jooq.test.all.converters.Boolean_YN_LC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.Y_N_LC, values);
	}

	/**
	 * Fetch records that have <code>y_n_uc IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByYNUc(org.jooq.test.all.converters.Boolean_YN_UC... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.Y_N_UC, values);
	}

	/**
	 * Fetch records that have <code>vc_boolean IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByVcBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.VC_BOOLEAN, values);
	}

	/**
	 * Fetch records that have <code>c_boolean IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByCBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.C_BOOLEAN, values);
	}

	/**
	 * Fetch records that have <code>n_boolean IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mariadb.generatedclasses.tables.pojos.TBooleans> fetchByNBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.test.mariadb.generatedclasses.tables.TBooleans.N_BOOLEAN, values);
	}
}
