package com.example.newby.DataHolder

import java.io.Serializable

class SampleData(var name:String,var age:Int):Serializable  {

    override fun toString(): String {
        return "name:"+name+
                "\'" +
        " age:"+age
    }

}