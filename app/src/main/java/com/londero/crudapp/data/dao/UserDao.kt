package com.londero.crudapp.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.londero.crudapp.data.dao.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user order by full_name desc")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WhERE full_name LIKE '%' || :search || '%'")
    fun searchByName(search: String): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM user WHERE uid = :uid")
    fun get(uid: Int) : User

    @Update
    fun update(user: User)
}