package com.example.religionapp.other

import java.io.DataInput
import java.io.InputStream
import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager

class ImplX509 : X509TrustManager {

    private val dataInput: DataInput? = null
    private val inputStream: InputStream? = null

    override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {
        TODO("Not yet implemented")
    }

    override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {
        TODO("Not yet implemented")
    }

    override fun getAcceptedIssuers(): Array<X509Certificate> {
        TODO("Not yet implemented")
    }
}