package udemy.android.builderpattern


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import udemy.android.builderpattern.builder.LayoutBuilder
import udemy.android.builderpattern.builder.LayoutView

class MainActivity : AppCompatActivity() {
    lateinit var  textView: TextView
    lateinit var  linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configLinearLayout()
    }

    private fun configLinearLayout() {
        val width: Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height: Int = ViewGroup.LayoutParams.MATCH_PARENT
        linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.layoutParams = ViewGroup.LayoutParams(width, height)
        setContentView(linearLayout)
        addViews()
    }

    private fun addViews() {
        val builder = LayoutBuilder()
        val views : ArrayList<LayoutView> = builder.displayDetail()
        views.forEach {layoutView ->
            val params : ViewGroup.LayoutParams =  layoutView.layoutparams()
            textView = TextView(this)
            textView.setText(layoutView.content())
            textView.textSize = layoutView.textSize().toFloat()
            textView.setTextColor(layoutView.shading().shade())
            textView.setBackgroundResource(layoutView.shading().background())
            textView.layoutParams = params
            val padding: IntArray = layoutView.padding()
            textView.setPadding(dp(padding[0]), dp(padding[1]),
                dp(padding[2]), dp(padding[3]))
            linearLayout.addView(textView)
        }
    }

    private fun dp(px: Int) : Int {
        val scaleFactor: Float = resources.displayMetrics.density
        val numberOfRealPixels : Int =  (px + scaleFactor + 0.5f).toInt()
        Log.d("DP", "px: $px, dp: $scaleFactor, pixeles: $numberOfRealPixels")
        return numberOfRealPixels
    }


}
