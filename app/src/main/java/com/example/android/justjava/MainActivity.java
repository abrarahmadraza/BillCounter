package com.example.android.justjava;



import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

      boolean state=false;

    int number_of_coffee=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void toggle(View view)
    {
        if(state==true)
        {state=false; TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
            priceTextView.setText("₹0");}
        else
            state=true;
    }
    public void submitOrder(View view) {

        if(state==true)
        displayPrice("Total Price = " + NumberFormat.getCurrencyInstance().format(number_of_coffee*5) + "\n Thank You!");
    }
    public void increment(View view)
    {
        number_of_coffee++;
        display(number_of_coffee);
    }
    public void decrement(View view)
    {   if(number_of_coffee!=0)
    {number_of_coffee--;
        display(number_of_coffee);}
        else
            display(number_of_coffee);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
    public void mdisplay(View view)
    {
        TextView m=(TextView) findViewById(R.id.message);
        m.setText("Fuck You");
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}