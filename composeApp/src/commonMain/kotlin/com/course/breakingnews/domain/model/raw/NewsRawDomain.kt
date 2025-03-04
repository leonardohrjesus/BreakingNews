package com.course.breakingnews.domain.model.raw


import com.course.breakingnews.domain.model.news.NewsDomain
import kotlinx.serialization.Serializable

@Serializable
data class NewsRawDomain(
    val newsDomains: List<NewsDomain>?,
    val status: String?,
    val totalResults: Int?
)