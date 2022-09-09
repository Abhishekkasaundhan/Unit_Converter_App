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
                            et_TU.setText(celciusToFarenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(celciusToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(celciusToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(celciusToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(celciusToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[1])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(fahrenheitToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(fahrenheitToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(fahrenheitToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(fahrenheitToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(fahrenheitToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[2])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(kelvinToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(kelvinToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(kelvinToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(kelvinToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(kelvinToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[3])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(rankineToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(rankineToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(rankineToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(rankineToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(rankineToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[4])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(newtonToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(newtonToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_TU.setText(newtonToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_TU.setText(newtonToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_TU.setText(newtonToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[5])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_TU.setText(delisleToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_TU.setText(delisleToFahrenheit(Double.parseDouble(tempInput)));
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

    //celcius
    private String celciusToKelvin(double celsius) {
        double kelvin = celsius/1e+6;
        return String.valueOf(kelvin);
    }

    private String celciusToRankine(double celsius) {
        double rankine = celsius /10000;
        return String.valueOf(rankine);
    }

    private String celciusToNewton(double celsius) {
        double newton = celsius /100;
        return String.valueOf(newton);
    }

    private String celciusToDelisle(double celsius) {
        double delisle = celsius*100;
        return String.valueOf(delisle);
    }

    private String celciusToFarenheit(double celsius) {
        double fahrenheit = celsius* 10000;
        return String.valueOf(fahrenheit);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = fahrenheit*100;
        return String.valueOf(kelvin);
    }

    private String fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit* 10000;
        return String.valueOf(rankine);
    }

    private String fahrenheitToNewton(double fahrenheit) {
        double newton = fahrenheit*1e+8;
        return String.valueOf(newton);
    }

    private String fahrenheitToDelisle(double fahrenheit) {
        double delisle = fahrenheit*1e+10;
        return String.valueOf(delisle);
    }

    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = fahrenheit*1e+6;
        return String.valueOf(celcius);
    }

    //Kelvin
    private String kelvinToRankine(double kelvin) {
        double rankine = kelvin * 100;
        return String.valueOf(rankine);
    }

    private String kelvinToNewton(double kelvin) {
        double newton = kelvin*1e+6;
        return String.valueOf(newton);
    }

    private String kelvinToDelisle(double kelvin) {
        double delisle = kelvin*1e+8;
        return String.valueOf(delisle);
    }

    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin* 10000;
        return String.valueOf(celcius);
    }

    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = kelvin/100;
        return String.valueOf(fahrenheit);
    }

    //Rankine
    private String rankineToNewton(double rankine) {
        double newton = rankine*10000;
        return String.valueOf(newton);
    }

    private String rankineToDelisle(double rankine) {
        double delisle = rankine*1e+6;
        return String.valueOf(delisle);
    }

    private String rankineToCelcius(double rankine) {
        double celcius = rankine*100;
        return String.valueOf(celcius);
    }

    private String rankineToFahrenheit(double rankine) {
        double fahrenheit = rankine /10000;
        return String.valueOf(fahrenheit);
    }

    private String rankineToKelvin(double rankine) {
        double kelvin = rankine /100;
        return String.valueOf(kelvin);
    }

    //Newton
    private String newtonToDelisle(double newton) {
        double delisle = newton*100;
        return String.valueOf(delisle);
    }

    private String newtonToCelcius(double newton) {
        double celcius = newton / 100 ;
        return String.valueOf(celcius);
    }

    private String newtonToFahrenheit(double newton) {
        double fahrenheit = newton /1e+8;
        return String.valueOf(fahrenheit);
    }

    private String newtonToKelvin(double newton) {
        double kelvin = newton/1e+6;
        return String.valueOf(kelvin);
    }

    private String newtonToRankine(double newton) {
        double rankine = newton /10000;
        return String.valueOf(rankine);
    }

    //Delisle
    private String delisleToCelcius(double delisle) {
        double celcius = delisle/10000;
        return String.valueOf(celcius);
    }

    private String delisleToFahrenheit(double delisle) {
        double fahrenheit = delisle/1e+10;
        return String.valueOf(fahrenheit);
    }

    private String delisleToKelvin(double delisle) {
        double kelvin = delisle/1e+8;
        return String.valueOf(kelvin);
    }

    private String delisleToRankine(double delisle) {
        double rankine = delisle/1e+6;
        return String.valueOf(rankine);
    }

    private String delisleToNewton(double delisle) {
        double newton = delisle/100;
        return String.valueOf(newton);
    }
}