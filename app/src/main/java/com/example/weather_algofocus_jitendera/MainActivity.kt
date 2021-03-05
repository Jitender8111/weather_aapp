package com.example.weather_algofocus_jitendera

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val CITY:String="Delhi,"
        val API:String="a1ceec6d5ba6e8300dc97985ddec79ad"
        val ApiTwo:String="http://api.openweathermap.org/data/2.5/weather?q=delhi&appid=a1ceec6d5ba6e8300dc97985ddec79ad"

       val textF1 :List<String> = listOf("Tommorow","sunday","monday","tuseday","wensday","friday","saturday")
        val textF2 :List<String> = listOf("17 /","15 /","16 /","14 /","16 /","17 /","15 /")
        val textF3 :List<String> = listOf("32°C ","33°C ","34°C ","32°C ","35°C ","33°C ","32°C ")
        rcyview.adapter=adapter(textF1,textF2,textF3)
        rcyview.layoutManager = LinearLayoutManager(this)

        BottomSheetBehavior.from(fmBottomSheet).apply {
             peekHeight=400
            this.state=BottomSheetBehavior.STATE_COLLAPSED
             //lnr.setBackgroundColor(255)
        }
      
        /*img1.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)

        }.withEndAction{
            img1.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }

        }.start()*/
          val img =img1.background as AnimationDrawable // use for image change by one by one
          img.start()

        actionOnImage()
    }
    fun actionOnImage(){
        imgg1.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg1.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()



        //---------------------------------------------------------------------
        imgg2.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg2.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()

        //---------------------------------------------------------------------
        imgg3.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg3.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()

        //---------------------------------------------------------------------
        imgg4.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg4.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()

        //---------------------------------------------------------------------
        imgg5.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg5.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()

        //---------------------------------------------------------------------
        imgg6.animate().apply {
            duration=1000
            alpha(.5f)
            scaleXBy(0.5f)
            scaleYBy(0.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction{
            imgg6.animate().apply {
                duration=1000
                alpha(1f)
                scaleXBy(-0.5f)
                scaleYBy(-0.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }
        }.start()

        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

    }

}
