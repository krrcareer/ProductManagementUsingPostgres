package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;
    public ProductDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projects", "postgres", "0000");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addProductDB(Product p){

        String query = "insert into product(name, place, type, warranty) values(?,?,?,?)";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, p.getName());
            st.setString(2, p.getPlace());
            st.setString(3, p.getType());
            st.setInt(4, p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProductDB(){
        List<Product> aplTemp = new ArrayList<>();
        String query = "select name, place, type, warranty from product";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setPlace(rs.getString(2));
                p.setType(rs.getString(3));
                p.setWarranty(rs.getInt(4));

                aplTemp.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return aplTemp;
    }
}
