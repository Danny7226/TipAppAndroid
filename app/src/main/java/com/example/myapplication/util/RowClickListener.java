package com.example.myapplication.util;

import android.view.View;

public interface RowClickListener {
    void onClick(View view, int i, String imageUrl, String name, String address, String categories, String price);
}