package com.example.newby.DataHolder

import java.io.Serializable

class SecondData( var str:String,var num:Int):Serializable {

    override fun toString(): String {
        return "place:"+ str +
            "\' quantity"+num
    }

}