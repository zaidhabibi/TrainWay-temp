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

public class TicketMain extends AppCompatActivity{

        public class Ticket{                    // Ticket Object
                private double ticket_price;
                private String route;
                private double day;
                private double time;

                public Ticket(double price, String routeName, double date, double timer){       // Constructor for Ticket
                        ticket_price = price;
                        route = routeName;
                        day = date;
                        time = timer;
                }
                // Accessors
                public double getPrice(){ return ticket_price;}
                public String getRoute(){ return route;}
                public double getDay(){ return day;}
                public double getTime(){ return time;}
                // Mutators
                public void editPrice(double price) {  ticket_price = price;}
                public void editRoute(String Route) {  route = Route;}
                public void editDay(double newDay) {  day = newDay;}
                public void editTime(double newTime) {  time = newTime;}



        }


}
