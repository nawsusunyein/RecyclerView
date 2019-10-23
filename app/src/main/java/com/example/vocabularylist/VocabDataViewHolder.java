package com.example.vocabularylist;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.recyclerview.widget.RecyclerView;

public class VocabDataViewHolder extends RecyclerView.ViewHolder{

    TextView cnWord;
    TextView pinyinWord;
    TextView enWord;

    VocabDataViewHolder(View itemView){
        super(itemView);
        cnWord = (TextView) itemView.findViewById(R.id.txt_cnword);
        pinyinWord = (TextView) itemView.findViewById(R.id.txt_pinyinword);
        enWord = (TextView) itemView.findViewById(R.id.txt_enword);
    }
}
