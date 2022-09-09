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
                            et_Tu.setText(mpsToMphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(mpsToMpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(mpsToKmphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(mpsToKmpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(mpsTokmpsec(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[1])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(mphrToMphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(mphrTompmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(mphrToKmpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(mphrToKmphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(mphrToKmpsec(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[2])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(mpminToMpsec(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(mpminToMphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(mpminToKmphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(mpminToKmpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(mpminToKmps(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[3])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(kmphrToMpsec(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(kmphrTomphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(kmphrToMpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(kmphrToKmpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(kmphrToKmpsec(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[4])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(kmpminToMpsec(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(kmpminToMphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(kmpminToMpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(kmpminToKmphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(val[5])) {
                            et_Tu.setText(kmpminToKmpsec(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(val[5])) {
                        if (tv_TU.getText().toString().equals(val[0])) {
                            et_Tu.setText(KmpsecTOMpsec(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[1])) {
                            et_Tu.setText(KmpsecTOMphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[2])) {
                            et_Tu.setText(KmpsecTOMpmin(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[3])) {
                            et_Tu.setText(KmpsecTOKmphr(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(val[4])) {
                            et_Tu.setText(KmpsecTOKmpmin(Double.parseDouble(tempInput)));
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

    private String mpsToMphr(double mps) {
        double mphr= mps* 3600;
        return String.valueOf(mphr);
    }

    private String mpsToMpmin(double mps) {
        double mpmin= mps *60;
        return String.valueOf(mpmin);
    }

    private String mpsToKmphr(double mps) {
        double kmphr = mps *3.6;
        return String.valueOf(kmphr);
    }

    private String mpsToKmpmin(double mps) {
        double kmpmin = mps * 0.06;
        return String.valueOf(kmpmin);
    }

    private String mpsTokmpsec(double mps) {
        double kmpsec = mps / 1000;
        return String.valueOf(kmpsec);
    }



    //meter/hour

    private String mphrToMphr(double mphr) {
        double mpsec = mphr/3600;
        return String.valueOf(mpsec);
    }

    private String mphrTompmin(double mphr) {
        double mpmin= mphr/60;
        return String.valueOf(mpmin);
    }

    private String mphrToKmphr(double mphr) {
        double kmphr = mphr*1.6667e-5;
        return String.valueOf(kmphr);
    }
    private String mphrToKmpmin(double mphr) {
        double kmpmin = mphr/1000;
        return String.valueOf(kmpmin);
    }

    private String mphrToKmpsec(double mphr) {
        double kmpsec = mphr*2.7778e-7;
        return String.valueOf(kmpsec);
    }



    //meter/min
    private String mpminToMpsec(double mpmin) {
        double mpsec = mpmin/60;
        return String.valueOf(mpsec);
    }

    private String mpminToMphr(double mpmin) {
        double mphr= mpmin*60;
        return String.valueOf(mphr);
    }
    private String mpminToKmphr(double mpmin) {
        double kmphr = mpmin/16.667;
        return String.valueOf(kmphr);
    }

    private String mpminToKmpmin(double mpmin) {
        double kmpmin = mpmin/1000;
        return String.valueOf(kmpmin);
    }

    private String mpminToKmps(double mpmin) {
        double kmps = mpmin/60000;
        return String.valueOf(kmps);
    }





    //kilometer/hour
    private String kmphrToKmpmin(double kmphr) {
        double kmpmin = kmphr/60;
        return String.valueOf(kmpmin);
    }

    private String kmphrToKmpsec(double kmphr) {
        double kmpsec= kmphr/3600;
        return String.valueOf(kmpsec);
    }

    private String kmphrToMpsec(double kmphr) {
        double mpsec= kmphr/3.6;
        return String.valueOf(mpsec);
    }

    private String kmphrTomphr(double kmphr) {
        double mphr = kmphr*1000;
        return String.valueOf(mphr);
    }

    private String kmphrToMpmin(double kmphr) {
        double mpmin = kmphr * 16.667;
        return String.valueOf(mpmin);
    }

    //kmpmin
    private String kmpminToKmpsec(double kmpmin) {
        double kmpsec = kmpmin/60;
        return String.valueOf(kmpsec);
    }

    private String kmpminToMpsec(double kmpmin) {
        double mpsec = kmpmin*16.667;
        return String.valueOf(mpsec);
    }

    private String kmpminToMphr(double kmpmin) {
        double mphr = kmpmin*60000;
        return String.valueOf(mphr);
    }

    private String kmpminToMpmin(double kmpmin) {
        double mpmin= kmpmin * 1000;
        return String.valueOf(mpmin);
    }

    private String kmpminToKmphr(double kmpmin) {
        double kmphr = kmpmin * 60 ;
        return String.valueOf(kmphr);
    }

    //Kmpsec
    private String KmpsecTOMpsec(double kmpsec) {
        double mpsec = kmpsec*1000;
        return String.valueOf(mpsec);
    }

    private String KmpsecTOMphr(double kmpsec) {
        double mphr= kmpsec*3.6e+6;
        return String.valueOf(mphr);
    }

    private String KmpsecTOMpmin(double kmpsec) {
        double mpmin = kmpsec*60000;
        return String.valueOf(mpmin);
    }

    private String KmpsecTOKmphr(double kmpsec) {
        double kmphr = kmpsec*3600;
        return String.valueOf(kmphr);
    }

    private String KmpsecTOKmpmin(double kmpsec) {
        double kmpmin = kmpsec*60;
        return String.valueOf(kmpmin);
    }

}