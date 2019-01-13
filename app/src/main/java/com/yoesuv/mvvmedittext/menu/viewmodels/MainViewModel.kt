package com.yoesuv.mvvmedittext.menu.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import android.util.Log
import android.view.View
import com.yoesuv.mvvmedittext.utils.bindings.BindableString
import java.lang.ref.WeakReference

class MainViewModel(application: Application, weakContext: WeakReference<Context>) : AndroidViewModel(application) {

    var nim: BindableString = BindableString()
    var nama: BindableString = BindableString()
    var jurusan: BindableString = BindableString()

    fun clickShowData(view: View){
        Log.d("result_debug", "MainViewModel # ${nim.get()}/${nama.get()} / ${jurusan.get()}")
    }

}