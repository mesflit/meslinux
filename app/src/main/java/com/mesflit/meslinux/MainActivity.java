package com.mesflit.meslinux;

import com.mesflit.meslinux.R;
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
import android.widget.ImageView;


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
        Button raspButton = findViewById(R.id.raspberrypi);
        Button voidButton = findViewById(R.id.voidlinuxglibc);
        Button b64dButton = findViewById(R.id.box64droid);
        Button coffeeButton = findViewById(R.id.coffee);
        
        
        kaliButton.setText("Install Kali Linux");
        gentooButton.setText("Install Gentoo Linux");

        kaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "apt update -y && apt install -y wget proot-distro; wget https://raw.githubusercontent.com/mesflit/proot-distro/main/kaliinstaller.sh; chmod +x kaliinstaller.sh; ./kaliinstaller.sh; rm -rf kaliinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        
        
        gentooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "apt update -y && apt install -y wget proot-distro; wget https://raw.githubusercontent.com/mesflit/proot-distro/main/gentooinstaller.sh; chmod +x gentooinstaller.sh; ./gentooinstaller.sh; rm -rf gentooinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        raspButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "apt update -y && apt install -y wget proot-distro; wget https://raw.githubusercontent.com/mesflit/proot-distro/main/raspberrypiinstaller.sh; chmod +x raspberrypiinstaller.sh; ./raspberrypiinstaller.sh; rm -rf raspberrypiinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        voidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "apt update -y && apt install -y wget proot-distro; wget https://raw.githubusercontent.com/mesflit/proot-distro/main/voidglibcinstaller.sh; chmod +x voidglibcinstaller.sh; ./voidglibcinstaller.sh; rm -rf voidglibcinstaller.sh;";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        b64dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToCopy = "curl -o install https://raw.githubusercontent.com/Ilya114/Box64Droid/main/scripts/install && chmod +x install && ./install";

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", textToCopy);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Open Termux And Paste", Toast.LENGTH_SHORT).show();

                

                }
            
        });
        
        
        coffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Uri uri = Uri.parse("https://www.buymeacoffee.com/mesflit"); 

                
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        
    }
}
