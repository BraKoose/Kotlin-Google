package com.rsk.com.rsk.`100DaysOfGADs`.Day30

import java.lang.Exception


sealed class UserProfileResult{
    data class Success(val userProfile: UserProfileResult): UserProfileResult()
    data class Error (val message: String, val cause: Exception? = null):UserProfileResult()
}
