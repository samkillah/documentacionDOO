package edu.uco.budget.data.daofactory;

import edu.uco.budget.crosscuting.messages.Messages;
import edu.uco.budget.data.dao.BudgetDAO;
import edu.uco.budget.data.dao.PersonDAO;
import edu.uco.budget.data.dao.YearDAO;
import edu.uco.budget.data.enumeration.DAOFactoryType;
import static edu.uco.budget.data.enumeration.DAOFactoryType.*;

public abstract class DAOFactory {

    public static final DAOFactory getDAOFactory(final DAOFactoryType){

        DAOFactory daoFactory;

        switch (factory){
            case SQLSERVER :
                daoFactory = new SqlServerDAOFactory();
                break;
            case CASSANDRA :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_CASSANDRA_NOT_IMPLEMENTED);
            case MARIADB :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_MARIADB_NOT_IMPLEMENTED);
            case MONGODB :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_MONGODB_NOT_IMPLEMENTED);
            case MYSQL :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_MYSQL_NOT_IMPLEMENTED);
            case ORACLE :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_ORACLE_NOT_IMPLEMENTED);
            case POSTGRESQL :
                throw new RuntimeException(Messages.DAOFactory.TECHNICAL_POSTGRESQL_NOT_IMPLEMENTED);
            default:
                throw new IllegalArgumentException("Unexpected value " + factory);
        }
        return daoFactory;
    }

    protected abstract void openConnection();
    public abstract void initTransaction();
    public abstract void confirmTransaction();
    public abstract void cancelTransaction();
    public abstract void closeConnection();

    public abstract BudgetDAO getBudgetDAO();
    public abstract PersonDAO getPersonDAO();
    public abstract YearDAO getYearDAO();
}
