package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class weight_calculation extends AppCompatActivity {

    CardView cv_fU, cv_TU, cv_C;
    RelativeLayout mCLayout;
    String FU = "Kilogram";
    String TU = "Kilogram";
    TextView tv_FU, tv_TU;
    EditText et_FU, et_TU;
    final String[] vals = new String[]{
            "Kilogram",
            "Gram",
            "Exa Gram",
            "Peta Gram",
            "Tera Gram",
            "Giga Gram"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_calculation);
        getSupportActionBar().hide();

        cv_fU = findViewById(R.id.fromUnit);
        cv_TU = findViewById(R.id.toUnit);
        cv_C = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_FU = findViewById(R.id.tv_fromUnit);
        tv_TU = findViewById(R.id.tv_toUnit);

        tv_FU.setText(vals[0]);
        tv_TU.setText(vals[0]);

        et_FU = findViewById(R.id.et_fromUnit);
        et_TU = findViewById(R.id.et_toUnit);

        cv_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_FU.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_FU.setError("Please enter some value");
                } else {
                    if (tv_FU.getText().toString().equals(vals[0])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(kilogramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(kilogramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(kilogramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(kilogramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(kilogramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(vals[1])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(gramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(gramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(gramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(gramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(gramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(vals[2])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(exaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(exaGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(exaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(exaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(exaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(vals[3])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(petaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(petaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(petaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(vals[4])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(teraGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(teraGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(teraGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(teraGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(tempInput);
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(teraGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_FU.getText().toString().equals(vals[5])) {
                        if (tv_TU.getText().toString().equals(vals[0])) {
                            et_TU.setText(gigaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[1])) {
                            et_TU.setText(gigaGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[2])) {
                            et_TU.setText(gigaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[3])) {
                            et_TU.setText(gigaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[4])) {
                            et_TU.setText(gigaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_TU.getText().toString().equals(vals[5])) {
                            et_TU.setText(tempInput);
                        }
                    }
                }
            }
        });


        cv_TU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_calculation.this);
                builder.setTitle("choose Unit");

                final String[] f = new String[]{
                        "Kilogram",
                        "Gram",
                        "Exa Gram",
                        "Peta Gram",
                        "Tera Gram", "Giga Gram"
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

        cv_fU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_calculation.this);
                builder.setTitle("choose Unit");

                final String[] f = new String[]{
                        "Kilogram",
                        "Gram",
                        "Exa Gram",
                        "Peta Gram",
                        "Tera Gram", "Giga Gram"
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

    //Kilogram
    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }

    private String kilogramToExaGram(double kilogram) {
        double exaGram = kilogram * 1.0E-15;
        return String.valueOf(exaGram);
    }

    private String kilogramToPetaGram(double kilogram) {
        double petaGram = kilogram * 1.0E-12;
        return String.valueOf(petaGram);
    }

    private String kilogramToTeraGram(double kilogram) {
        double teraGram = kilogram * 1.0E-9;
        return String.valueOf(teraGram);
    }

    private String kilogramToGigaGram(double kilogram) {
        double gigaGram = kilogram / 1000000;
        return String.valueOf(gigaGram);
    }

    //Gram
    private String gramToExaGram(double gram) {
        double exaGram = gram * 1.0E-18;
        return String.valueOf(exaGram);
    }

    private String gramToPetaGram(double gram) {
        double petaGram = gram * 1.0E-15;
        return String.valueOf(petaGram);
    }

    private String gramToTeraGram(double gram) {
        double teraGram = gram * 1.0E-12;
        return String.valueOf(teraGram);
    }

    private String gramToGigaGram(double gram) {
        double gigaGram = gram * 1.0E-9;
        return String.valueOf(gigaGram);
    }

    private String gramToKiloGram(double gram) {
        double kiloGram = gram * 0.001;
        return String.valueOf(kiloGram);
    }

    //Exa Gram
    private String exaGramToPetaGram(double exaGram) {
        double petaGram = exaGram * 1000;
        return String.valueOf(petaGram);
    }

    private String exaGramToTeraGram(double exaGram) {
        double teraGram = exaGram * 1000000;
        return String.valueOf(teraGram);
    }

    private String exaGramToGigaGram(double exaGram) {
        double gigaGram = exaGram * 1e+9;
        return String.valueOf(gigaGram);
    }

    private String exaGramToKiloGram(double exaGram) {
        double kiloGram = exaGram * 1.0E+15;
        return String.valueOf(kiloGram);
    }

    private String exaGramToGram(double exaGram) {
        double gram = exaGram * 1.0E+18;
        return String.valueOf(gram);
    }

    //Peta Gram
    private String petaGramToTeraGram(double petaGram) {
        double teraGram = petaGram * 1000;
        return String.valueOf(teraGram);
    }

    private String petaGramToGigaGram(double petaGram) {
        double gigaGram = petaGram * 1e+6;
        return String.valueOf(gigaGram);
    }

    private String petaGramToKiloGram(double petaGram) {
        double kiloGram = petaGram * 1e+12;
        return String.valueOf(kiloGram);
    }

    private String petaGramToGram(double petaGram) {
        double Gram = petaGram * 1e+15;
        return String.valueOf(Gram);
    }

    private String petaGramToExaGram(double petaGram) {
        double exaGram = petaGram / 1000;
        return String.valueOf(exaGram);
    }

    //Tera Gram
    private String teraGramToGigaGram(double teraGram) {
        double gigaGram = teraGram * 1000;
        return String.valueOf(gigaGram);
    }

    private String teraGramToKiloGram(double teraGram) {
        double kiloGram = teraGram * 1e+9;
        return String.valueOf(kiloGram);
    }

    private String teraGramToGram(double teraGram) {
        double Gram = teraGram * 1e+12;
        return String.valueOf(Gram);
    }

    private String teraGramToExaGram(double teraGram) {
        double exaGram = teraGram / 1e+6;
        return String.valueOf(exaGram);
    }

    private String teraGramToPetaGram(double teraGram) {
        double petaGram = teraGram / 1000;
        return String.valueOf(petaGram);
    }

    //Giga Gram
    private String gigaGramToKiloGram(double gigaGram) {
        double kiloGram = gigaGram * 1e+6;
        return String.valueOf(kiloGram);
    }

    private String gigaGramToGram(double gigaGram) {
        double Gram = gigaGram * 1e+9;
        return String.valueOf(Gram);
    }

    private String gigaGramToExaGram(double gigaGram) {
        double exaGram = gigaGram / 1e+9;
        return String.valueOf(exaGram);
    }

    private String gigaGramToPetaGram(double gigaGram) {
        double petaGram = gigaGram / 1e+6;
        return String.valueOf(petaGram);
    }

    private String gigaGramToTeraGram(double gigaGram) {
        double teraGram = gigaGram / 1000;
        return String.valueOf(teraGram);
    }

}