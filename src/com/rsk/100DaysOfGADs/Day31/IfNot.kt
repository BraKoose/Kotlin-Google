package com.rsk.com.rsk.`100DaysOfGADs`.Day31

data class ServiceConfig(val host:String, val port:Int)
fun createServiceConfig(): ServiceConfig{
    return ServiceConfig("api.domain.io", 9389)
}
