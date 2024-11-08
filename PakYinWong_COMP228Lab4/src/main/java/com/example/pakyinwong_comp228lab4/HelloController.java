package com.example.pakyinwong_comp228lab4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class HelloController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField provinceField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField emailField;

    @FXML
    private CheckBox studentCouncilCheckBox;
    @FXML
    private CheckBox volunteerCheckBox;

    @FXML
    private RadioButton computerScience;
    @FXML
    private RadioButton business;

    @FXML
    private ComboBox<String> courseComboBox;
    @FXML
    private ListView<String> courseListView;

    @FXML
    private TextArea displayArea;

    @FXML
    private Button displayButton;

    private final ObservableList<String> computerScienceCourses = FXCollections.observableArrayList("Python", "C#", "Java");
    private final ObservableList<String> businessCourses = FXCollections.observableArrayList("Finance", "Marketing", "Accounting");

    private final ObservableList<String> selectedCourses = FXCollections.observableArrayList();

    public void initialize() {
        ToggleGroup majorGroup = new ToggleGroup();
        computerScience.setToggleGroup(majorGroup);
        business.setToggleGroup(majorGroup);

        courseListView.setItems(selectedCourses);

        displayArea.setEditable(false);

        computerScience.setOnAction(e -> {
            courseComboBox.setItems(computerScienceCourses);
            selectedCourses.clear();
        });

        business.setOnAction(e -> {
            courseComboBox.setItems(businessCourses);
            selectedCourses.clear();
        });

        courseComboBox.setOnAction(e -> {
            String selectedCourse = courseComboBox.getValue();
            if (selectedCourse != null && !selectedCourses.contains(selectedCourse)) {
                selectedCourses.add(selectedCourse);
            }
        });
        displayButton.setOnAction(e -> displayStudentInfo());
    }

    private void displayStudentInfo() {
        String info = "";

        info += nameField.getText() + ", ";
        info += addressField.getText() + ", ";
        info += cityField.getText() + ", ";
        info += provinceField.getText() + ", ";
        info += postalCodeField.getText() + ", ";
        info += phoneNumberField.getText() + ", ";
        info += emailField.getText() + "\n";

        if (computerScience.isSelected()) {
            info += "Major: Computer Science\n";
        } else if (business.isSelected()) {
            info += "Major: Business\n";
        }

        info += "Courses:\n";
        for (String course : selectedCourses) {
            info += course + "\n";
        }

        info += "Additional Information:\n";
        if (studentCouncilCheckBox.isSelected()) {
            info += "Student Council\n";
        }
        if (volunteerCheckBox.isSelected()) {
            info += "Volunteer Work\n";
        }

        displayArea.setText(info);

        nameField.clear();
        addressField.clear();
        cityField.clear();
        provinceField.clear();
        postalCodeField.clear();
        phoneNumberField.clear();
        emailField.clear();

        computerScience.setSelected(false);
        business.setSelected(false);

        selectedCourses.clear();
        courseComboBox.getSelectionModel().clearSelection();

        studentCouncilCheckBox.setSelected(false);
        volunteerCheckBox.setSelected(false);
    }
}
