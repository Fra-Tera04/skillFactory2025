package repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnessioneDB {

    // Credenziali del database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sb_mysql_1";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    /**
     * Restituisce un oggetto Connection per connettersi al database MySQL.
     *
     * @return un oggetto Connection, o null in caso di errore.
     */
    public static Connection getConnectionMySql() {
    	
        Connection connection = null;
        try {

        	Class.forName(DRIVER);
            
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connessione al database MySQL stabilita con successo!");

        } catch (ClassNotFoundException e) {
            System.err.println("Errore: Driver JDBC di MySQL non trovato. Assicurati che il JAR del driver sia nel classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Errore di connessione al database:");
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            e.printStackTrace();
        } catch (Exception e) {
        	e.printStackTrace();
		}
        
        return connection;
    }	
}

