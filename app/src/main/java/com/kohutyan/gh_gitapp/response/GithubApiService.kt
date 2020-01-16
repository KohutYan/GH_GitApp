package com.kohutyan.gh_gitapp.response

import android.widget.EditText
import com.kohutyan.gh_gitapp.R
import com.kohutyan.gh_gitapp.SearchAdapter
import kotlinx.android.synthetic.main.search_list_fragment.*
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApiService {

    @GET("search/repositories")
    fun search(@Query("q") query: String): Call<SearchResponse>

    companion object Factory {
        lateinit var item: List<Item>
        val adapter = SearchAdapter(item)
        fun create() {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build()

            val service = retrofit.create(GithubApiService::class.java)
            GlobalScope.launch(Dispatchers.IO) {
                val query = R.id.searchbar.toString()
                val call = service.search(query)
                withContext(Dispatchers.Main) {
                    call.enqueue(object : Callback<SearchResponse?> {
                        override fun onFailure(call: Call<SearchResponse?>, t: Throwable) {
                            println("Something wrong")
                        }

                        override fun onResponse(
                            call: Call<SearchResponse?>,
                            response: Response<SearchResponse?>
                        ) {
                            val body = response.body()

                            val items = body?.items

                            if (items != null) {
                                item = items
                            }

                            adapter.notifyDataSetChanged()
                        }
                    })
                }
            }
        }
    }
}