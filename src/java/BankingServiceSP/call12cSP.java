/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingServiceSP;

import static BankingServiceSP.callSP.getOracleConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author akifraza
 */
@WebService(serviceName = "call12cSP")
@Stateless()
public class call12cSP {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmployeeData")
    public ArrayList<call12SPModel> getEmployeeData(@WebParam(name = "empID") String empID) throws Exception {
        //TODO write your implementation code here:
        ArrayList<call12SPModel> tmm = new ArrayList<>();
        call12SPModel cspm12 = new call12SPModel();

        Connection conn = getOracleConnection();
        System.out.println("Got Connection.");
        Statement st = conn.createStatement();
        //    st.executeUpdate("drop table survey;");
        //    st.executeUpdate("create table survey (id int,name varchar(30));");
        //    st.executeUpdate("insert into survey (id,name ) values (1,'nameValue')");

//        DatabaseMetaData md = conn.getMetaData();
//        ResultSet rs = md.getTables(null, null, "%", null);
//        while (rs.next()) {
//            System.out.println(rs.getString(3));
//        }
        CallableStatement proc = conn.prepareCall("{ call get_emp_data(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        proc.setString(1, empID);
        proc.registerOutParameter(2, Types.VARCHAR);
        proc.registerOutParameter(3, Types.VARCHAR);
        proc.registerOutParameter(4, Types.VARCHAR);
        proc.registerOutParameter(5, Types.VARCHAR);
        proc.registerOutParameter(6, Types.VARCHAR);
        proc.registerOutParameter(7, Types.NUMERIC);
        proc.registerOutParameter(8, Types.FLOAT);
        proc.registerOutParameter(9, Types.VARCHAR);
        proc.registerOutParameter(10, Types.VARCHAR);
        proc.registerOutParameter(11, Types.VARCHAR);
        proc.registerOutParameter(12, Types.VARCHAR);
        proc.registerOutParameter(13, Types.VARCHAR);
        proc.execute();
        cspm12.setFULL_NAME(proc.getString(2));
        
    return tmm ;
}

public static Connection getOracleConnection() throws Exception {
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//192.168.1.20:1521/orcl");
        ods.setUser("scott");
        ods.setPassword("oracle");
        Connection conn = ods.getConnection();
        return conn;
    }
}
