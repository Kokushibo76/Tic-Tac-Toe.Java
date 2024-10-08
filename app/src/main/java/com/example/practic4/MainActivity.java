package com.example.practic4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity {

    SharedPreferences themeSettings;
    SharedPreferences.Editor settingsEditor;
    ImageButton imageTheme;

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private  String startGame="x";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xcount=0,ocount=0,i=0;
    private TextView scorex,scoreo;
    private Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        themeSettings=getSharedPreferences("SETTINGS", MODE_PRIVATE);

        if(!themeSettings.contains("MODE_NIGHT_ON")){
            settingsEditor = themeSettings.edit();
            settingsEditor.putBoolean("MODE_NIGHT_ON", false);
            settingsEditor.apply();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            Toast.makeText(this, "Запуск", Toast.LENGTH_SHORT).show();
        }else{
            setCurrentTheme();
        }

        setContentView(R.layout.activity_main);

        imageTheme = findViewById(R.id.imgBtn);
        updateImageButton();

        imageTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(themeSettings.getBoolean("MODE_NIGHT_ON",false)){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", false);
                    settingsEditor.apply();
                    Toast.makeText(MainActivity.this, "Темная тема отключена", Toast.LENGTH_SHORT).show();
                }else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", true);
                    settingsEditor.apply();
                    Toast.makeText(MainActivity.this, "Темная тема включена", Toast.LENGTH_SHORT).show();
                }
                updateImageButton();
            }
        });



        button1=findViewById(R.id.buttonimage1);
        button2=findViewById(R.id.buttonimage2);
        button3=findViewById(R.id.buttonimage3);
        button4=findViewById(R.id.buttonimage4);
        button5=findViewById(R.id.buttonimage5);
        button6=findViewById(R.id.buttonimage6);
        button7=findViewById(R.id.buttonimage7);
        button8=findViewById(R.id.buttonimage8);
        button9=findViewById(R.id.buttonimage9);

        scorex=findViewById(R.id.ScoreX);
        scoreo=findViewById(R.id.ScoreY);

        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetValues();
                xcount=0;
                ocount=0;
                scorex.setText("Первыый игрок:"+String.valueOf(xcount));
                scoreo.setText("Второй игрок:"+String.valueOf(ocount));

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button1.setImageResource(R.drawable.x);
                    b1=1;
                    i++;

                }
                else {
                    button1.setImageResource(R.drawable.o);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button2.setImageResource(R.drawable.x);
                    b2=1;
                    i++;

                }
                else {
                    button2.setImageResource(R.drawable.o);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button3.setImageResource(R.drawable.x);
                    b3=1;
                    i++;

                }
                else {
                    button3.setImageResource(R.drawable.o);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button4.setImageResource(R.drawable.x);
                    b4=1;
                    i++;

                }
                else {
                    button4.setImageResource(R.drawable.o);
                    b4=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button5.setImageResource(R.drawable.x);
                    b5=1;
                    i++;

                }
                else {
                    button5.setImageResource(R.drawable.o);
                    b5=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button6.setImageResource(R.drawable.x);
                    b6=1;
                    i++;

                }
                else {
                    button6.setImageResource(R.drawable.o);
                    b6=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button7.setImageResource(R.drawable.x);
                    b7=1;
                    i++;

                }
                else {
                    button7.setImageResource(R.drawable.o);
                    b7=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button8.setImageResource(R.drawable.x);
                    b8=1;
                    i++;

                }
                else {
                    button8.setImageResource(R.drawable.o);
                    b8=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("x"))
                {
                    button9.setImageResource(R.drawable.x);
                    b9=1;
                    i++;

                }
                else {
                    button9.setImageResource(R.drawable.o);
                    b9=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }

        });


    }
    private void winningGame()
    {
        //FOR X
        if((b1==1) && (b2==1) &&(b3==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if ((b4==1) &&(b5==1)&&(b6==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if ((b7==1) && (b8==1) && (b9==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if ((b1==1)&&(b4==1)&&(b7==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if((b2==1)&&(b5==1)&&(b8==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if((b3==1)&&(b6==1)&&(b9==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if((b1==1)&&(b5==1)&&(b9==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }
        else if((b3==1)&&(b5==1)&&(b7==1))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Первый игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Первый игрок:"+String.valueOf(xcount));
        }

        //FOR Y
        if((b1==0) && (b2==0) &&(b3==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if ((b4==0) &&(b5==0)&&(b6==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if ((b7==0) && (b8==0) && (b9==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if ((b1==0)&&(b4==0)&&(b7==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if((b2==0)&&(b5==0)&&(b8==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if((b3==0)&&(b6==0)&&(b9==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if((b1==0)&&(b5==0)&&(b9==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else if((b3==0)&&(b5==0)&&(b7==0))
        {
            AlertDialog.Builder builder= new AlertDialog.Builder(this);
            builder.setMessage("Второй игрок победил").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();

                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Второй игрок"+String.valueOf(ocount));
        }
        else {
            if(i==9)
            {
                AlertDialog.Builder builder= new AlertDialog.Builder(this);
                builder.setMessage("Ничья").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);
                        resetValues();

                    }
                });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        }
    }
    private void choosePlayer()
    {
        if(startGame.equals("x"))
        {
            startGame="o";

        }
        else {
            startGame="x";
        }
    }

    private void resetValues()
    {
        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }


    private void updateImageButton() {
        if(themeSettings.getBoolean("MODE_NIGHT_ON", false)){
            imageTheme.setImageResource(R.drawable.img);
        }else{
            imageTheme.setImageResource(R.drawable.moon);
        }
    }

    private void setCurrentTheme() {
        if(themeSettings.getBoolean("MODE_NIGHT_ON", false)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

}