package com.example.profitlosscalculator599;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Second extends Activity {
	private float result1 , result2, result3, result4, result5, result6, result7, result8;
	private TextView txtres1, txtres2, txtres3, txtres4, txtres5, txtres6, txtres7, txtres8, txtres9, txtres10;
	Button btn1, btn2, btn3, btn4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		btn1 = (Button) findViewById(R.id.higher);
		btn2 = (Button) findViewById(R.id.lower);
		btn3 = (Button) findViewById(R.id.close);
		btn4 = (Button) findViewById(R.id.back);

			txtres1 = (TextView) findViewById(R.id.ansPriceTop);
			txtres2 = (TextView) findViewById(R.id.ansPriceUnder);
			txtres3 = (TextView) findViewById(R.id.totalpricetop);
			txtres4 = (TextView) findViewById(R.id.totalPriceUnder);
			txtres5 = (TextView) findViewById(R.id.textView3);
			txtres6 = (TextView) findViewById(R.id.textView8);
			txtres7 = (TextView) findViewById(R.id.priceTop);
			txtres8 = (TextView) findViewById(R.id.PriceUnder);
			txtres9 = (TextView) findViewById(R.id.text12);
			txtres10 = (TextView) findViewById(R.id.text22);
			
			Intent res = getIntent();
			result1 = res.getFloatExtra("pricetop599", result1);
			result2 = res.getFloatExtra("priceunder599", result2);
			result3 = res.getFloatExtra("totaltop599", result3);
			result4 = res.getFloatExtra("price_under599", result4);
			result5 = res.getFloatExtra("stroke", result5);
			result6 = res.getFloatExtra("stroke", result6);
			result7 = res.getFloatExtra("price1", result7);
			result8 = res.getFloatExtra("price2", result8);
			
			txtres1.setText(""+result1);
			txtres2.setText(""+result2);
			txtres3.setText(""+result3);
			txtres4.setText(""+result4);
			txtres5.setText(""+result5);
			txtres6.setText(""+result6);
			txtres7.setText(""+result7);
			txtres8.setText(""+result8);
			
			btn1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					result7 = (float) (result7 + 0.02);
					txtres9.setText(""+result7);
				}
			});
			
			btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					result8 = (float) (result8 + 0.02);
					txtres10.setText(""+result8);
				}
			});
			
			btn3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				 //System.exit();
				}
			});
			
			btn4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getApplicationContext(), MainActivity.class);
					startActivity(intent);
				}
			});
	}
}