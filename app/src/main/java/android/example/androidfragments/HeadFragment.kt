package android.example.androidfragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import java.util.*

class HeadFragment : Fragment(R.layout.head_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var imageView = view.findViewById<ImageView>(R.id.imageView)
        var counter = 1
        var resID : Int
        imageView.setOnClickListener {
            if (counter > 13) counter = 1
            resID = resources.getIdentifier(
                "head$counter",
                "drawable",
                "android.example.androidfragments"
            )
            imageView.setImageResource(resID)
            counter++

        }

    }


}