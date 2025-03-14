package com.fx6.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private String currentInput = "";
    private double firstNumber = 0;
    private String operator = "";

    @FXML
    private Label result;

    @FXML
    private void clickNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        currentInput += button.getText();
        result.setText(currentInput);
    }

    @FXML
    private void clickOperator(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (!currentInput.isEmpty()) {
            firstNumber = Double.parseDouble(currentInput);
            operator = button.getText();
            currentInput = "";
        }
    }

    @FXML
    private void clickAssign(ActionEvent event) {
        if (!currentInput.isEmpty() && !operator.isEmpty()) {
            double secondNumber = Double.parseDouble(currentInput);
            double resultValue = 0;

            switch (operator) {
                case "+":
                    resultValue = firstNumber + secondNumber;
                    break;
                case "-":
                    resultValue = firstNumber - secondNumber;
                    break;
                case "X":
                    resultValue = firstNumber * secondNumber;
                    break;
                case "/":
                    resultValue = (secondNumber != 0) ? firstNumber / secondNumber : 0;
                    break;
            }
            result.setText(String.valueOf(resultValue));
            currentInput = "";
            operator = "";
        }
    }

    @FXML
    private void clickClear(ActionEvent event) {
        currentInput = "";
        firstNumber = 0;
        operator = "";
        result.setText("0");
    }
}
