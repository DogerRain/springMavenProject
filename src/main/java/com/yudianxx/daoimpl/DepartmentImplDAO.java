package com.yudianxx.daoimpl;

import com.yudianxx.bean.Department;
import com.yudianxx.dao.DepartmentDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class DepartmentImplDAO implements DepartmentDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Department> queryDepartment() throws SQLException {
        Connection conn = dataSource.getConnection();

        String sql = "SELECT borrowId,borrowTitle,bidNo FROM cg_bid;\n";
        Statement smt = conn.createStatement();

        ResultSet rs = smt.executeQuery(sql);
        List<Department> list = new ArrayList<Department>();
        while (rs.next()) {
            String deptId = rs.getString("borrowId");
            String deptNo = rs.getString("borrowTitle");
            String deptName = rs.getString("bidNo");
            Department dept = new Department(deptId, deptNo, deptName);
            list.add(dept);
        }
        return list;
    }

}
