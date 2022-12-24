package com.example.xov2;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Set global variables
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reload_btn;
    TextView tv,tv2;
    int count_comp_actions = 0;
    int player_wins = 0;
    int comp_wins = 0;
    boolean win;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set Button

        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);

        btn1 = findViewById(R.id.btn1);
        btn1.setBackgroundColor(0xFF8080FF);

        btn2 = findViewById(R.id.btn2);
        btn2.setBackgroundColor(0xFF8080FF);

        btn3 = findViewById(R.id.btn3);
        btn3.setBackgroundColor(0xFF8080FF);

        btn4 = findViewById(R.id.btn4);
        btn4.setBackgroundColor(0xFF8080FF);

        btn5 = findViewById(R.id.btn5);
        btn5.setBackgroundColor(0xFF8080FF);

        btn6 = findViewById(R.id.btn6);
        btn6.setBackgroundColor(0xFF8080FF);

        btn7 = findViewById(R.id.btn7);
        btn7.setBackgroundColor(0xFF8080FF);

        btn8 = findViewById(R.id.btn8);
        btn8.setBackgroundColor(0xFF8080FF);

        btn9 = findViewById(R.id.btn9);
        btn9.setBackgroundColor(0xFF8080FF);

        reload_btn = findViewById(R.id.reload);
        reload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reload();
            }
        });

        // Main logic - User
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("X");                      // Add X to button
                btn1.setEnabled(false);                 // Disabled the button
                btn1.setBackgroundColor(0xff007fff);    // Set new background color
                win = winner();                         // Check if the game is done and check if hava a winner
                if(!win)comp_action();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText("X");
                btn2.setEnabled(false);
                btn2.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setText("X");
                btn3.setEnabled(false);
                btn3.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setText("X");
                btn4.setEnabled(false);
                btn4.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setText("X");
                btn5.setEnabled(false);
                btn5.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setText("X");
                btn6.setEnabled(false);
                btn6.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn7.setText("X");
                btn7.setEnabled(false);
                btn7.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn8.setText("X");
                btn8.setEnabled(false);
                btn8.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn9.setText("X");
                btn9.setEnabled(false);
                btn9.setBackgroundColor(0xff007fff);
                win = winner();
                if(!win)comp_action();
            }
        });
    }

    // Btn Cases for computer
    @SuppressLint("ResourceAsColor")
    public void comp_action(){
        int btnClick = 1 + (int)(Math.random()*9);
        if (count_comp_actions<4){
            switch (btnClick){
                case (1):
                    if(btn1.getText().length()==0 && tv.length()==0) {
                        btn1.setText("O");
                        btn1.setEnabled(false);
                        btn1.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (2):
                    if(btn2.getText().length()==0 && tv.length()==0){
                        btn2.setText("O") ;
                        btn2.setEnabled(false);
                        btn2.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (3):
                    if(btn3.getText().length()==0 && tv.length()==0){
                        btn3.setText("O") ;
                        btn3.setEnabled(false);
                        btn3.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (4):
                    if(btn4.getText().length()==0 && tv.length()==0){
                        btn4.setText("O") ;
                        btn4.setEnabled(false);
                        btn4.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (5):
                    if(btn5.getText().length()==0 && tv.length()==0){
                        btn5.setText("O") ;
                        btn5.setEnabled(false);
                        btn5.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;
                case (6):
                    if(btn6.getText().length()==0 && tv.length()==0){
                        btn6.setText("O") ;
                        btn6.setEnabled(false);
                        btn6.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;
                case (7):

                    if(btn7.getText().length()==0 && tv.length()==0){
                        btn7.setText("O") ;
                        btn7.setEnabled(false);
                        btn7.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (8):
                    if(btn8.getText().length()==0 && tv.length()==0){
                        btn8.setText("O") ;
                        btn8.setEnabled(false);
                        btn8.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;

                case (9):
                    if(btn9.getText().length()==0 && tv.length()==0){
                        btn9.setText("O") ;
                        btn9.setEnabled(false);
                        btn9.setBackgroundColor(0xFF80FF80);
                        win = winner();
                        count_comp_actions+=1;
                    }else {
                        comp_action();
                    }break;
            }
        }
    }

    // Checking if someone win
    public boolean winner(){
        //Horizontal winner
        if((btn1.getText()=="X" && btn2.getText()=="X" && btn3.getText()=="X") ||
                (btn1.getText()=="O" && btn2.getText()=="O" && btn3.getText()=="O")){
            if(btn1.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            if(btn1.getText()=="O") {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }
        if((btn4.getText()=="X" && btn5.getText()=="X" && btn6.getText()=="X") ||
                (btn4.getText()=="O" && btn5.getText()=="O" && btn6.getText()=="O")){
            if(btn4.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins += 1;
                tv2.setText(player_wins + " -      Player | Computer - " + comp_wins);
            }
            block_btns();
            return true;
        }
        if((btn7.getText()=="X" && btn8.getText()=="X" && btn9.getText()=="X") ||
                (btn7.getText()=="O" && btn8.getText()=="O" && btn9.getText()=="O")){
            if(btn7.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }

        //Vertical winner
        if((btn1.getText()=="X" && btn4.getText()=="X" && btn7.getText()=="X") ||
                (btn1.getText()=="O" && btn4.getText()=="O" && btn7.getText()=="O")) {
            if (btn1.getText() == "X") {
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }
        if((btn2.getText()=="X" && btn5.getText()=="X" && btn8.getText()=="X") ||
                (btn2.getText()=="O" && btn5.getText()=="O" && btn8.getText()=="O")) {
            if (btn2.getText() == "X") {
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }

        if((btn3.getText()=="X" && btn6.getText()=="X" && btn9.getText()=="X") ||
                (btn3.getText()=="O" && btn6.getText()=="O" && btn9.getText()=="O")){
            if(btn3.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }

        //X winner
        if((btn1.getText()=="X" && btn5.getText()=="X" && btn9.getText()=="X") ||
                (btn1.getText()=="O" && btn5.getText()=="O" && btn9.getText()=="O")){
            if(btn1.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }

        if((btn3.getText()=="X" && btn5.getText()=="X" && btn7.getText()=="X") ||
                (btn3.getText()=="O" && btn5.getText()=="O" && btn7.getText()=="O")){
            if(btn3.getText()=="X"){
                tv.setText(R.string.player_message_win);
                player_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            else {
                tv.setText(R.string.comp_message_win);
                comp_wins+=1;
                tv2.setText(player_wins+" -      Player | Computer - "+comp_wins);
            }
            block_btns();
            return true;
        }
        return false;
    }

    // Function for return all buttons original values
    public void reload(){

        tv.setText("");

        btn1.setText("");
        btn1.setEnabled(true);
        btn1.setBackgroundColor(0xFF8080FF);

        btn2.setText("");
        btn2.setEnabled(true);
        btn2.setBackgroundColor(0xFF8080FF);

        btn3.setText("");
        btn3.setEnabled(true);
        btn3.setBackgroundColor(0xFF8080FF);

        btn4.setText("");
        btn4.setEnabled(true);
        btn4.setBackgroundColor(0xFF8080FF);

        btn5.setText("");
        btn5.setEnabled(true);
        btn5.setBackgroundColor(0xFF8080FF);

        btn6.setText("");
        btn6.setEnabled(true);
        btn6.setBackgroundColor(0xFF8080FF);

        btn7.setText("");
        btn7.setEnabled(true);
        btn7.setBackgroundColor(0xFF8080FF);

        btn8.setText("");
        btn8.setEnabled(true);
        btn8.setBackgroundColor(0xFF8080FF);

        btn9.setText("");
        btn9.setEnabled(true);
        btn9.setBackgroundColor(0xFF8080FF);

        count_comp_actions = 0;
    }

    // Block all buttons
    public void block_btns(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
}