package domain.query;
import domain.query.queryPart.Field;
import domain.query.queryPart.QueryPart;
import domain.query.queryPart.Table;

import java.util.List;
import java.util.stream.Collectors;

public class Query {
//    названия таблиц, из которых необходимо извлечь данные;
//    поля, значения которых требуется вернуть к исходным после внесения изменений в БД;
//    связи между таблицами;
//    условия выборки;
//    вспомогательные критерии отбора (ограничения, способы представления информации, тип сортировки).

    private List<Field> fieldList;
    private Table table;

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        String fields = joinString(", ", fieldList);
        return "SELECT " + fields + " From " + table;
    }

    private String joinString(String delimiter, List<? extends QueryPart> parts) {
        List<String> strings = parts.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
        return String.join(delimiter, strings);
    }
}
