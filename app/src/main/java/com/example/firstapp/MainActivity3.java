package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageButton = (ImageButton) findViewById(R.id.skywardbladeButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkywardblade();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.aquilaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAquila();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.summitshaperButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSummitshaper();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.pjcButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPjc();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.freedomswornButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFreedomsworn();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.mistsplitterButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMistsplitter();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.skywardprideButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkywardpride();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.wgsButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWgs();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.unforgedButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUnforged();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.sobpButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSobp();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.redhornButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRedhorn();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.skywardspineButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkywardspine();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.pjwsButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPjws();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.vortexvanquisherButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVortexvanq();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.homaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHoma();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.calamityButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalamity();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.engulfingButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEngulfing();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.skywardatlusButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkywardatlus();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.lostprayerButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLostprayer();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.memoryButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMemoryofdust();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.moonglowButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoonglow();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kaguraverityButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKagura();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.skywardharpButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSkywardharp();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.amosbowButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAmosbow();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.elegyButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openElegy();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.thunderingpulseButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThunderingpulse();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.polarstarButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPolarstar();
            }
        });
    }
    public void openSkywardblade() {
        Intent intent = new Intent(this, skywardblade.class);
        startActivity(intent);
    }
    public void openAquila() {
        Intent intent = new Intent(this, aquilafavonia.class);
        startActivity(intent);
    }
    public void openSummitshaper() {
        Intent intent = new Intent(this, summitshaper.class);
        startActivity(intent);
    }
    public void openPjc() {
        Intent intent = new Intent(this, jadecutter.class);
        startActivity(intent);
    }
    public void openFreedomsworn() {
        Intent intent = new Intent(this, freedomsworn.class);
        startActivity(intent);
    }
    public void openMistsplitter() {
        Intent intent = new Intent(this, mistsplitter.class);
        startActivity(intent);
    }
    public void openSkywardpride() {
        Intent intent = new Intent(this, skywardpride.class);
        startActivity(intent);
    }
    public void openWgs() {
        Intent intent = new Intent(this, wgs.class);
        startActivity(intent);
    }
    public void openUnforged() {
        Intent intent = new Intent(this, unforged.class);
        startActivity(intent);
    }
    public void openSobp() {
        Intent intent = new Intent(this, sobp.class);
        startActivity(intent);
    }
    public void openRedhorn() {
        Intent intent = new Intent(this, redhorn.class);
        startActivity(intent);
    }
    public void openSkywardspine() {
        Intent intent = new Intent(this, skywardspine.class);
        startActivity(intent);
    }
    public void openPjws() {
        Intent intent = new Intent(this, pjws.class);
        startActivity(intent);
    }
    public void openVortexvanq() {
        Intent intent = new Intent(this, vortexvanquisher.class);
        startActivity(intent);
    }
    public void openHoma() {
        Intent intent = new Intent(this, homa.class);
        startActivity(intent);
    }
    public void openCalamity() {
        Intent intent = new Intent(this, calamityqueller.class);
        startActivity(intent);
    }
    public void openEngulfing() {
        Intent intent = new Intent(this, engulfing.class);
        startActivity(intent);
    }
    public void openSkywardatlus() {
        Intent intent = new Intent(this, skywardatluss.class);
        startActivity(intent);
    }
    public void openLostprayer() {
        Intent intent = new Intent(this, lostprayer.class);
        startActivity(intent);
    }
    public void openMemoryofdust() {
        Intent intent = new Intent(this, memoryofdust.class);
        startActivity(intent);
    }
    public void openMoonglow() {
        Intent intent = new Intent(this, moonglow.class);
        startActivity(intent);
    }
    public void openKagura() {
        Intent intent = new Intent(this, kaguraverity.class);
        startActivity(intent);
    }
    public void openSkywardharp() {
        Intent intent = new Intent(this, skywardharp.class);
        startActivity(intent);
    }
    public void openAmosbow() {
        Intent intent = new Intent(this, amosbow.class);
        startActivity(intent);
    }
    public void openElegy() {
        Intent intent = new Intent(this, elegy.class);
        startActivity(intent);
    }
    public void openThunderingpulse() {
        Intent intent = new Intent(this, thunderingpulse.class);
        startActivity(intent);
    }
    public void openPolarstar() {
        Intent intent = new Intent(this, polarstar.class);
        startActivity(intent);
    }
}