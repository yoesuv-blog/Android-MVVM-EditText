package com.yoesuv.mvvmedittext.menu.views

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yoesuv.mvvmedittext.R
import com.yoesuv.mvvmedittext.databinding.ActivityMainBinding
import com.yoesuv.mvvmedittext.menu.viewmodels.MainViewModel
import com.yoesuv.mvvmedittext.menu.viewmodels.MainViewModelFactory
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, MainViewModelFactory(application, WeakReference(this))).get(MainViewModel::class.java)
        binding.main = viewModel
    }
}
