package com.ravenhub;

import com.ravenhub.util.ConnectionManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;

/**
 * blob - это массив байтов (bytea) в postgresql и binary в mysql.
 * С помощью него можно сохранять изображения, видео, аудио и т.д.
 * @author raven
 */
public class BlobRunner {
    public static void main(String[] args) throws IOException, SQLException {
//        blob - bytea
//        clob - TEXT
        getImage();
    }

    private static void getImage() throws SQLException, IOException {
        var sql = """
                SELECT image
                FROM aircraft
                WHERE id = ?
                """;
        try (var connection = ConnectionManager.get() ;
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 1);
            var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                var image = resultSet.getBytes("image");
                Files.write(Path.of("resources", "boing777_new.jpg"), image, StandardOpenOption.CREATE);
            }
        }
    }

    private static void saveImage() throws SQLException, IOException {
        var sql = """
                UPDATE aircraft
                SET image = ?
                WHERE id = 1
                """;
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBytes(1, Files.readAllBytes(Path.of("resources", "boing777.jpg")));
            preparedStatement.executeUpdate();
        }
    }

//    private static void saveImage() throws SQLException, IOException {
//        var sql = """
//                UPDATE aircraft
//                SET image = ?
//                WHERE id = 1
//                """;
//        try (var connection = ConnectionManager.getConnection()
//             var preparedStatement = connection.prepareStatement(sql)) {
//            connection.setAutoCommit(false);
//            var blob = connection.createBlob();
//            blob.setBytes(1, Files.readAllBytes(Path.of("resources", "boing777.jpg")));
//
//            preparedStatement.setBlob(1, blob);
//            preparedStatement.executeUpdate();
//            connection.commit();
//        }
//    }
}
