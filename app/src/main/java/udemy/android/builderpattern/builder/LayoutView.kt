package udemy.android.builderpattern.builder

import android.view.ViewGroup

interface LayoutView {

    fun textSize(): Int
    fun content(): Int
    fun shading(): Shading
    fun padding(): IntArray
    fun layoutparams() : ViewGroup.LayoutParams

}