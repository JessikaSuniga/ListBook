package com.example.listsaga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class SagaAdapter extends BaseAdapter {
    private final Context context;
    private final List<Saga> sagas;

    public SagaAdapter(Context context, List<Saga> sagas) {
        this.context = context;
        this.sagas = sagas;
    }

    @Override
    public int getCount() {
        return sagas.size();
    }

    @Override
    public Object getItem(int position) {
        return sagas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_saga, parent, false);
        TextView texto = view.findViewById(R.id.txtSaga);
        ImageView img = view.findViewById(R.id.imgSaga);

        Saga saga = sagas.get(position);
        texto.setText(saga.nome);
        img.setImageResource(saga.img);

        return view;
    }
}
