package Project_1;

import Project_1.DB_Connection;
import Project_1.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // CREATE
    public void addStudent(Student s) {
        String query = "INSERT INTO students(name, email, marks) VALUES (?, ?, ?)";

        try (Connection con = DB_Connection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDouble(3, s.getMarks());

            ps.executeUpdate();
            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Connection con = DB_Connection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("marks")
                );
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void updateStudent(int id, double newMarks) {
        String query = "UPDATE students SET marks=? WHERE id=?";

        try (Connection con = DB_Connection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setDouble(1, newMarks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Updated Successfully!" : "Student Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id=?";

        try (Connection con = DB_Connection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Deleted Successfully!" : "Student Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}