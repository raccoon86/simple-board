package com.raccoon.simpleboard.controller

import com.raccoon.simpleboard.controller.dto.PostCreateRequest
import com.raccoon.simpleboard.controller.dto.PostDetailResponse
import com.raccoon.simpleboard.controller.dto.PostSearchRequest
import com.raccoon.simpleboard.controller.dto.PostSummaryResponse
import com.raccoon.simpleboard.controller.dto.PostUpdateRequest
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class PostController {
    @PostMapping("/posts")
    fun createPost(
        @RequestBody postCreateRequest: PostCreateRequest,
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePost(
        @RequestBody postUpdateRequest: PostUpdateRequest,
    ): Long {
        return 1L
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(
        @PathVariable id: Long,
        @RequestParam createdBy: String,
    ): Long {
        println(createdBy)
        return id
    }

    @GetMapping("/posts/{id}")
    fun getDetailPost(
        @PathVariable id: Long,
    ): PostDetailResponse {
        return PostDetailResponse(
            1L,
            "Title",
            "Content",
            "Author",
            LocalDateTime.now()
        )
    }

    @GetMapping("/posts")
    fun getPosts(
        pageable: Pageable,
        postSearch: PostSearchRequest,
    ): Page<PostSummaryResponse> {
        println("title ${postSearch.title}")
        println("createdBy ${postSearch.createdBy}")
        return Page.empty()
    }
}
