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

public class speed_calculation extends AppCompatActivity {
    CardView cv_FU, cv_TU, cv_C;
    RelativeLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    TextView tv_FU, tv_TU;
    EditText et_FU, et_Tu;
    final String[] val = new String[]{
            "m/sec",
            "m/hr",
            "m/min",
            "km/hr",
            "km/min",
            "km/sec"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_calculation);
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
        et_Tu = findViewById(R.id.et_toUnit);

        cv_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_FU.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_FU.setError("Please enter some value");
                } else {
                    if (tv_FU.getText().toString().equals(val[0])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(celciusToFarenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(celciusToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(celciusToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(celciusToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(celciusToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[1])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(fahrenheitToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(fahrenheitToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(fahrenheitToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(fahrenheitToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(fahrenheitToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[2])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(kelvinToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(kelvinToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(kelvinToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(kelvinToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(kelvinToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[3])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(rankineToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(rankineToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(rankineToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(rankineToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(rankineToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[4])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(newtonToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(newtonToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(newtonToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(newtonToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(newtonToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[5])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(delisleToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(delisleToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(delisleToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(delisleToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(delisleToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_TU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_calculation.this);
                builder.setTitle("choose Unit");

                final String[] f = new String[]{
                        "m/sec",
                        "m/hr",
                        "m/min",
                        "km/hr",
                        "km/min",
                        "km/sec"
                };

                builder.setSingleChoiceItems(
                        f,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(f).get(i);
                                toUnit = selectedItem;
                                tv_TU.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_FU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_calculation.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "m/sec",
                        "m/hr",
                        "m/min",
                        "km/hr",
                        "km/min",
                        "km/sec"
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
                                fromUnit = selectedItem;
                                tv_FU.setText(fromUnit);

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

    //meter/second
    private String celciusToKelvin(double celsius) {
        double kelvin = celsius *3600;
        return String.valueOf(kelvin);
    }

    private String celciusToRankine(double celsius) {
        double rankine = celsius *60;
        return String.valueOf(rankine);
    }

    private String celciusToNewton(double celsius) {
        double newton = celsius * 3.6;
        return String.valueOf(newton);
    }

    private String celciusToDelisle(double celsius) {
        double delisle = celsius / 16.667;
        return String.valueOf(delisle);
    }

    private String celciusToFarenheit(double celsius) {
        double fahrenheit = celsius/1000;
        return String.valueOf(fahrenheit);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = fahrenheit/60;
        return String.valueOf(kelvin);
    }

    private String fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit /1000;
        return String.valueOf(rankine);
    }

    private String fahrenheitToNewton(double fahrenheit) {
        double newton = fahrenheit/60000;
        return String.valueOf(newton);
    }

    private String fahrenheitToDelisle(double fahrenheit) {
        double delisle = fahrenheit/3.6e+6;
        return String.valueOf(delisle);
    }

    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = fahrenheit/3600;
        return String.valueOf(celcius);
    }

    //Kelvin
    private String kelvinToRankine(double kelvin) {
        double rankine = kelvin /16.667;
        return String.valueOf(rankine);
    }

    private String kelvinToNewton(double kelvin) {
        double newton = kelvin/1000;
        return String.valueOf(newton);
    }

    private String kelvinToDelisle(double kelvin) {
        double delisle = kelvin/60000;
        return String.valueOf(delisle);
    }

    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin /60;
        return String.valueOf(celcius);
    }

    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = kelvin*60;
        return String.valueOf(fahrenheit);
    }

    //Rankine
    private String rankineToNewton(double rankine) {
        double newton = rankine/60;
        return String.valueOf(newton);
    }

    private String rankineToDelisle(double rankine) {
        double delisle = rankine/3600;
        return String.valueOf(delisle);
    }

    private String rankineToCelcius(double rankine) {
        double celcius = rankine/3.6;
        return String.valueOf(celcius);
    }

    private String rankineToFahrenheit(double rankine) {
        double fahrenheit = rankine *1000;
        return String.valueOf(fahrenheit);
    }

    private String rankineToKelvin(double rankine) {
        double kelvin = rankine * 16.667;
        return String.valueOf(kelvin);
    }

    //Newton
    private String newtonToDelisle(double newton) {
        double delisle = newton/60;
        return String.valueOf(delisle);
    }

    private String newtonToCelcius(double newton) {
        double celcius = newton*16.667;
        return String.valueOf(celcius);
    }

    private String newtonToFahrenheit(double newton) {
        double fahrenheit = newton*60000;
        return String.valueOf(fahrenheit);
    }

    private String newtonToKelvin(double newton) {
        double kelvin = newton * 1000;
        return String.valueOf(kelvin);
    }

    private String newtonToRankine(double newton) {
        double rankine = newton * 60 ;
        return String.valueOf(rankine);
    }

    //Delisle
    private String delisleToCelcius(double delisle) {
        double celcius = delisle*1000;
        return String.valueOf(celcius);
    }

    private String delisleToFahrenheit(double delisle) {
        double fahrenheit = delisle*3.6e+6;
        return String.valueOf(fahrenheit);
    }

    private String delisleToKelvin(double delisle) {
        double kelvin = delisle*60000;
        return String.valueOf(kelvin);
    }

    private String delisleToRankine(double delisle) {
        double rankine = delisle*3600;
        return String.valueOf(rankine);
    }

    private String delisleToNewton(double delisle) {
        double newton = delisle*60;
        return String.valueOf(newton);
    }

}