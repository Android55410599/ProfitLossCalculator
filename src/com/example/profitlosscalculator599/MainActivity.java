package com.example.profitlosscalculator599;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button btnnext599;
	private EditText edttend599, edtprice1599, edtprice2599;
	private Float tend599, price1599, pricetop, price2599, commission599, pricetop599, priceunder599, resulttop599, totaltop599, price_under599;
	private int strok1599, strok2599;
	private TextView txtcommission599, txtpricetop599, txtanspricetop599, txtstrok1599,
			txttotalpricetop599, txtstrok2599, txtpriceunder599, txtanspriceunder599,
			txttotalpriceunder599, txttextl2, txttextp2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edttend599 = (EditText) findViewById(R.id.editTextTende599);
		edtprice1599 = (EditText) findViewById(R.id.EditTextPrice599);
		edtprice2599 = (EditText) findViewById(R.id.EditText02599);
	
		btnnext599 = (Button) findViewById(R.id.btnnext);
		
		
		btnnext599.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {		
				
					tend599 = Float.valueOf(edttend599.getText().toString());
					price1599 = Float.valueOf(edtprice1599.getText().toString());
					price2599 = Float.valueOf(edtprice2599.getText().toString());
				
					pricetop599 = (float) ((tend599 * price1599));
					priceunder599 =(float) ((tend599 * price2599));			
	
					totaltop599 = (float) (pricetop599 + 53.50);
					price_under599 = (float) (priceunder599 + 53.50);
					
					Intent add = new Intent(MainActivity.this, Second.class);
					add.putExtra("pricetop599", totaltop599);
					add.putExtra("priceunder599", priceunder599);
					add.putExtra("totaltop599", totaltop599);
					add.putExtra("price_under599", price_under599);
					add.putExtra("stroke", tend599);
					add.putExtra("price1", price1599);
					add.putExtra("price2", price2599);
					startActivity(add);
			
			}
		});
	}
	
	//private Float calculate(Float w1, Float w2){
	//	return (Float) (w1 + w2);
//	}


}
