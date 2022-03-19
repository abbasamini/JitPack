package com.abbasamini.testmodule

import android.content.Context
import android.widget.Toast

class ToastClass {
    public fun showMessage(context:Context ,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }
}