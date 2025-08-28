package com.raccoon.simpleboard.controller.dto

data class PostUpdateRequest(
    val title: String,
    val content: String,
    val createdBy: String,
)
