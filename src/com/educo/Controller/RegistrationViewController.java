/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.Controller;

import com.educo.BO.BOFactory;
import com.educo.BO.BOFactory.BOType;
import com.educo.BO.custom.RegistrationBO;
import com.educo.DTO.StudentDTO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class RegistrationViewController implements Initializable {

    @FXML
    private JFXTextField txtStudentId;
    @FXML
    private JFXTextField txtStudentName;
    @FXML
    private JFXTextField txtAddress;
    @FXML
    private JFXTextField txtGuardian;
    @FXML
    private JFXTextField txtContact;
    @FXML
    private JFXDatePicker dtpDob;
    @FXML
    private JFXButton btnSave;
    @FXML
    private JFXButton btnUpdate;
    @FXML
    private JFXButton btnDelete;
    @FXML
    private TableView<StudentDTO> tblStudent;

    private RegistrationBO registrationBO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tblStudent.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("stdID"));
        tblStudent.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblStudent.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("dob"));
        tblStudent.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblStudent.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("guardian"));
        tblStudent.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("tel"));
        registrationBO = (RegistrationBO) BOFactory.makeBO(BOType.STUDENT_REG);
        loadTableData();
    }

    @FXML
    private void btnSave_OnAction(ActionEvent event) {
        if (txtStudentId.getText().isEmpty() || txtStudentName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtGuardian.getText().isEmpty() || txtContact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill the Form", "Error", 0);
            return;
        }
        try {
            boolean saveStudent = registrationBO.saveStudent(new StudentDTO(
                    txtStudentId.getText(),
                    txtStudentName.getText(),
                    dtpDob.getValue().toString(),
                    txtAddress.getText(),
                    txtGuardian.getText(),
                    txtContact.getText())
            );
            if (saveStudent) {
                JOptionPane.showMessageDialog(null, "Student Registered.!");
            }
            loadTableData();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    @FXML
    private void btnUpdate_OnAction(ActionEvent event) {
    }

    @FXML
    private void btnDelete_OnAction(ActionEvent event) {
    }

    private void loadTableData() {
        try {
            tblStudent.setItems(FXCollections.observableArrayList(registrationBO.getAllStudents()));

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

}
