import builder.SqlQueryBuilder;

public class SqlBuilder {
    public static void main(String[] args) {
        String query = new SqlQueryBuilder()
                .select()
                .select("town_to")
                .dateDiff("time_out", "time_in").as("flight_time")
                .from("trip")
                .where("town_from").equal("'Paris'")
                .get();
        System.out.println(query);
    }

//Company Компании, осуществляющие авиаперелёты
//Passenger Пассажиры, купившие билет
//Pass_in_trip Таблица, связующая купленные билеты с пассажирами
//Trip Купленные билеты
}
