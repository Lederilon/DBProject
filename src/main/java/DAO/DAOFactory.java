package DAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *@author KostyaHrishenko
 */
public interface DAOFactory {
  /**
   *
   * @return
   * @throws SQLException
   */
  public ProfileDAO getProfileDAO() throws SQLException;

  /**
   *
   * @return
   * @throws SQLException
   */
  public Connection getConnection() throws SQLException;

}
