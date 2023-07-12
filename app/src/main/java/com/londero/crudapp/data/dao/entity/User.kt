package com.londero.crudapp.data.dao.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(

    @PrimaryKey(autoGenerate = true) var uid: Int? = null,
    @ColumnInfo(name ="full_name") var fullname: String?,
    @ColumnInfo(name = "email") var email: String?,
    @ColumnInfo(name = "phone") var phone: String?
) {

}