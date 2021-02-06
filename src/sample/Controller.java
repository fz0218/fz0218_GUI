package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label lbl;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txtr;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn0;

    @FXML
    private Button btndot;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn3;

    @FXML
    private Button btnadd;

    @FXML
    private Button btndivide;

    @FXML
    private Button btnsqrt;

    @FXML
    private Button btnclear;

    @FXML
    private Button btnresult;

    int chk = 0;

    double result;
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

/*
these two click events will make sure which textfield is selected
 */
        txt1.setOnMouseClicked(e -> {
            chk = 1;
        });
        txt2.setOnMouseClicked(e -> {
            chk = 2;
        });
/*
this button write 0 at the end of the selected textfield
 */
        btn0.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "0");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "0");
            }
        });
/*
this button write 1 at the end of the selected textfield
 */
        btn1.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "1");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "1");
            }
        });
/*
this button write 2 at the end of the selected textfield
 */
        btn2.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "2");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "2");
            }
        });
/*
this button write 3 at the end of the selected textfield
 */
        btn3.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "3");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "3");
            }
        });
/*
this button write 4 at the end of the selected textfield
 */
        btn4.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "4");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "4");
            }
        });
/*
this button write 5 at the end of the text of the selected textfield
 */
        btn5.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + "5");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + "5");
            }
        });
/*
this button put the dot at the end of the text of the selected textfield
 */
        btndot.setOnAction(e->{
            if(chk == 1){
                txt1.setText(txt1.getText() + ".");
            }
            else if(chk == 2){
                txt2.setText(txt2.getText() + ".");
            }
        });
/*
this buttons adds both textfields value if both contains value. other wie an error come up
 */
        btnadd.setOnAction(e->{
            if(!txt1.getText().isEmpty()&& !txt2.getText().isEmpty()) {
                result = Double.valueOf(txt1.getText()) + Double.valueOf(txt2.getText());
                lbl.setText("");
            }else{
                lbl.setText("Please enter both operands to perform addition");
            }
        });
/*
if both textfields contains value then it perform divison other wise a red label with error occur
 */
        btndivide.setOnAction(e->{
            if(!txt1.getText().isEmpty()&& !txt2.getText().isEmpty()) {
                result = Double.valueOf(txt1.getText()) / Double.valueOf(txt2.getText());
                lbl.setText("");
            }else{
                lbl.setText("Please enter both operands to perform Division");
            }

        });
/*
this buttons click method check if any or both of the text field contain value and perform the square
root on these values accordingly
 */
        btnsqrt.setOnAction(e->{
            txtr.clear();
            if(txt1.getText().equals("") && txt1.getText().equals("")){
                lbl.setText("Please Enter at least one operand");
            }

            if(!txt1.getText().equals("")){
                lbl.setText("");
                txtr.setText(txtr.getText()+" op#1 = "+df.format(Math.sqrt(Double.valueOf(txt1.getText()))));
            }
            if(!txt2.getText().equals("")){
                lbl.setText("");
                txtr.setText(txtr.getText()+"  op#2 = "+df.format(Math.sqrt(Double.valueOf(txt2.getText()))));
            }
        });
/*
this method clears all text fields and set the result value to zero and check value to zero
 */
        btnclear.setOnAction(e->{
            txt1.clear();
            txt2.clear();
            txtr.clear();
            result = 0;
            chk = 0;
        });
/*
this method just sets the result to the result textfield
 */
        btnresult.setOnAction(e->{
            txtr.setText(result+"");
        });




    }




}
