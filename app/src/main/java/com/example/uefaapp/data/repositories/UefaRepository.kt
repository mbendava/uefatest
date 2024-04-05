package com.example.uefaapp.data.repositories

import com.example.uefaapp.data.api.NetworkResult
import com.example.uefaapp.data.api.UefaApi
import com.example.uefaapp.data.model.ClubApiResponse
import kotlinx.coroutines.flow.MutableStateFlow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UefaRepository(private val api: UefaApi) {
    val clubData = MutableStateFlow<NetworkResult<ClubApiResponse>>(NetworkResult.Initial())
    fun query(query: String) {
        clubData.value = NetworkResult.Loading()
        api.getClubData(query)
            .enqueue(object : Callback<ClubApiResponse> {
                override fun onResponse(
                    call: Call<ClubApiResponse>,
                    response: Response<ClubApiResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            clubData.value = NetworkResult.Success(it)
                        }
                    } else {
                        clubData.value = NetworkResult.Error(response.message())
                    }
                }

                override fun onFailure(call: Call<ClubApiResponse>, t: Throwable) {
                    t.localizedMessage?.let {
                        clubData.value = NetworkResult.Error(it)
                    }
                }
            })
    }
}