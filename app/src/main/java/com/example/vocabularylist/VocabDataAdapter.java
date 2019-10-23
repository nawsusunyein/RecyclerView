package com.example.vocabularylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VocabDataAdapter extends RecyclerView.Adapter<VocabDataViewHolder> {

    List<VocabDataModel> vocabList;
    Context context;

    VocabDataAdapter(List<VocabDataModel> vocabList,Context context){
        this.vocabList = vocabList;
        this.context = context;
    }

    @NonNull
    @Override
    public VocabDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View vocabView = inflater.inflate(R.layout.vocab_card,parent,false);
        VocabDataViewHolder vocabDataViewHolder = new VocabDataViewHolder(vocabView);

        return vocabDataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VocabDataViewHolder holder, int position) {
        holder.cnWord.setText(vocabList.get(position).cnWord);
        holder.pinyinWord.setText(vocabList.get(position).pinyinWord);
        holder.enWord.setText(vocabList.get(position).enWord);
    }

    @Override
    public int getItemCount() {
        return vocabList.size();
    }
}
