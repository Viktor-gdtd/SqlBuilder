import builder.SqlQueryBuilder;
import domain.query.Query;

public class SqlBuilder {
    public static void main(String[] args) {
        Query query = new SqlQueryBuilder()
                .select().all()
                .from("trip")
                .where("town_from").equal("Moscow")
                .build();

        System.out.println(query);
    }

//Company Компании, осуществляющие авиаперелёты
//Passenger Пассажиры, купившие билет
//Pass_in_trip Таблица, связующая купленные билеты с пассажирами
//Trip Купленные билеты
}
