package example.com.spinner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by home on 31-Oct-18.
 */
class Cart :AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn.setOnClickListener {
            linearID.visibility= View.VISIBLE
        }
        hideBtn.setOnClickListener{
            linearID.visibility=View.GONE
        }

       // showBtn.
    }
}