package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageButton = (ImageButton) findViewById(R.id.jeanButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJean();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.dilucButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiluc();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.monaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMona();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.keqingButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKeqing();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.qiqiButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQiqi();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.ventiButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVenti();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kleeButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKlee();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.childeButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChilde();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.zhongliButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openZhongli();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.albedoButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlbedo();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.ganyuButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGanyu();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.xiaoButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openXiao();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.hutaoButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHutao();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.eulaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEula();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kazuhaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKazuha();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.ayakaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAyaka();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.yoimiyaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYoimiya();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.raidenButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRaidenshogun();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kokomiButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKokomi();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.ittoButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openItto();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.shenheButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShenhe();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.yaeButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYae();
            }
        });
    }

    public void openJean() {
        Intent intent = new Intent(this, jean.class);
        startActivity(intent);
    }
    public void openDiluc() {
        Intent intent = new Intent(this, diluc.class);
        startActivity(intent);
    }
    public void openMona() {
        Intent intent = new Intent(this, mona.class);
        startActivity(intent);
    }
    public void openKeqing() {
        Intent intent = new Intent(this, keqing.class);
        startActivity(intent);
    }
    public void openQiqi() {
        Intent intent = new Intent(this, qiqi.class);
        startActivity(intent);
    }
    public void openVenti() {
        Intent intent = new Intent(this, venti.class);
        startActivity(intent);
    }
    public void openKlee() {
        Intent intent = new Intent(this, klee.class);
        startActivity(intent);
    }
    public void openChilde() {
        Intent intent = new Intent(this, childe.class);
        startActivity(intent);
    }
    public void openZhongli() {
        Intent intent = new Intent(this, zhongli.class);
        startActivity(intent);
    }
    public void openAlbedo() {
        Intent intent = new Intent(this, albedo.class);
        startActivity(intent);
    }
    public void openGanyu() {
        Intent intent = new Intent(this, ganyu.class);
        startActivity(intent);
    }
    public void openXiao() {
        Intent intent = new Intent(this, xiao.class);
        startActivity(intent);
    }
    public void openHutao() {
        Intent intent = new Intent(this, hutao.class);
        startActivity(intent);
    }
    public void openEula() {
        Intent intent = new Intent(this, eula.class);
        startActivity(intent);
    }
    public void openKazuha() {
        Intent intent = new Intent(this, kazuha.class);
        startActivity(intent);
    }
    public void openAyaka() {
        Intent intent = new Intent(this, ayakaa.class);
        startActivity(intent);
    }
    public void openYoimiya() {
        Intent intent = new Intent(this, yoimiya.class);
        startActivity(intent);
    }
    public void openRaidenshogun() {
        Intent intent = new Intent(this, raidenshogun.class);
        startActivity(intent);
    }
    public void openKokomi() {
        Intent intent = new Intent(this, kokomi.class);
        startActivity(intent);
    }
    public void openItto() {
        Intent intent = new Intent(this, itto.class);
        startActivity(intent);
    }
    public void openShenhe() {
        Intent intent = new Intent(this, shenhe.class);
        startActivity(intent);
    }
    public void openYae() {
        Intent intent = new Intent(this, yae.class);
        startActivity(intent);
    }
}