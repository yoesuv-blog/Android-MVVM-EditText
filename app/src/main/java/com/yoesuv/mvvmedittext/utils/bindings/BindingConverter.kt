package com.yoesuv.mvvmedittext.utils.bindings

import android.databinding.BindingAdapter
import android.databinding.ObservableField
import android.support.v7.widget.AppCompatEditText
import android.text.TextWatcher
import com.yoesuv.mvvmedittext.R

class BindingConverter {

    companion object {

        @BindingAdapter("text")
        @JvmStatic fun bindEditText(view: AppCompatEditText, observableString: ObservableField<String>){
            val pair = view.getTag(R.id.bound_observable) as Pair<*, *>?
            if (pair == null || pair.first != ObservableField<String>()){
                if (pair != null) {
                    view.removeTextChangedListener(pair.second as TextWatcher)
                }
                val watcher = object: MyTextWatcherAdapter(){
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        super.onTextChanged(s, start, before, count)
                        observableString.set(s?.toString())
                    }
                }
                view.setTag(R.id.bound_observable, Pair<ObservableField<String>, MyTextWatcherAdapter>(observableString, watcher))
                view.addTextChangedListener(watcher)
            }
            val newValue = observableString.get()
            if (view.text?.toString() != newValue) {
                view.setText(newValue)
            }

        }

    }

}