/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingServiceSP;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author akifraza
 */
@WebService(serviceName = "callSP")
@Stateless()
public class callSP {

    /**
     * Web service operation
     *
     * @param Name
     * @return
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "getSpResult")
    public ArrayList<callSPModel> getSpResult(@WebParam(name = "empId") String empId) throws Exception {
        String result = "";
        //TODO write your implementation code here:
        ArrayList<callSPModel> tmm = new ArrayList<>();
        callSPModel cspm = new callSPModel();
        try {
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
            CallableStatement proc = conn.prepareCall("{ call get_emp_name(?, ?, ?, ?, ?, ?)}");
            proc.setString(1, empId);
            proc.registerOutParameter(2, Types.VARCHAR);
            proc.registerOutParameter(3, Types.VARCHAR);
            proc.registerOutParameter(4, Types.VARCHAR);
            proc.registerOutParameter(5, Types.VARCHAR);
            proc.registerOutParameter(6, Types.VARCHAR);
            proc.execute();
            //System.out.println ("Output : " + proc.getString(2));
            cspm.setEmployeeNumber(empId);
            cspm.setEmployeeName(proc.getString(3));
            cspm.setHireDate(proc.getString(2));
            cspm.setDeptName(proc.getString(4));
            cspm.setPlace(proc.getString(5));
            cspm.setJobDesc(proc.getString(6));
            tmm.add(cspm);
            proc.close();
            st.close();
            conn.close();
        } catch (SQLException SQLexp) {

            cspm.setEmployeeName(SQLexp.getMessage());
            tmm.add(cspm);
        }
        return tmm;
    }

    public static Connection getOracleConnection() throws Exception {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.1.15:1521:orcl";
        String username = "scott";
        String password = "tiger";

        Class.forName(driver); // load Oracle driver
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

}
