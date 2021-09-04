package ch.teko.prg2.day04.test;

import java.sql.*;
//import com.zaxxer.hikari.HikariDataSource;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         */

        Connection conn = null;

        try {
            String url = "jdbc:sqlite:/Users/glausm/Desktop/chinook.db";

            conn = DriverManager.getConnection(url);
            System.out.printf("Connection has been established\n");



            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *\n" +
                    "FROM tracks \n" +
                    "JOIN playlists ON (playlists.PlaylistId = playlist_track.PlaylistId)\n" +
                    "JOIN playlist_track ON (playlist_track.TrackId = tracks.TrackId)\n" +
                    "WHERE playlists.Name='Grunge';");

            while (rs.next()) {
                String musicName = rs.getString("Name");
                System.out.println(musicName);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
