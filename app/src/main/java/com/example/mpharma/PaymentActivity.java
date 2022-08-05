package com.example.mpharma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PaymentActivity extends AppCompatActivity {

     Button paymentBtn;
    FirebaseAuth auth;
    FirebaseFirestore firestore;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        auth = FirebaseAuth.getInstance();
        firestore= FirebaseFirestore.getInstance();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        paymentBtn = findViewById(R.id.pay_btn);

        paymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentActivity.this, MainActivity2.class));
            }
        });

//        List<MyCartModel> list = (ArrayList<MyCartModel>) getIntent().getSerializableExtra("itemList");
//
//        if (list != null && list.size() > 0){
//            for (MyCartModel model : list){
//                final HashMap<String,Object> cartMap = new HashMap<>();
//
//                cartMap.put("productName",model.getProductName());
//                cartMap.put("productPrice",model.getProductPrice());
//                cartMap.put("CurrentDate",model);
//                cartMap.put("currentTime",model);
//                cartMap.put("totalQuantity",model.getTotalQuantity());
//                cartMap.put("totalPrice",model.getTotalPrice());
//
//                firestore.collection("CurrentUser").document(auth.getCurrentUser().getUid())
//                        .collection("MyOrder").add(cartMap).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
//                    @Override
//                    public void onComplete(@NonNull Task<DocumentReference> task) {
//
//                        Toast.makeText(PaymentActivity.this, "Your Order Has Been Placed", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//            }
//        }




    }

    private void paymentMethod() {
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}