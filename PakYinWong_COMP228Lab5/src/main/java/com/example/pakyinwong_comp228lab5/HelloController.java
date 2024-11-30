package com.example.pakyinwong_comp228lab5;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class HelloController {

    @FXML private TextField gameIdField, gameTitleField;
    @FXML private TextField playerIdField, firstNameField, lastNameField, addressField, postalCodeField, provinceField, phoneNumberField;
    @FXML private TextField getPlayerIdField, updateFirstNameField, updateLastNameField, updateAddressField, updatePostalCodeField, updateProvinceField, updatePhoneNumberField;
    @FXML private TextField playerIdGamePlayerField, gameIdGamePlayerField, scoreField;
    @FXML private TextField playerIdReportField;
    @FXML private TableView<GamePlayerReport> reportTable;
    @FXML private TableColumn<GamePlayerReport, String> gameTitleColumn, firstNameColumn, lastNameColumn;
    @FXML private TableColumn<GamePlayerReport, Integer> scoreColumn;
    @FXML private TableColumn<GamePlayerReport, LocalDate> playingDateColumn;

    @FXML
    public void initialize() {
        gameTitleColumn.setCellValueFactory(new PropertyValueFactory<>("gameTitle"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        playingDateColumn.setCellValueFactory(new PropertyValueFactory<>("playingDate"));

    }

    @FXML
    public void insertGame() {
        String gameId = gameIdField.getText();
        String gameTitle = gameTitleField.getText();

        String sql = "INSERT INTO PAKYIN_WONG_Game (game_id, game_title) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, gameId);
            stmt.setString(2, gameTitle);
            stmt.executeUpdate();
            showAlert("Success", "Game added successfully.");
            gameIdField.clear();
            gameTitleField.clear();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to add game.");
        }
    }

    @FXML
    public void insertPlayer() {
        int playerId = Integer.parseInt(playerIdField.getText());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String postalCode = postalCodeField.getText();
        String province = provinceField.getText();
        String phoneNumber = phoneNumberField.getText();

        String sql = "INSERT INTO PAKYIN_WONG_Player (player_id, first_name, last_name, address, postal_code, province, phone_number) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, playerId);
            stmt.setString(2, firstName);
            stmt.setString(3, lastName);
            stmt.setString(4, address);
            stmt.setString(5, postalCode);
            stmt.setString(6, province);
            stmt.setString(7, phoneNumber);
            stmt.executeUpdate();
            showAlert("Success", "Player added successfully.");
            playerIdField.clear();
            firstNameField.clear();
            lastNameField.clear();
            addressField.clear();
            postalCodeField.clear();
            provinceField.clear();
            phoneNumberField.clear();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to add player.");
        }
    }

    @FXML
    public void updatePlayer() {
        int playerId = Integer.parseInt(getPlayerIdField.getText());
        String firstName = updateFirstNameField.getText();
        String lastName = updateLastNameField.getText();
        String address = updateAddressField.getText();
        String postalCode = updatePostalCodeField.getText();
        String province = updateProvinceField.getText();
        String phoneNumber = updatePhoneNumberField.getText();

        String sql = "UPDATE PAKYIN_WONG_Player SET first_name = ?, last_name = ?, address = ?, postal_code = ?, province = ?, phone_number = ? " +
                "WHERE player_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, address);
            stmt.setString(4, postalCode);
            stmt.setString(5, province);
            stmt.setString(6, phoneNumber);
            stmt.setInt(7, playerId);
            stmt.executeUpdate();
            showAlert("Success", "Player updated successfully.");
            getPlayerIdField.clear();
            updateFirstNameField.clear();
            updateLastNameField.clear();
            updateAddressField.clear();
            updatePostalCodeField.clear();
            updateProvinceField.clear();
            updatePhoneNumberField.clear();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to update player.");
        }
    }

    @FXML
    public void insertGamePlayer() {
        int playerId = Integer.parseInt(playerIdGamePlayerField.getText());
        int gameId = Integer.parseInt(gameIdGamePlayerField.getText());
        int score = Integer.parseInt(scoreField.getText());

        String sql = "INSERT INTO PAKYIN_WONG_Player_And_Game (player_game_id, player_id, game_id, playing_date, score) " +
                "VALUES (PAKYIN_WONG_PLAYERGAME_SEQ.NEXTVAL, ?, ?, SYSDATE, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, playerId);
            stmt.setInt(2, gameId);
            stmt.setInt(3, score);
            stmt.executeUpdate();
            showAlert("Success", "Game-Player added successfully.");
            playerIdGamePlayerField.clear();
            gameIdGamePlayerField.clear();
            scoreField.clear();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to add game-player.");
        }
    }

    @FXML
    public void displayReport() {
        String playerIdText = playerIdReportField.getText();
        List<GamePlayerReport> reports = new ArrayList<>();
        String sql = "SELECT g.game_title, p.first_name, p.last_name, pg.score, pg.playing_date " +
                "FROM PAKYIN_WONG_GAME g " +
                "JOIN PAKYIN_WONG_PLAYER_AND_GAME pg ON g.game_id = pg.game_id " +
                "JOIN PAKYIN_WONG_PLAYER p ON pg.player_id = p.player_id";

        if (!playerIdText.isEmpty()) {
            sql += " WHERE p.player_id = ?";
        }

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            if (!playerIdText.isEmpty()) {
                stmt.setInt(1, Integer.parseInt(playerIdText));
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                reports.add(new GamePlayerReport(
                        rs.getString("game_title"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("score"),
                        rs.getDate("playing_date").toLocalDate()
                ));
            }
            reportTable.getItems().setAll(reports);
            playerIdReportField.clear();
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to display report.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
