package day36jdbc;
import javax.xml.validation.Schema;
import java.sql.*;

public class Practice {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain", "techpro", "12345");

//        execQuery(con);
//        System.out.println(additionf(con, 17,15));
//        System.out.println(findmin(con,15,5));
//        System.out.println(getName(con,15));
//        System.out.println(increaseId(con,"LEO OCEAN"));
        System.out.println(withdraw(con,109, 1000.0));
        con.close();
    }

    static void execQuery (Connection con) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from companies");
        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
        }
        System.out.println();
        rs.close();
        st.close();
    }
    static int additionf (Connection con, int a, int b) throws SQLException {

        String sql = "{ ? = call additionf(?,?) }";
        CallableStatement cs = con.prepareCall(sql);

        cs.registerOutParameter(1,Types.INTEGER);
        cs.setInt(2,a);
        cs.setInt(3,b);

        cs.execute();
        int result = cs.getInt(1);
        cs.close();
        return result;
    }
    static int findmin (Connection con, int a, int b) throws SQLException {
        String sql = "{call findmin(?,?,?)}";
        CallableStatement cs = con.prepareCall(sql);

        cs.setInt(1,a);
        cs.setInt(2,b);
        cs.registerOutParameter(3,Types.INTEGER);

        cs.execute();

        int result = cs.getInt(3);
        cs.close();

        return result;

    }
    static String getName (Connection con, int id) throws SQLException {
        CallableStatement cs = con.prepareCall("{call getname(?,?)}");

        cs.setInt(1,id);
        cs.registerOutParameter(2,Types.VARCHAR);

        cs.execute();

        String result = cs.getString(2);

        cs.close();

        return result;

    }
    static int increaseId (Connection con, String name) throws SQLException {
        CallableStatement cs = con.prepareCall("{call increaseId(?,?)}");

        cs.setString(1,name);
        cs.registerOutParameter(2,Types.INTEGER);

        cs.execute();

        int id = cs.getInt(2);

        con.close();
        return id;
    }
    static double withdraw (Connection con, int id, Double amount) throws SQLException {
        CallableStatement cs = con.prepareCall("{call withdraw(?,?,?)}");

        cs.setInt(1,id);
        cs.setDouble(2,amount);
        cs.registerOutParameter(3,Types.DECIMAL);

        cs.execute();

        Double balance = cs.getDouble(3);
        cs.close();
        return balance;
    }
}
