package com.example.sangredeespartano;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class TableDynamic {
    private TableLayout tableLayout;
    private Context context;
    private String[] header;
    private ArrayList<String[]> data;
    private TableRow tableRow;
    private TextView textCell;
    private int indexC;
    private int indexR;

    public TableDynamic(TableLayout tab,Context cont){
        this.tableLayout=tab;
        this.context=cont;
    }
    public void addHeader(String[]header){
        this.header=header;
        createHeader();
    }
    public void addData(ArrayList<String[]>data){
        this.data=data;
        createDataTable();
    }
    public void newRow(){
        tableRow=new TableRow(context);
    }
    public void newCell(){
        textCell=new TextView(context);
        textCell.setGravity(Gravity.CENTER);
        textCell.setTextColor(Color.WHITE);
        textCell.setTextSize(18);
    }
    private void createHeader(){
        indexC=0;
        newRow();
        while(indexC< header.length){
            newCell();
            textCell.setText(header[indexC++]);
            textCell.setTextColor(Color.RED);
            tableRow.addView(textCell,newTableRowParams());
        }
        tableLayout.addView(tableRow);
    }

    private void createDataTable(){

        for(indexR=1;indexR<=data.size();indexR++){
            newRow();
            for(indexC=0;indexC<header.length;indexC++){
                newCell();
                String[] fila=data.get(indexR-1);
                textCell.setText(fila[indexC]);
                textCell.setTextColor(Color.WHITE);
                tableRow.addView(textCell,newTableRowParams());
            }
            tableLayout.addView(tableRow);
        }
    }

    private TableRow.LayoutParams newTableRowParams(){
        TableRow.LayoutParams params=new TableRow.LayoutParams();
        params.setMargins(1,1,1,1);
        params.weight=1;
        return params;
    }

}
