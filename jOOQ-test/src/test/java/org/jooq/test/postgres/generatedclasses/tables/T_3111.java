/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3111 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record> {

	private static final long serialVersionUID = -768298040;

	/**
	 * The singleton instance of <code>public.t_3111</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_3111 T_3111 = new org.jooq.test.postgres.generatedclasses.tables.T_3111();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record.class;
	}

	/**
	 * The column <code>public.t_3111.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.t_3111.inverse</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record, java.lang.Integer> INVERSE = createField("inverse", org.jooq.impl.SQLDataType.INTEGER, this, "", new org.jooq.test.all.converters.T_3111_InverseConverter());

	/**
	 * The column <code>public.t_3111.bool1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record, java.lang.Integer> BOOL1 = createField("bool1", org.jooq.impl.SQLDataType.BOOLEAN, this, "", new org.jooq.test.all.converters.T_3111_Bool1Converter());

	/**
	 * The column <code>public.t_3111.bool2</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record, java.lang.Integer> BOOL2 = createField("bool2", org.jooq.impl.SQLDataType.BOOLEAN, this, "", new org.jooq.test.all.converters.T_3111_Bool2Converter());

	/**
	 * Create a <code>public.t_3111</code> table reference
	 */
	public T_3111() {
		this("t_3111", null);
	}

	/**
	 * Create an aliased <code>public.t_3111</code> table reference
	 */
	public T_3111(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.T_3111.T_3111);
	}

	private T_3111(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record> aliased) {
		this(alias, aliased, null);
	}

	private T_3111(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_3111;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_3111);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_3111 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_3111(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.T_3111 rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_3111(name, null);
	}
}
