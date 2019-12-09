package com.example.flipview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Declared variables as private for the flip animation of the button.
    private Button flip;
    private ImageView im;
    private Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup the variables to find views by id.
        flip=findViewById(R.id.flip_click);
        im=findViewById(R.id.image_front);

        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //I named my method flipCard() to make my own flip animation when I click the button.
                flipCard();
            }
        });
    }
       //The coding mechanism I used to make my method perform the flip animation.
        private void flipCard(){

        rand= new Random(); //Setting the variable name rand to object random.
        int a = rand.nextInt(2); //Declared the variable a to get the next integer of flip animation at number 2.

        if(a==1){ //Using an if else statement to set the variable of a to integer 1.

        im.setImageResource(R.drawable.front_card);//Setting the variable im to Image Resource to reference the front_card id.
            Toast.makeText(getApplicationContext(), "Front",Toast.LENGTH_SHORT).show();//To make a toast message displaying "Front" when clicked.
        }
        else if (a==0){// Using else if to  set variable a to 0 helping the the animation flip to the back of the card.

            im.setImageResource(R.drawable.back_card);
            Toast.makeText(getApplicationContext(), "Back",Toast.LENGTH_SHORT).show();

        }

        }
}
