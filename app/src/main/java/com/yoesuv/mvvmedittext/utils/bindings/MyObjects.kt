package com.yoesuv.mvvmedittext.utils.bindings

object MyObjects {
    fun equals(a: Any?, b: Any?): Boolean {
        return a == b || a != null && a == b
    }
}