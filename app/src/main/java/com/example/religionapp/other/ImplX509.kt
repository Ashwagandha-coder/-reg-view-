package com.example.religionapp.other

import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager

class ImplX509 : X509TrustManager {

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