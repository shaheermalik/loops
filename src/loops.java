import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class loops extends Application {
    public void start (Stage primaryStage) {

        TextInputDialog input = new TextInputDialog();
        Alert output = new Alert(AlertType.INFORMATION);
        int number;
        do {
            input.setTitle("Futuristic Machine");
            input.setHeaderText("Please enter a integer of your choice");
            input.showAndWait();
            number = Integer.parseInt(input.getResult());
            if (number<0){
                output.setTitle("ERROR");
                output.setContentText("Please enter a positive integer : )");
                output.showAndWait();
            }


        }while(number<0);
        int count = number;
        int factorial = number;
        int odd=0;
        int oddCount;
        int fib1 = 0;
        int fib2 = 1;
        int fibonacci=0;

        if (count==0){
            factorial = 1;
        }else{
            while (count>1){
                factorial = factorial *(count-1);
                count--;
            }
        }

        if (number%2==0){
            oddCount = number-1;
        } else {
            oddCount = number;
        }

        for (count=oddCount;count>0;count=count-2){
            odd=odd+count;
        }

        for (count=number;count>0;count--){
            fibonacci = fib1+fib2;
            fib2= fib1;
            fib1=fibonacci;
        }

        output.setTitle("Fatorial");
        output.setContentText("The Fatorial of " + number +  " is " + factorial);
        output.showAndWait();
        output.setTitle("Odd Numbers");
        output.setContentText("The sum of all odd numbers within " + number + " is " + odd);
        output.showAndWait();
        output.setTitle("Fibonacci Number");
        output.setContentText("The Fibonacci number of " + number + " is " + fibonacci);
        output.showAndWait();
    }
}
