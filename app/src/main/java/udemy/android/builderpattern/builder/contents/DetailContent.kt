package udemy.android.builderpattern.builder.contents

import android.view.ViewGroup
import udemy.android.builderpattern.R

class DetailContent : Content() {

    override fun textSize(): Int  = 12

    override fun content(): Int = R.string.long_txt

    override fun padding(): IntArray =  intArrayOf(16,16,16,16)

    override fun layoutparams(): ViewGroup.LayoutParams {
        val width: Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height: Int = ViewGroup.LayoutParams.MATCH_PARENT
        return ViewGroup.LayoutParams(width, height)
    }
}