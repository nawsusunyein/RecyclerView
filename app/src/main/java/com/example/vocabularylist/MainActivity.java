package com.example.vocabularylist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    VocabDataAdapter vocabDataAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<VocabDataModel> vocabList = new ArrayList<>();
        vocabList = getVocabData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        vocabDataAdapter = new VocabDataAdapter(vocabList,getApplication());
        recyclerView.setAdapter(vocabDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    private List<VocabDataModel> getVocabData(){

        List<VocabDataModel> vocabList = new ArrayList<>();
        vocabList.add(new VocabDataModel("苹果","ping(2) guo(3)","apple"));
        vocabList.add(new VocabDataModel("考试","kao(3) shi(4)","exam"));
        vocabList.add(new VocabDataModel("电脑","dian(4) nao(3)","laptop"));
        vocabList.add(new VocabDataModel("水","shui(3)","water"));
        vocabList.add(new VocabDataModel("火锅","huo(3) guo(1)","hot pot"));
        vocabList.add(new VocabDataModel("电视","dian(4) shi(4)","Television"));
        vocabList.add(new VocabDataModel("加油","jia(1) you(2)","Fighting"));
        vocabList.add(new VocabDataModel("油","you(2)","Oil"));
        vocabList.add(new VocabDataModel("有","you(3)","has,have"));
        vocabList.add(new VocabDataModel("又","you(4)","Again"));
        return vocabList;

    }
}
