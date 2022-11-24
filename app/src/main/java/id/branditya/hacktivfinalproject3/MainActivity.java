package id.branditya.hacktivfinalproject3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String countNumber;
    String calculateOperation;
    String countOnProgressNumber;
    Double result;
    Double input1;
    Double input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculatorBtnClicked(View view) {
        TextView tvCountNumber = findViewById(R.id.tv_count);
        TextView tvCountOnProgress = findViewById(R.id.tv_count_on_progress);
        if (countNumber == null) {
            countNumber = "";
        }
        switch (view.getId()) {
            case (R.id.btn_calculator_0):
                countNumber = countNumber + "0";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_1):
                countNumber = countNumber + "1";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_2):
                countNumber = countNumber + "2";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_3):
                countNumber = countNumber + "3";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_4):
                countNumber = countNumber + "4";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_5):
                countNumber = countNumber + "5";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_6):
                countNumber = countNumber + "6";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_7):
                countNumber = countNumber + "7";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_8):
                countNumber = countNumber + "8";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_9):
                countNumber = countNumber + "9";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_decimal):
                countNumber = countNumber + ".";
                tvCountNumber.setText(countNumber);
                break;
            case (R.id.btn_calculator_delete):
                countNumber = tvCountNumber.getText().toString();
                if (countNumber.equals("")) {
                    break;
                }
                StringBuffer sb = new StringBuffer(countNumber);
                sb.deleteCharAt(sb.length() - 1);
                countNumber = sb.toString();
                tvCountNumber.setText(sb);
                break;
            case (R.id.btn_calculator_plus):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    countOnProgressNumber = countNumber + " + ";
                    input1 = Double.parseDouble(countNumber);
                } else {
                    calculation();
                    countOnProgressNumber = result + " + ";
                }
                tvCountOnProgress.setText(countOnProgressNumber);
                countNumber = "";
                tvCountNumber.setText(countNumber);
                calculateOperation = "plus";
                break;
            case (R.id.btn_calculator_minus):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    countOnProgressNumber = countNumber + " - ";
                    input1 = Double.parseDouble(countNumber);
                } else {
                    calculation();
                    countOnProgressNumber = result + " - ";
                }
                tvCountOnProgress.setText(countOnProgressNumber);
                countNumber = "";
                tvCountNumber.setText(countNumber);
                calculateOperation = "minus";
                break;
            case (R.id.btn_calculator_divide):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    countOnProgressNumber = countNumber + " / ";
                    input1 = Double.parseDouble(countNumber);
                } else {
                    calculation();
                    countOnProgressNumber = result + " / ";
                }
                tvCountOnProgress.setText(countOnProgressNumber);
                countNumber = "";
                tvCountNumber.setText(countNumber);
                calculateOperation = "divide";
                break;
            case (R.id.btn_calculator_times):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    countOnProgressNumber = countNumber + " x ";
                    input1 = Double.parseDouble(countNumber);
                } else {
                    calculation();
                    countOnProgressNumber = result + " x ";
                }
                tvCountOnProgress.setText(countOnProgressNumber);
                countNumber = "";
                tvCountNumber.setText(countNumber);
                calculateOperation = "times";
                break;
            case (R.id.btn_calculator_persentage):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    countOnProgressNumber = countNumber + " % ";
                    input1 = Double.parseDouble(countNumber);
                } else {
                    calculation();
                    countOnProgressNumber = result + " % ";
                }
                tvCountOnProgress.setText(countOnProgressNumber);
                countNumber = "";
                tvCountNumber.setText(countNumber);
                calculateOperation = "persentage";
                break;
            case (R.id.btn_calculator_answer):
                countOnProgressNumber = tvCountOnProgress.getText().toString();
                if (countOnProgressNumber.equals("")) {
                    break;
                } else {
                    calculation();
                }
                tvCountOnProgress.setText("");
                countNumber = "";
                tvCountNumber.setText(String.valueOf(result));
                break;
        }
    }

    private void calculation() {
        if (countNumber.equals("")) {
            countNumber = "0";
        }
        switch (calculateOperation) {
            case "plus":
                input2 = Double.parseDouble(countNumber);
                result = input1 + input2;
                input1 = result;
                break;
            case "minus":
                input2 = Double.parseDouble(countNumber);
                result = input1 - input2;
                input1 = result;
                break;
            case "divide":
                input2 = Double.parseDouble(countNumber);
                result = input1 / input2;
                input1 = result;
                break;
            case "times":
                input2 = Double.parseDouble(countNumber);
                result = input1 * input2;
                input1 = result;
                break;
            case "persentage":
                input2 = Double.parseDouble(countNumber);
                result = (input2 / 100) * input1;
                input1 = result;
                break;
        }
        ;
    }
}