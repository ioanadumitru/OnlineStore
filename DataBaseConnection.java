/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;


public class DataBaseConnection {

    private Connection con;
    private Statement state;
    private ResultSet result;
    public String componentePC[] = {"placaVideo", "procesor", "monitor", "carcasa", "boxe", "placaDeBaza"};
    
    private DataBaseConnection() {
        MysqlConnection();
    }
    
    public static DataBaseConnection getInstance() {
        return DataBaseConnectionHolder.INSTANCE;
    }
    
    private static class DataBaseConnectionHolder {

        private static final DataBaseConnection INSTANCE = new DataBaseConnection();
    }
    public void insertProdus(Produs produs, String componenta)
    {
        try
        {
            int key = getComponentID(componenta);
            String query = "INSERT INTO produse(idComponenta, codProdus, pret, marca, anFabricatie, garantie, producator, taraProvenienta, stoc)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, key);
            preparedStatement.setString(2, produs.codProdus);
            preparedStatement.setFloat(3, produs.pret);
            preparedStatement.setString(4, produs.marca);
            preparedStatement.setInt(5,produs.anFabricatie);
            preparedStatement.setInt(6, produs.garantie);
            preparedStatement.setString(7, produs.producator);
            preparedStatement.setString(8, produs.taraProvenienta);
            preparedStatement.setInt(9, produs.stoc);
            preparedStatement.execute();
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public ResultSet cautarePretProdus(String marca)
    {
        ResultSet r=null;
        try{
          //  marca ="NVIDIA950";
            String sql = "SELECT pret, marca FROM produse WHERE marca=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,marca);
            r = statement.executeQuery();
        }catch(Exception e)
        {
            e.toString();
        }
        return r;
    }
    
    public void stergereProdus(String cod)
    {
        try{
            
            String sql = "DELETE FROM produse WHERE codProdus=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, cod);
            statement.executeQuery();
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public ResultSet getProdus(String cod)
    {
        try
        {
            String sql = "SELECT * FROM produse WHERE codProdus=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,cod);
            result = preparedStatement.executeQuery();
        }catch(Exception e)
        {
            e.toString();
        }
        return result;
    }
    
    public void vanzareProdus(String cod)
    {
        try{
        result = getProdus(cod);
        int Stoc = result.getInt("stoc")-1;
        String sql = "UPDATE produse SET stoc=? WHERE codProdus=?";
        PreparedStatement prepare = con.prepareStatement(sql);
        prepare.setInt(1, Stoc);
        prepare.setString(2, cod);
        prepare.executeQuery();
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public void incarcareStoc(String cod, int stocNou)
    {
        try{
            result = getProdus(cod);
            int Stoc = result.getInt("stoc")+stocNou;
            String sql = "UPDATE produse SET stoc=? WHERE codProdus=?";
            PreparedStatement pStatement = con.prepareStatement(sql);
            pStatement.setInt(1, Stoc);
            pStatement.setString(2,cod);
            pStatement.executeQuery();
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public double calculeazaSumaTotalaComponenta(int key)
    {
        double total = 0;
        try{
            String sql = "SELECT * FROM produse WHERE idComponenta=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, key);
            result = statement.executeQuery();
            
            while(result.next())
            {
                int pret = result.getInt("pret");
                int stoc = result.getInt("stoc");
                int t = pret*stoc;
                total+=t;
            }
        }catch(Exception e)
        {
            e.toString();
        }
        return total;
    }
       
    private void executeInsertProduse(String line, int primaryKey)
    {
        try
        {
            StringTokenizer string = new StringTokenizer(line);
            String codDeBare = string.nextToken(" ");
            String spret = string.nextToken(" ");
            float pret = Float.parseFloat(spret);
        
            String marca = string.nextToken(" ");
        
            String An = string.nextToken(" ");
            int an = Integer.parseInt(An);
        
            String Garantie = string.nextToken(" ");
            int garantie = Integer.parseInt(Garantie);
        
            String producator = string.nextToken(" ");
        
            String tara = string.nextToken(" ");
            String Stoc = string.nextToken(" ");
            int stoc = Integer.parseInt(Stoc);
            
           String query = "INSERT INTO produse(idComponenta, codProdus, pret, marca, anFabricatie, garantie, producator, taraProvenienta, stoc)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setString(2, codDeBare);
            preparedStatement.setFloat(3, pret);
            preparedStatement.setString(4, marca);
            preparedStatement.setInt(5,an);
            preparedStatement.setInt(6, garantie);
            preparedStatement.setString(7, producator);
            preparedStatement.setString(8, tara);
            preparedStatement.setInt(9, stoc);
            preparedStatement.execute();
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public void deleteDataBase()
    {
        try
        {
            String sql = "DROP DATABASE magazinonline";
            state.executeUpdate(sql); 
        }catch(Exception e)
        {
            System.out.println("was not deleted");
        }
    }
    
    public int getComponentID(String component)
    {
        for(int i=0; i<componentePC.length; i++)
        {
            if(componentePC[i].compareTo(component)==0)
                return i;
        }
        return -1;
    }
    
    
    private void executeInsert(String line)
    {
        int primaryKey;
        try
        {
            StringTokenizer string = new StringTokenizer(line);
            String componenta = string.nextToken(" ");
            line = line.replace(componenta,"");
            primaryKey = getComponentID(componenta);
            executeInsertProduse(line, primaryKey);
            String query = "INSERT INTO componentepc(idComponenta, tipComponenta)" 
                    + "VALUES(?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,primaryKey);
            statement.setString(2, componenta);
            System.out.println(componenta);
            
            statement.execute();
            
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public boolean insertData(String fileName)
    {
        boolean inserted = false;
        try 
        {
        BufferedReader buffer = new BufferedReader(new FileReader(fileName));
        String line = buffer.readLine();
        executeInsert(line);
        while(line!=null)
        {
            line = buffer.readLine();
            executeInsert(line);
        }        
        inserted = true;
        }catch(Exception e)
        {
            e.toString();
        }
        return inserted;
    }
    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinonline", "root","Afaraploua19");
                System.out.println("con successful");
            state = con.createStatement();
            System.out.println("con successful");
            con.close();
        }catch(Exception e)
        {
             e.toString();
        }
    }
    
    public void connect(String userName, String parola)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinonline", userName, parola);
                System.out.println("con successful");
           // state = con.createStatement();
            System.out.println("con successful");
        }catch(Exception e)
        {
             e.toString();
        }
         
    }
    
    public Connection getConnection()
    {
       return con;    
    }
    
    
    public void MysqlConnection()
    {
        connect();
        designDataBase();
    }

    public void executeSelect() //DISPLAY ALL THE PRODUCTS IN THE DATABASE IN THE FIST PAGE
    {
        try
        {
            String sqlCmd = "SELECT * FROM componentePC";
            result = state.executeQuery(sqlCmd);
            while(result.next())
            {
                String i = result.getString("idComponenta");
                int id = Integer.parseInt(i);
                String com = result.getString("tipComponenta");
                System.out.printf(com," ", id);
            }
        }catch(Exception e)
        {
            e.toString();
        }   
    }
    
    
    public ResultSet getResultForSpecificComponent(int id)
    {
        try
        {
            String query = "SELECT * FROM produse WHERE idComponenta=?";
            PreparedStatement prepStatement = con.prepareStatement(query);
            String idString = Integer.toString(id);
            prepStatement.setString(1, idString);
            result = prepStatement.executeQuery();    
        }catch(Exception e)
        {
            e.toString();
        }
        return result;
    }
    
    
    public Produs setProdus(Produs p) 
    {
        try
        {
                p.codProdus = result.getString("codProdus");
                p.pret = result.getFloat("pret");
                p.marca = result.getString("marca");
                p.anFabricatie = result.getInt("anFabricatie");
                p.garantie = result.getInt("garantie");
                p.producator = result.getString("producator");
                p.taraProvenienta = result.getString("taraProvenienta");
                p.stoc = result.getInt("stoc");
        }
        catch(Exception e)
        {
            e.toString();
        }
        return p;
    }
    
    public void createDataBase()
    {
        try{
            String sqlCmd = "CREATE DATABASE magazinOnline";
            state.executeUpdate(sqlCmd);
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public void createTableComponentePC()
    {
        try{
            
              String sqlCmd ="CREATE TABLE componentePC" +
                "(idComponenta INTEGER not NULL," 
                + "tipComponenta VARCHAR(30)," 
                + "PRIMARY KEY(idComponenta))";
        state.executeUpdate(sqlCmd);
        }catch(Exception e)
        {
            e.toString();
        }
    }
    
    public void createTableProduse()
    {
        try{
            String sqlCmd = "CREATE TABLE PRODUSE" + 
                    "(idComponenta INTEGER not NULL,"
                + "codProdus VARCHAR(30),"
                + "pret FLOAT," 
                + "marca VARCHAR(30),"
                + "anFabricatie INTEGER,"
                + "garantie INTEGER,"
                + "producator VARCHAR(30),"
                + "taraProvenienta VARCHAR(30),"
                + "stoc INTEGER)";
        state.executeUpdate(sqlCmd);
        }catch(Exception e)
        {
            e.toString();
        }
        
    }
    
    public void designDataBase()
    {
        createDataBase();
        createTableComponentePC();
        createTableProduse();
    }
}
