package com.example.android.roomwordssample;

/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Activity for entering a card.
 */

public class NewCardActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.cardlistsql.REPLY";

    private  EditText mEditCardView;
    private  EditText mEditStrView;
    private  EditText mEditCmbtView;
    private  EditText mEditIntView;
    private  EditText mEditResView;
    private  EditText mEditPwrView;
    private  EditText mEditMgcView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_card);
        mEditCardView = findViewById(R.id.edit_card);
        mEditStrView = findViewById(R.id.edit_strength);
        mEditCmbtView = findViewById(R.id.edit_combat);
        mEditIntView = findViewById(R.id.edit_intelligence);
        mEditResView = findViewById(R.id.edit_resilience);
        mEditPwrView = findViewById(R.id.edit_power);
        mEditMgcView = findViewById(R.id.edit_magic);

        final Card inputCard = new Card();

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditCardView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String card = mEditCardView.getText().toString();
                    String str = mEditCardView.getText().toString();
                    Integer strI = Integer.parseInt(str);
                    String cmbt = mEditCardView.getText().toString();
                    Integer cmbtI = Integer.parseInt(cmbt);
                    String inte = mEditCardView.getText().toString();
                    Integer inteI = Integer.parseInt(inte);
                    String res = mEditCardView.getText().toString();
                    Integer resI = Integer.parseInt(res);
                    String pwr = mEditCardView.getText().toString();
                    Integer pwrI = Integer.parseInt(pwr);
                    String mgc = mEditCardView.getText().toString();
                    Integer mgcI = Integer.parseInt(mgc);

                    inputCard.setCardName(card);
                    inputCard.setStrength(strI);
                    inputCard.setCombat(cmbtI);
                    inputCard.setIntelligence(inteI);
                    inputCard.setResilience(resI);
                    inputCard.setPower(pwrI);
                    inputCard.setMagic(mgcI);

                    replyIntent.putExtra(EXTRA_REPLY, card);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}

