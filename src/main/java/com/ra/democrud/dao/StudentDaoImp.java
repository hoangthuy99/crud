package com.ra.democrud.dao;

import com.ra.democrud.model.Student;
import com.ra.democrud.util.ConnectDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements IStudentDao {
    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        Connection conn = ConnectDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("select * from student");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Student st = new Student();
                st.setStudentId(rs.getLong("id"));
                st.setStudentName(rs.getString("name"));
                st.setAge(rs.getInt("age"));
                st.setSex(rs.getBoolean("sex"));
                list.add(st);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Student findByID(Long id) {

        Student st = null;
        Connection conn = ConnectDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("select * from student where  id = ?");
            call.setLong("id", id);
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                st = new Student();
                st.setStudentId(rs.getLong("id"));
                st.setStudentName(rs.getString("name"));
                st.setAge(rs.getInt("age"));
                st.setSex(rs.getBoolean("sex"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return st;
    }

    @Override
    public void save(Student student) {
        Connection conn = ConnectDB.openConnection();
        CallableStatement call = null;
        try {
            if (student.getStudentId()==null){
                // thêm mới
                call = conn.prepareCall("insert  into  student(name, age, sex) \n" +
                        "value (?,?,?);");
                call.setString(1,student.getStudentName());
                call.setInt(2,student.getAge());
                call.setBoolean(3,student.getSex());
            }else {
                // chỉnh sửa
                call = conn.prepareCall("update student set name=?, age=?, sex=? where id = ?");
                call.setString(1,student.getStudentName());
                call.setInt(2,student.getAge());
                call.setBoolean(3,student.getSex());
                call.setLong(4,student.getStudentId());
            }
            call.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectDB.closeConnection(conn);
        }
    }

    @Override
    public void deleteById(Long id) {
        Student st = null;
        Connection conn = ConnectDB.openConnection();
        try {
            CallableStatement call = conn.prepareCall("delete from student where  id = ?");
            call.setLong("id", id);
            call.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }

    }
}
