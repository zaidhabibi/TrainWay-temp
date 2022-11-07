package com.example.trainway;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class UserManageActivity extends AppCompatActivity {

    //initialize variables
    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword;
    private Button signupButton;
    private TextView loginRedirectText;

    //check specific user's purchase history
    public void checkPurchaseHistory(View view){
        Intent intent = new Intent(getApplicationContext(), PurchaseHistoryActivity.class);
        startActivity(intent);
    }

    //jump to a user's profile page
    public void jumpToProfile(View view){
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);
    }

    //admin exectutions for user management: Ban User, unban user
    public void adminExecutions() {

        execution_button_setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                //get user
                String user = signupEmail.getText().toString().trim();

                if (operate_user_type.getChekcedRadioButtonID()=R.id.ban){

                    //open database

                    //ban user
                    String ban_user = "UPDATE user SET ban = 1 WHERE user = " + user;
                    //use the database to execute the ban_user

                    //display user has been banned
                    Toast.makeText(UserManageActivity.this, "User has been banned", Toast.LENGTH_SHORT).show();
                }
                //else unban user
                else{

                    //open database

                    //unban user
                    String unban_user = "UPDATE user SET ban = 0 WHERE user = " + user;
                    //use the database to execute the unban_user

                    //display user has been unbanned
                    Toast.makeText(UserManageActivity.this, "User has been unbanned", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //quit the current login session
    public void setSession() {

    session_button_setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            //go to the login page
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            }
        });
    }
}






