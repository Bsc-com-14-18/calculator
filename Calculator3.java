import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;



public class Calculator3 extends Application {

    int res= 0;
    String ReString = "0";
    char LastOp= ' ';

    public void start(Stage PrimaryStage) {

        BorderPane pane = new BorderPane();
        FlowPane fPane = new FlowPane();
        GridPane gPane= new GridPane();
        VBox oPsvbox = new VBox();
        pane.setTop(fPane);
        pane.setCenter(gPane);
        pane.setRight(oPsvbox);

        TextField TxFld = new TextField();
        Button backspace = new Button ("Clear");
        fPane.getChildren().add(TxFld);
        fPane.getChildren().add(backspace);
        fPane.setAlignment(Pos.CENTER);
        fPane.setHgap(50);
        TxFld.setPrefSize(200, 40);
        backspace.setPrefSize(100, 10);

        Scene scene = new Scene(pane, 600, 500);

        PrimaryStage.setTitle("Calculator");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();


        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnDivide = new Button("/");
        Button btnMultiply = new Button("x");
        Button btnEquals = new Button("=");
        gPane.setMinSize(40, 40);
        gPane.setPadding(new Insets(10,10,10,10));
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);
        gPane.add(button1, 0, 0);
        gPane.add(button2, 1, 0);
        gPane.add(button3, 2, 0);
        gPane.add(button4, 0, 1);
        gPane.add(button5, 1, 1);
        gPane.add(button6, 2, 1);
        gPane.add(button7, 0, 2);
        gPane.add(button8, 1, 2);
        gPane.add(button9, 2, 2);
        gPane.add(button0, 1, 3);

        gPane.setPadding(new Insets(10, 10, 10, 10));
        oPsvbox.getChildren().addAll(btnPlus, btnMinus, btnDivide, btnMultiply, btnEquals);
        oPsvbox.setPadding(new Insets(15, 70, 15, 70));
        oPsvbox.setSpacing(10);
        oPsvbox.setAlignment(Pos.CENTER);
        button1.setPrefSize(60,60);
        button2.setPrefSize(60,60);
        button3.setPrefSize(60,60);
        button4.setPrefSize(60,60);
        button5.setPrefSize(60,60);
        button6.setPrefSize(60,60);
        button7.setPrefSize(60,60);
        button8.setPrefSize(60,60);
        button9.setPrefSize(60,60);
        button0.setPrefSize(60,60);
        btnPlus.setPrefSize(60, 60);
        btnMinus.setPrefSize(60, 60);
        btnDivide.setPrefSize(60, 60);
        btnMultiply.setPrefSize(60, 60);
        btnEquals.setPrefSize(60, 60);

        button1.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "1");
        });
        button2.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "2");
        });
        button3.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "3");
        });
        button4.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "4");
        });
        button5.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "5");
        });
        button6.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "6");
        });
        button7.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "7");
        });
        button8.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "8");
        });
        button9.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "9");
        });
        button0.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "0");
        });
        btnPlus.setOnAction((ActionEvent e)->{

          TxFld.setText(TxFld.getText()+ "+");
        });
        btnMinus.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "-");
        });
        btnMultiply.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "x");
        });
        btnDivide.setOnAction((ActionEvent e)->{
          TxFld.setText(TxFld.getText()+ "/");
        });
        btnEquals.setOnAction((ActionEvent e)->{
         int intnum = Integer.parseInt(ReString);
         ReString = " ";
         if (LastOp == ' ' ){
           res = intnum;
           }
           else if(LastOp == '+'){
             res += intnum;
           }
           TxFld.setText(TxFld.getText() +res +" ");
        });
        backspace.setOnAction( (ActionEvent e) -> {

          TxFld.setText(" ");
        });


}
}
