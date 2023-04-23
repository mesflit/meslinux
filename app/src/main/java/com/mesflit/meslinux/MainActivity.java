package com.mesflit.meslinux;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.mesflit.meslinux.databinding.ActivityMainBinding;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        // Inflate and get instance of binding
		binding = ActivityMainBinding.inflate(getLayoutInflater());
        // set content view to binding's root
        setContentView(binding.getRoot());
        //Button
        Button gentooButton = findViewById(R.id.gentoo);
        Button kaliButton = findViewById(R.id.kalilinux);
        
        
        

        kaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "wget https://raw.githubusercontent.com/mesflit/proot-distro/main/kaliinstaller.sh; chmod +x kaliinstaller.sh; ./kaliinstaller.sh; rm -rf kaliinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        
        
        gentooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "wget https://raw.githubusercontent.com/mesflit/proot-distro/main/gentooinstaller.sh; chmod +x gentooinstaller.sh; ./gentooinstaller.sh; rm -rf gentooinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
    }
}
