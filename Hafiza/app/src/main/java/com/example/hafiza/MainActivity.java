package com.example.hafiza;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    TextView oyuncu1, oyuncu2;

    ImageView soru1, soru2, soru3, soru4, soru5, soru6, soru7, soru8, soru9, soru10, soru11, soru12;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int resim101, resim102, resim103, resim104, resim105, resim106,
        resim201, resim202, resim203, resim204, resim205, resim206;

    int firstCard,secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int puan1 = 0, puan2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oyuncu1 = (TextView) findViewById(R.id.textView);
        oyuncu2 = (TextView) findViewById(R.id.textView2);

        soru1 = (ImageView) findViewById(R.id.soru1);
        soru2 = (ImageView) findViewById(R.id.soru2);
        soru3 = (ImageView) findViewById(R.id.soru3);
        soru4 = (ImageView) findViewById(R.id.soru4);
        soru5 = (ImageView) findViewById(R.id.soru5);
        soru6 = (ImageView) findViewById(R.id.soru6);
        soru7 = (ImageView) findViewById(R.id.soru7);
        soru8 = (ImageView) findViewById(R.id.soru8);
        soru9 = (ImageView) findViewById(R.id.soru9);
        soru10 = (ImageView) findViewById(R.id.soru10);
        soru11 = (ImageView) findViewById(R.id.soru11);
        soru12 = (ImageView) findViewById(R.id.soru12);

        soru1.setTag("0");
        soru2.setTag("1");
        soru3.setTag("2");
        soru4.setTag("3");
        soru5.setTag("4");
        soru6.setTag("5");
        soru7.setTag("6");
        soru8.setTag("7");
        soru9.setTag("8");
        soru10.setTag("9");
        soru11.setTag("10");
        soru12.setTag("11");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        oyuncu1.setTextColor(Color.RED);

        soru1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru1, theCard);

            }
        });

        soru2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru2, theCard);

            }
        });

        soru3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru3, theCard);

            }
        });

        soru4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru4, theCard);

            }
        });

        soru5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru5, theCard);

            }
        });

        soru6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru6, theCard);

            }
        });

        soru7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru7, theCard);

            }
        });

        soru8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru8, theCard);

            }
        });

        soru9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru9, theCard);

            }
        });

        soru10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru10, theCard);

            }
        });

        soru11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru11, theCard);

            }
        });

        soru12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                yap(soru12, theCard);

            }
        });

    }

    private void yap(ImageView iv, int card){
        if(cardsArray[card]==101){
            iv.setImageResource(resim101);
        }else if(cardsArray[card]==102){
            iv.setImageResource(resim102);
        }else if(cardsArray[card]==103){
            iv.setImageResource(resim103);
        }else if(cardsArray[card]==104){
            iv.setImageResource(resim104);
        }else if(cardsArray[card]==105){
            iv.setImageResource(resim105);
        }else if(cardsArray[card]==106){
            iv.setImageResource(resim106);
        }else if(cardsArray[card]==201){
            iv.setImageResource(resim201);
        }else if(cardsArray[card]==202){
            iv.setImageResource(resim202);
        }else if(cardsArray[card]==203){
            iv.setImageResource(resim203);
        }else if(cardsArray[card]==204){
            iv.setImageResource(resim204);
        }else if(cardsArray[card]==205){
            iv.setImageResource(resim205);
        }else if(cardsArray[card]==206){
            iv.setImageResource(resim206);
        }

        if(cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }

            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }

            cardNumber = 1;
            clickedSecond = card;

            soru1.setEnabled(false);
            soru2.setEnabled(false);
            soru3.setEnabled(false);
            soru4.setEnabled(false);
            soru5.setEnabled(false);
            soru6.setEnabled(false);
            soru7.setEnabled(false);
            soru8.setEnabled(false);
            soru9.setEnabled(false);
            soru10.setEnabled(false);
            soru11.setEnabled(false);
            soru12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable(){
                public void run(){
                    calculate();
                }
            }, 1000);


        }

    }

        private void calculate() {
            if (firstCard == secondCard) {
                if (clickedFirst == 0) {
                    soru1.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 1) {
                    soru2.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 2) {
                    soru3.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 3) {
                    soru4.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 4) {
                    soru5.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 5) {
                    soru6.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 6) {
                    soru7.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 7) {
                    soru8.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 8) {
                    soru9.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 9) {
                    soru10.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 10) {
                    soru11.setVisibility(View.INVISIBLE);
                } else if (clickedFirst == 11) {
                    soru12.setVisibility(View.INVISIBLE);
                }

                if (clickedSecond == 0) {
                    soru1.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 1) {
                    soru2.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 2) {
                    soru3.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 3) {
                    soru4.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 4) {
                    soru5.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 5) {
                    soru6.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 6) {
                    soru7.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 7) {
                    soru8.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 8) {
                    soru9.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 9) {
                    soru10.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 10) {
                    soru11.setVisibility(View.INVISIBLE);
                } else if (clickedSecond == 11) {
                    soru12.setVisibility(View.INVISIBLE);
                }

                if (turn == 1) {
                    puan1++;
                    oyuncu1.setText("P1 = " + puan1);
                } else if (turn == 2) {
                    puan2++;
                    oyuncu2.setText("P2 = " + puan2);
                }

            } else {
                soru1.setImageResource(R.drawable.soru);
                soru2.setImageResource(R.drawable.soru);
                soru3.setImageResource(R.drawable.soru);
                soru4.setImageResource(R.drawable.soru);
                soru5.setImageResource(R.drawable.soru);
                soru6.setImageResource(R.drawable.soru);
                soru7.setImageResource(R.drawable.soru);
                soru8.setImageResource(R.drawable.soru);
                soru9.setImageResource(R.drawable.soru);
                soru10.setImageResource(R.drawable.soru);
                soru11.setImageResource(R.drawable.soru);
                soru12.setImageResource(R.drawable.soru);

                if (turn == 1) {
                    turn = 2;
                    oyuncu1.setTextColor(Color.BLACK);
                    oyuncu2.setTextColor(Color.RED);
                }else if (turn == 2) {
                    turn = 1;
                    oyuncu2.setTextColor(Color.BLACK);
                    oyuncu1.setTextColor(Color.RED);
                }

            }

            soru1.setEnabled(true);
            soru2.setEnabled(true);
            soru3.setEnabled(true);
            soru4.setEnabled(true);
            soru5.setEnabled(true);
            soru6.setEnabled(true);
            soru7.setEnabled(true);
            soru8.setEnabled(true);
            soru9.setEnabled(true);
            soru10.setEnabled(true);
            soru11.setEnabled(true);
            soru12.setEnabled(true);

            end();

        }


    private void end(){
    if(soru1.getVisibility()==View.INVISIBLE &&
    soru2.getVisibility()==View.INVISIBLE &&
    soru3.getVisibility()==View.INVISIBLE &&
    soru4.getVisibility()==View.INVISIBLE &&
    soru5.getVisibility()==View.INVISIBLE &&
    soru6.getVisibility()==View.INVISIBLE &&
    soru7.getVisibility()==View.INVISIBLE &&
    soru8.getVisibility()==View.INVISIBLE &&
    soru9.getVisibility()==View.INVISIBLE &&
    soru10.getVisibility()==View.INVISIBLE &&
    soru11.getVisibility()==View.INVISIBLE &&
    soru12.getVisibility()==View.INVISIBLE) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Oyun Bitti!\nP1: " + puan1 + "\nP2: " + puan2)
                .setCancelable(false)
                .setPositiveButton("Yeni", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    }

    private void frontOfCardsResources(){
        resim101 = R.drawable.chili;
        resim102 = R.drawable.fish;
        resim103 = R.drawable.gingerbread;
        resim104 = R.drawable.meat;
        resim105 = R.drawable.pancakes;
        resim106 = R.drawable.potatoes;
        resim201 = R.drawable.chili2;
        resim202 = R.drawable.fish2;
        resim203 = R.drawable.gingerbread2;
        resim204 = R.drawable.meat2;
        resim205 = R.drawable.pancakes2;
        resim206 = R.drawable.potatoes2;

    }

}