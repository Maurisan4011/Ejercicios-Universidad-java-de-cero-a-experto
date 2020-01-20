package capadatos.pool;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Mauri
 */
public class PoolConexionesMySql {

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost:3306/sga?useSSL=false");
        //Definimos el tamaño del pool c¿de colecciones 
        ds.setInitialSize(2);//5 conexiones iniciales        
        return ds;
    }

    public static Connection getConexion() throws SQLException {
        return getDataSource().getConnection();
    }

}
