package builder;

public class WhereBuilder extends ContainsCondition{
    private SqlQueryBuilder sqlQueryBuilder;

    public WhereBuilder(SqlQueryBuilder sqlQueryBuilder) {
        this.sqlQueryBuilder = sqlQueryBuilder;
    }

    @Override
    SqlQueryBuilder addCondition(String condition) {
        return sqlQueryBuilder.applyWhere(condition);
    }
}
