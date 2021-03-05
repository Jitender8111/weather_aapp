package com.example.weather_algofocus_jitendera

data class City(
val weather:Weather,
val main:Main,
val wind:Wind,
val deg: Deg,
val name:String
        ){

}

class Deg(
        val deg:Int
) {

}

class Wind(
        val speed:Float
) {

}

class Weather(
        val description:String
){

}
data class Main(
        val temp:Double,
        val humidity:Int
        ){

}