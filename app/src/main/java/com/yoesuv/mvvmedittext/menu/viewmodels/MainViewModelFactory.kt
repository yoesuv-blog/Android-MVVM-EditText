package com.yoesuv.mvvmedittext.menu.viewmodels

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import java.lang.ref.WeakReference

class MainViewModelFactory(private val application: Application, private val weakContext: WeakReference<Context>): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return MainViewModel(application, weakContext) as T
    }
}