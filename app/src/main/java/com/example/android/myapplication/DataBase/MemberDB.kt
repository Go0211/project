package com.example.android.myapplication.DataBase

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class MemberDB : RealmObject() {
    @PrimaryKey
    open var id: Int = 0
    open var password: String = ""
    open var defaultNum: Int = 0
}