package proyecto.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDB {
   
    private Connection conn;        //conexion
    private PreparedStatement pst;  //prepara la consultas
    private ResultSet rs;           //almacena resultados SELECT
    private int resultadoSQL;       //almacena resultado en Insert,Update y Delete
    
    private String sql;             //la consulta
    
    private String url;
    private String usuario;
    private String clave;
    
    //constructor
    public MariaDB(){
        //inicializamos los necsario para conectarnos
        url="jdbc:mariadb://localhost/ordenes";
        usuario="root";
        clave="eagdsdsags";
        
        try{
            conn = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conectado al Sistema....");
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
           
    }//contructor
    
    //****GETTERS y SETTERS

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public int getResultadoSQL() {
        return resultadoSQL;
    }

    public void setResultadoSQL(int resultadoSQL) {
        this.resultadoSQL = resultadoSQL;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    /********/
    
    //cerramos la conexion
    public void cerrarConexion(){
        
        try{
           conn.close(); 
           System.out.println("Desconetandonos del sistemas...");
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
    
    //*****funciones de consultas
    
    public void ejecutarSQLSelect(){
        
        try{
            this.pst = conn.prepareStatement(sql);
            this.rs = pst.executeQuery();
            
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
   
    public void ejecutarSQL(){ //INSERT, UPDATE o DELETE
        
        try{
            this.pst = conn.prepareStatement(sql);
            resultadoSQL = pst.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}//class
