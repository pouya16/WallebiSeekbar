package com.app.wallebiseekbar

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class WallebiSeekbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): View(context,attrs,defStyleAttr){

    private var isSelectable = false
    private var percent = 0.0f
    private var dotNumbers = 1
    private var dotSize = 12

    init {

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)


    }




}