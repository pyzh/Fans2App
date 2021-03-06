package me.xana.fans.data.network.auth

/**
 * Project:  Fans2App
 * Author:   Xana Hopper(xanahopper@163.com)
 * Created:  2018/8/12 22:25
 */
data class ClientProvider(val clientKey: String, val clientSecret: String,
                          val authUrl: String, val requestUrl: String)
