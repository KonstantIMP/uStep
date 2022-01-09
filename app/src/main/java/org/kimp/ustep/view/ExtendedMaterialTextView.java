package org.kimp.ustep.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;

import com.google.android.material.textview.MaterialTextView;

import org.kimp.ustep.R;

/**
 * TextView with ability to load font from resources
 */
public class ExtendedMaterialTextView extends MaterialTextView {
    public ExtendedMaterialTextView(@NonNull Context context) {
        super(context);
    }

    public ExtendedMaterialTextView(@NonNull Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ExtendedMaterialTextView, 0, 0);
        int resource = a.getResourceId(R.styleable.ExtendedMaterialTextView_localFontFamily, 0);
        if (resource != 0) setLocalFontFamily(resource);
    }

    public ExtendedMaterialTextView(@NonNull Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ExtendedMaterialTextView, 0, 0);
        int resource = a.getResourceId(R.styleable.ExtendedMaterialTextView_localFontFamily, 0);
        if (resource != 0) setLocalFontFamily(resource);
    }

    /**
     * Set font family by font.ttf id
     * @param fontID font's file id
     */
    public void setLocalFontFamily(int fontID) {
        Typeface tf = getResources().getFont(fontID);
        setTypeface(tf);
    }
}
