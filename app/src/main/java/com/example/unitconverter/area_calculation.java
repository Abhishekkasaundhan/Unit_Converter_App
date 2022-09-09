package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class area_calculation extends AppCompatActivity {

    CardView cv_FU, cv_TU, cv_C;
    RelativeLayout mCLayout;
    String FU = "Celcius";
    String TU = "Farenheit";
    TextView tv_FU, tv_TU;
    EditText et_FU, et_TU;
    final String[] val = new String[]{
            "Sq. Meter",
            "Sq. Kilometer",
            "Sq. Hectometer",
            "Sq. Dekameter",
            "Sq. Decimeter",
            "Sq. Centimeter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_calculation);
        getSupportActionBar().hide();

        cv_FU = findViewById(R.id.fromUnit);
        cv_TU = findViewById(R.id.toUnit);
        cv_C = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_FU = findViewById(R.id.tv_fromUnit);
        tv_TU = findViewById(R.id.tv_toUnit);

        tv_FU.setText(val[0]);
        tv_TU.setText(val[0]);

        et_FU = findViewById(R.id.et_fromUnit);
        et_TU = findViewById(R.id.et_toUnit);

        cv_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_FU.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_FU.setError("Please enter some value");
                } else {
                    if (tv_FU.getText().toString().equals(val[0])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(meterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(meterToHectometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(meterToDekameter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(meterTozDecimeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(meterToCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[1])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(kilometerToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(kilometerToHectometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(kilometerTodekameter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(kilometerToDecimeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(kilometerToCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[2])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(hectometerToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(hectometerToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(hectometerToDekameter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(hectometerToDecimeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(hectometerToCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[3])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(dekameterToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(dekameterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(dekameterToHectometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(dekameterToDecimeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(dekameterToCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[4])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(decimeterToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(DecimeterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(decimeterToHectometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(newtonToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(decimeterToCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[5])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(centimeterToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(centimeterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(delisleToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(delisleToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(delisleToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_TU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_calculation.this);
                builder.setTitle("Choose Unit");

                final String[] flowers = new String[]{
                        "Sq. Meter",
                        "Sq. Kilometer",
                        "Sq. Hectometer",
                        "Sq. Dekameter",
                        "Sq. Decimeter",
                        "Sq. Centimeter"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                TU = selectedItem;
                                tv_TU.setText(TU);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();


                dialog.show();

            }
        });

        cv_FU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_calculation.this);
                builder.setTitle("Choose Unit");

                final String[] flowers = new String[]{
                        "Sq. Meter",
                        "Sq. Kilometer",
                        "Sq. Hectometer",
                        "Sq. Dekameter",
                        "Sq. Decimeter",
                        "Sq. Centimeter"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                FU = selectedItem;
                                tv_FU.setText(FU);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();


                dialog.show();

            }
        });
    }

    //meter

    // meter to hectometer
    private String meterToHectometer(double meter)
    {
        double hectometer= meter/1e+4;
        return String.valueOf(hectometer);
    }

    // meter to dekameter
    private String meterToDekameter(double meter)
    {
        double decimeter = meter/100;
        return String.valueOf(decimeter);
    }

    //meter to decimeter
    private String meterTozDecimeter(double meter) {
        double decimeter = meter *100;
        return String.valueOf(decimeter);
    }
     //meter to centimeter
    private String meterToCentimeter(double meter) {
        double centimeter = meter*10000;
        return String.valueOf(centimeter);
    }

    // meter to kilometer
    private String meterToKilometer(double meter)
    {
        double kilometer = meter* 1e-6;
        return String.valueOf(kilometer);
    }

    //kilometer

    //kilometer to hectometer
    private String kilometerToHectometer(double kilometer)
    {
        double kelvin = kilometer*100;
        return String.valueOf(kelvin);
    }

    // kilometer to dekameter
    private String kilometerTodekameter(double kilometer)
    {
        double rankine = kilometer* 10000;
        return String.valueOf(rankine);
    }

    //kilometer to decimeter
    private String kilometerToDecimeter(double kilometer)
    {
        double decimeter = kilometer*1e+8;
        return String.valueOf(decimeter);
    }

    //kilometer to centimeter
    private String kilometerToCentimeter(double kilometer)
    {
        double centimeter = kilometer*1e+10;
        return String.valueOf(centimeter);
    }

    //kilometer to meter
    private String kilometerToMeter(double kilometer)
    {
        double meter = kilometer*1e+6;
        return String.valueOf(meter);
    }

    //hectometer
    //hectometer to Dekameter
    private String hectometerToDekameter(double hectometer)
    {
        double dekameter= hectometer * 100;
        return String.valueOf(dekameter);
    }

    //hectometer to Decimeter
    private String hectometerToDecimeter(double hectometer) {
        double decimeter= hectometer*1e+6;
        return String.valueOf(decimeter);
    }
    //hectometer to centimeter
    private String hectometerToCentimeter(double hectometer) {
        double centimeter = hectometer*1e+8;
        return String.valueOf(centimeter);
    }

    //hectometer to meter
    private String hectometerToMeter(double hectometer) {
        double meter= hectometer* 10000;
        return String.valueOf(meter);
    }

    //hectometer to kilometer
    private String hectometerToKilometer(double hectometer) {
        double kilometer= hectometer/100;
        return String.valueOf(kilometer);
    }

    //Dekameter
    //Dekameter to Decimeter
    private String dekameterToDecimeter(double dekameter)
    {
        double decimeter= dekameter*10000;
        return String.valueOf(decimeter);
    }

    //Dekameter to centimeter
    private String dekameterToCentimeter(double dekameter) {
        double centimeter= dekameter*1e+6;
        return String.valueOf(centimeter);
    }

    //Dekameter to meter
    private String dekameterToMeter(double dekameter) {
        double meter = dekameter*100;
        return String.valueOf(meter);
    }

    //Dekameter to kiloometer
    private String dekameterToKilometer(double dekameter) {
        double kilometer= dekameter/10000;
        return String.valueOf(kilometer);
    }

    //Dekameter to hectometer
    private String dekameterToHectometer(double dekameter) {
        double hectometer = dekameter/100;
        return String.valueOf(hectometer);
    }

    //Decimeter
    //Decimeter to centimeter
    private String decimeterToCentimeter(double decimeter) {
        double centimeter = decimeter*100;
        return String.valueOf(centimeter);
    }

    //Decimeter to meter
    private String decimeterToMeter(double decimeter) {
        double meter = decimeter/ 100 ;
        return String.valueOf(meter);
    }

    //Decimeter to kilometer
    private String DecimeterToKilometer(double decimeter) {
        double kilometer = decimeter/1e+8;
        return String.valueOf(kilometer);
    }

    //Decimeter to hectometer
    private String decimeterToHectometer(double decimeter) {
        double hectometer = decimeter/1e+6;
        return String.valueOf(hectometer);
    }

    //Decimeter to dekameter
    private String newtonToRankine(double decimeter) {
        double dekameter = decimeter/10000;
        return String.valueOf(dekameter);
    }

    //centimeter

    //centimeter to meter
    private String centimeterToMeter(double centimeter) {
        double meter = centimeter/10000;
        return String.valueOf(meter);
    }

    //centimeter to kilometer
    private String centimeterToKilometer(double centimeter) {
        double kilometer = centimeter/1e+10;
        return String.valueOf(kilometer);
    }

    //centimeter to hectometer
    private String delisleToKelvin(double centimeter) {
        double hectometer = centimeter/1e+8;
        return String.valueOf(hectometer);
    }

    //centimeter to dekameter
    private String delisleToRankine(double centimeter) {
        double dekameter= centimeter/1e+6;
        return String.valueOf(dekameter);
    }

    //centimeter to decimeter
    private String delisleToNewton(double centimeter) {
        double  decimeter= centimeter/100;
        return String.valueOf(decimeter);
    }
}