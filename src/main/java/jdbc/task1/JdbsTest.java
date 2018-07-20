//package jdbc.task1;
//
//import lombok.Cleanup;
//import lombok.SneakyThrows;
//import lombok.val;
//
//import java.sql.*;
//import java.util.ResourceBundle;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class JdbsTest {
//
//    private static String URL;
//    private static String user;
//    private static String password;
//
//    @SneakyThrows
//    public static void main(String[] args) {
//        getJdbcProperties();
//        @Cleanup Connection connection = DriverManager.getConnection(URL, user, password);
//        @Cleanup Statement statement = connection.createStatement();
//        statement.executeUpdate(createTabl());
//        @Cleanup PreparedStatement preparedStatement1 = connection.prepareStatement(insert());
//        preparedStatement1.setString(1,"'Jack London'");
//        preparedStatement1.setString(2,"'Martin Eden'");
//        preparedStatement1.setInt(3,2016);
//        preparedStatement1.execute();
//        @Cleanup PreparedStatement preparedStatement2 = connection.prepareStatement(insert());
//        preparedStatement2.setString(1,"'Leo Tolstoy'");
//        preparedStatement2.setString(2,"'War and Peace'");
//        preparedStatement2.setInt(3,1997);
//        preparedStatement2.execute();
//        @Cleanup PreparedStatement preparedStatement3 = connection.prepareStatement(updateDate());
//        preparedStatement3.setInt(1,2010);
//        preparedStatement3.setString(2,"'War and Peace'");
//        preparedStatement3.execute();
//        @Cleanup ResultSet resultSet = statement.executeQuery(selectAll());
//        while (resultSet.next())
//            System.out.printf("%s %s %d%n",
//                    resultSet.getString("author"),
//                    resultSet.getString("name"),
//                    resultSet.getInt("year of publication"));
//        statement.executeUpdate(delet());
//    }
//
//    private static void getJdbcProperties(){
//        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
//        URL = bundle.getString("URL");
//        user = bundle.getString("user");
//        password = bundle.getString("password");
//    }
//
//    private static String selectAll(){
//        return  "SELECT author, name, \"year of publication\" FROM books;";
//    }
//
//    private static String updateDate(){
//        return "UPDATE books SET \"year of publication\"=? WHERE name= ?;";
//    }
//
//    private static String insert(){
//        return "INSERT INTO books(author, name, \"year of publication\") VALUES (?, ?, ?);";
//    }
//
//    private static String delet(){
//        return "DELETE FROM books;";
//    }
//    private static String createTabl(){
//        return "CREATE TABLE books ( author text,  name text NOT NULL, \"year of publication\" integer, CONSTRAINT exlusive_name PRIMARY KEY (name))";
//    }
//}
