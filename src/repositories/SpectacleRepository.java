package repositories;

import connectivity.DataBaseConnection;
import models.Spectacle;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SpectacleRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionInstance();

    public Spectacle getSpectacleByTitle(String name){
        Spectacle spectacle = new Spectacle();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from spectacles where title = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                spectacle.setTitle(rs.getString("title"));
                spectacle.setLength(rs.getInt("length"));
                spectacle.setDirector(rs.getString("director"));
                spectacle.setType(rs.getString("spectacle_type"));
                spectacle.setDate(rs.getDate("spectacle_date"));
                spectacle.setId(rs.getInt("id_spectacle"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return spectacle;
    }


    public Spectacle getSpectacleById(int id){
        Spectacle spectacle = new Spectacle();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from spectacles where id_spectacle = ?");
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                spectacle.setTitle(rs.getString("title"));
                spectacle.setLength(rs.getInt("length"));
                spectacle.setDirector(rs.getString("director"));
                spectacle.setType(rs.getString("spectacle_type"));
                spectacle.setDate(rs.getDate("spectacle_date"));
                spectacle.setId(rs.getInt("id_spectacle"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return spectacle;
    }

    public ArrayList<Spectacle> getAllSpectacles() {
        ArrayList<Spectacle> spectacles = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from spectacles");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Spectacle spectacle = new Spectacle();
                spectacle.setTitle(rs.getString("title"));
                spectacle.setLength(rs.getInt("length"));
                spectacle.setDirector(rs.getString("director"));
                spectacle.setType(rs.getString("spectacle_type"));
                spectacle.setDate(rs.getDate("spectacle_date"));
                spectacle.setId(rs.getInt("id_spectacle"));
                spectacles.add(spectacle);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return spectacles;
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }

    public void saveSpectacle(Spectacle spectacle) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into spectacles " +
                    "title, director, spectacle_type, length, spectacle_date)" +
                    "values(?, ?, ?, ?, ?);");
            statement.setString(1, spectacle.getTitle());
            statement.setString(2, spectacle.getDirector());
            statement.setString(3, spectacle.getType());
            statement.setInt(4, spectacle.getLength());
            java.sql.Date date = convertUtilToSql(spectacle.getDate());
            statement.setDate(5, date);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSpectacle(Spectacle spectacle) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from spectacles where id_spectacle = ?");
            statement.setInt(1, spectacle.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSpectacleDate(Spectacle spectacle, Date date){
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update spectacles set spectacle_date = ? where id_spectacle = ?");
            statement.setInt(2, spectacle.getId());
            statement.setDate(1, date);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
