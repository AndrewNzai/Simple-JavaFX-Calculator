package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    private Float num1 = 0F;
    private String operator = "";

    /*
    This method is used to read the Number input(s) selected by the user.
     */

    @FXML
    private void processNumbers(ActionEvent actionEvent){
        String value = ((Button) actionEvent.getSource()).getText();
        textField.setText(textField.getText() + value);
    }
    /*
    This method is used to determine the operator chosen by the user, delegate the number
    inputs to the respective float variables, perform the calculation then finalize the
    operation by displaying the solution to the user.
     */

    @FXML
    private void processOperators(ActionEvent actionEvent){
        String value = ((Button) actionEvent.getSource()).getText();

        if (!value.equals("=")){
            operator = value;
            num1 = Float.parseFloat(textField.getText());
            textField.clear();

        }
        else{

            float num2 = Float.parseFloat(textField.getText());

            String result = String.valueOf(Operation.calculate(num1, num2, operator));
            textField.setText(result);

        }
    }

    @FXML
    public void clearScreen(){
        textField.clear();
    }
}
