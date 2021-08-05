package com.jude.appstorepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jude.appstorepractice.ui.main.GithubInfo
import com.jude.appstorepractice.ui.main.MainFragment
import com.jude.appstorepractice.ui.main.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        RetrofitBuilder.githubApi.getGithubInfo().enqueue(object : Callback<GithubInfo> {

            override fun onResponse(call: Call<GithubInfo>, response: Response<GithubInfo>) {
                val userInfo = response.body()

                Log.d("RetrofitBuilder response","통신 성공" + userInfo?.name)

            }

            override fun onFailure(call: Call<GithubInfo>, t: Throwable) {
                Log.d("RetrofitBuilder error", t.message.toString())
            }
        })
    }
}