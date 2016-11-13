package DAO;

import java.sql.SQLException;

/**
 *
 */
public interface DAOFactory {
  public ProfileDAO getProfileDAO() throws SQLException;


}
