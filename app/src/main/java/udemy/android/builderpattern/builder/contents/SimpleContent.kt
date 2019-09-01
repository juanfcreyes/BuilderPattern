package udemy.android.builderpattern.builder.contents

import android.view.ViewGroup
import udemy.android.builderpattern.R

class SimpleContent : Content() {

    override fun textSize(): Int = 14

    override fun content(): Int = R.string.short_txt

    override fun padding(): IntArray = intArrayOf(16,16,16,16)

    override fun layoutparams(): ViewGroup.LayoutParams {
        val width: Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height: Int = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }
}