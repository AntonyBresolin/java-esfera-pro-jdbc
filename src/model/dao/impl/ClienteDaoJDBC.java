package model.dao.impl;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.ClienteDao;
import model.entities.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoJDBC implements ClienteDao {
    private Connection conn;
    public ClienteDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public Cliente findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM cliente WHERE Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId_Cliente(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                return obj;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public Cliente findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM cliente WHERE name = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId_Cliente(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                return obj;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Cliente> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM cliente ORDER BY Name");
            rs = st.executeQuery();

            List<Cliente> list = new ArrayList<>();

            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId_Cliente(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                list.add(obj);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public void insert(Cliente obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO cliente " +
                            "(Name) " +
                            "VALUES " +
                            "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId_Cliente(id);
                }
            }
            else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Cliente obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE cliente " +
                            "SET Name = ? " +
                            "WHERE Id = ?");

            st.setString(1, obj.getName());
            st.setInt(2, obj.getId_Cliente());

            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "DELETE FROM cliente WHERE Id = ?");

            st.setInt(1, id);

            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }
}
