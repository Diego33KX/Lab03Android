package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rating_bar.*

class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        rb_ratingBar.rating = 2.5f
        rb_ratingBar.rating = .5f
        rateSubmit()
        rb_ratingBar.setOnRatingBarChangeListener{ ratingBar, rating, fromUser -> Toast.makeText(this,"Rate: ${rating}", Toast.LENGTH_SHORT).show()}

    }
    fun rateSubmit(){
        ratingSubmitButton.setOnClickListener{
            rb_ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser -> ratingDisplay.text = "Your Rate: ${rating}" }
        }
    }
}