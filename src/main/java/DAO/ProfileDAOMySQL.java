package DAO;

import domain.Profile;
import domain.ProfileCategory;

import java.sql.*;
import java.util.Date;
import java.util.List;

/**
 * @author KostyaHrishenko
 */
public class ProfileDAOMySQL implements ProfileDAO{
    private Connection connection;
    public ProfileDAOMySQL(Connection conn){
        connection = conn;
    }

    /**
     *
     * @param login
     * @param password
     * @param registrationTime
     * @param name
     * @param sex
     * @param eMail
     * @param category
     * @return
     */
    public Profile createProfile(String login, String password, Date registrationTime, String name, Profile.Sex sex, String eMail, ProfileCategory category) throws SQLException {
       try {
          int id;
          PreparedStatement statement =
                  connection.prepareStatement("INSERT INTO profiles(name,login,password,email,registertime,sex,profilecategories_id) VALUES(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
          statement.setString(2,login);
          statement.setString(3,password);
          statement.setDate(5,new java.sql.Date(registrationTime.getTime()));
          statement.setString(1,name);
          statement.setString(6,sex.getName());
          statement.setString(4,eMail);
          statement.setInt(7,category.getId());
          statement.executeUpdate();
          ResultSet rs =  statement.getGeneratedKeys();
          if (rs.next()) {
               id = rs.getInt(1);
           } else {
                throw new SQLException();
           }
           return new Profile(id,login,password,registrationTime,name,sex,eMail,category);
       }
       finally {
           connection.close();
       }
    }

    public Profile getById(int id) {
        return null;
    }

    public void deleteById(int id) {

    }

    public void updateProfile(Profile profile) {

    }

    public List<Profile> getAll() {
        return null;
    }
}
