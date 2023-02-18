package com.example.test12.openai

import com.example.test12.CompletionRequest
import com.example.test12.CompletionResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface OpenaiService {
    @POST("completions")
    suspend fun completions(
        @Header("Content-Type") contentType: String = "application/json",
        @Header("Authorization") apiKey: String,
        @Body request: CompletionRequest
    ): Response<CompletionResponse>
}