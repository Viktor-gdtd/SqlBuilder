package builder;

import domain.SqlQuery;

public class SqlQueryBuilder {
    private SqlQuery query;

    public SqlQueryBuilder select(String ... fields) {
        query = new SqlQuery();
        query.setQueryType(String.format("SELECT %s", String.join(", ", fields)));
        return this;
    }

    public SqlQueryBuilder distinct(String fieldName) {
        query.addFields(String.format("DISTINCT %s ", fieldName));
        return this;
    }

    public SqlQueryBuilder count(String fieldName) {
        query.addFields(String.format("COUNT %s ", fieldName));
        return this;
    }

    public SqlQueryBuilder selectAll() {
        query = new SqlQuery();
        query.addFields("*");
        return this;
    }

    public SqlQueryBuilder as(String alias) {
        query.addAlias(alias);
        return this;
    }

    public SqlQueryBuilder dateDiff(String dataFrom, String dataTo) {
        query.dateDiff(dataFrom, dataTo);
        return this;
    }

    public JoinBuilder join(String tableName) {
        return new JoinBuilder(this, tableName);
    }

    public SqlQueryBuilder from(String tableName) {
        query.setTableName(tableName);
        return this;
    }

    public Condition where(String fieldName) {
        return new Condition(new WhereBuilder(this), fieldName);
    }


    public String get() {
        return query.toString();
    }

    protected SqlQueryBuilder applyWhere (String condition) {
        query.addCondition(condition);
        return this;
    }
    protected SqlQueryBuilder applyJoin (String tableName, String condition) {
        query.joinTable(tableName, condition);
        return this;
    }
}
